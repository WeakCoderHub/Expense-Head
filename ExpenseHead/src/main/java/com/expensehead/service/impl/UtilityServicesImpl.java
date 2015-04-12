package com.expensehead.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expensehead.dao.GroupDao;
import com.expensehead.dao.UserDao;
import com.expensehead.dao.UtilityDao;
import com.expensehead.form.GroupTransactionSummary;
import com.expensehead.form.GroupTransactionSummary.MemberSummary;
import com.expensehead.form.StickyNoteForm;
import com.expensehead.model.Group;
import com.expensehead.model.StickyNote;
import com.expensehead.model.User;
import com.expensehead.service.UtilityServices;
import com.expensehead.utils.ExpenseUtility;

@Service
public class UtilityServicesImpl implements UtilityServices {

    @Autowired
    private UtilityDao utilityDao;

    @Autowired
    UserDao userDao;

    @Autowired
    GroupDao groupDao;

    @Override
    @Transactional
    public int savenote(StickyNoteForm form, HttpServletRequest request) {
        StickyNote model = new StickyNote();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateInString = form.getDate();
        try {

            Date date = formatter.parse(dateInString);
            model.setDate(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }

        model.setUserId((Integer) request.getSession().getAttribute("userId"));
        model.setMessage(form.getMessage());
        return utilityDao.saveStickyNote(model);
    }

    @Override
    @Transactional
    public ArrayList<String> getAllStickyNoteDates(String userId) {

        int id = stringToInt(userId);
        return utilityDao.allStickyNotes(id);
    }

    @Override
    @Transactional
    public String getStickyNote(String userId, String date) {
        int id = stringToInt(userId);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String result = null;
        String dateInString = date;
        Date selectedDate = null;
        try {

            selectedDate = formatter.parse(dateInString);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<String> messages = utilityDao.getStickyNote(id, formatter.format(selectedDate));
        if (!messages.isEmpty()) {
            result = messages.get(0);
        }
        return result;
    }

    private int stringToInt(String str) {
        int integer = 0;
        try {
            integer = Integer.parseInt(str);
        } catch (ClassCastException c) {

        }
        return integer;
    }

    @Override
    @Transactional
    public GroupTransactionSummary getSummary(HttpServletRequest request) {
        int groupId = ExpenseUtility.getGroupIdFromSession(request);
        Group group = groupDao.getGroup(String.valueOf(groupId));
        int totalExpense = groupDao.getTotalExpense(groupId);
        return createGroupTransactionSummary(group,totalExpense);
    }

    private GroupTransactionSummary createGroupTransactionSummary(Group group,int totalExpense) {
        GroupTransactionSummary groupTransactionSummary = new GroupTransactionSummary();
        List<MemberSummary> listOfMembers = new ArrayList<MemberSummary>();
        groupTransactionSummary.setTotalDeposits(group.getTotalDeposits());
        groupTransactionSummary.setBalance(group.getDepositsLeft());
        groupTransactionSummary.setExpenses(totalExpense);

        List<User> users = group.getUsers();
        for (User user : users) {
            GroupTransactionSummary.MemberSummary memberSummary = groupTransactionSummary.new MemberSummary();
            memberSummary.setMemberName(user.getUserName());
            memberSummary.setPayable(user.getPayable());
            memberSummary.setPayback(user.getReceivable());
            listOfMembers.add(memberSummary);
        }
        groupTransactionSummary.setMemberSummary(listOfMembers);
        return groupTransactionSummary;

    }

}
