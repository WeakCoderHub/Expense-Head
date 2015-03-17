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

import com.expensehead.dao.UtilityDao;
import com.expensehead.form.StickyNoteForm;
import com.expensehead.model.StickyNote;
import com.expensehead.service.UtilityServices;

@Service
public class UtilityServicesImpl implements UtilityServices {

    @Autowired
    private UtilityDao utilityDao;

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
        String result = null ;
        String dateInString = date;
        Date selectedDate = null;
        try {

            selectedDate = formatter.parse(dateInString);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        
        List<String> messages = utilityDao.getStickyNote(id, formatter.format(selectedDate));
        result = messages.get(0);
        return result;
    }
    
    private int stringToInt(String str){
        int integer = 0;
        try{
            integer = Integer.parseInt(str);
        }catch(ClassCastException c){
            
        } 
        return integer;
    }

}
