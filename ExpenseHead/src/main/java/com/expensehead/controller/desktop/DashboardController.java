package com.expensehead.controller.desktop;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.expensehead.form.StickyNoteForm;
import com.expensehead.service.UtilityServices;

@Controller
public class DashboardController {

    @Autowired
    private UtilityServices utilityServices;

    @RequestMapping(value = { "/saveNotes" })
    @ResponseBody
    public Map<String,String> saveNotes(@RequestBody StickyNoteForm form, HttpServletRequest request) {
        Map<String,String> response = new HashMap<String,String>();
        int result = utilityServices.savenote(form, request);
        if (result >= 1) {
            response.put("success","true");
        } else {
            response.put("success","flase");
        }
        return response;
    }
    
    @RequestMapping(value = { "/getStickyNote" })
    @ResponseBody
    public String getStickyNote(@RequestBody String date,HttpServletRequest request){
        String message = null;
        message = utilityServices.getStickyNote(String.valueOf(request.getSession().getAttribute("userId")), date);
        return message;
    }
}
