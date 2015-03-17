package com.expensehead.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.expensehead.form.StickyNoteForm;

/**
 * @author arunkumar
 * 
 *         UtilityService is use to create services which are not part of core functionality but use some other purpose .
 */
public interface UtilityServices {

    /**
     * @param form
     * @param HttpServletRequest
     * @return 1 if success otherwise 0
     */
    public int savenote(StickyNoteForm form, HttpServletRequest request);
    
    /**
     * @param userId
     * @return list of dates on which user has save a notes
     */
    public ArrayList<String> getAllStickyNoteDates(String userId);
    
    /**
     * @param userId
     * @param date
     * @return messages on given date 
     */
    public String getStickyNote(String userId,String date);
}
 