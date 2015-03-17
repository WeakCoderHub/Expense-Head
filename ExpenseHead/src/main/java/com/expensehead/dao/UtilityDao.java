package com.expensehead.dao;

import java.util.ArrayList;

import com.expensehead.model.StickyNote;

/**
 * @author arunkumar
 * 
 */
public interface UtilityDao {

    /**
     * @param model
     * @return positive integer value if success otherwise negative .
     */
    public int saveStickyNote(StickyNote model);

    /**
     * @param userId
     * @return list of dates on which user has save a notes. 
     */
    public ArrayList<String> allStickyNotes(int userId);
    
    /**
     * @param userId
     * @param date List of messages at selected date ;
     */
    public ArrayList<String> getStickyNote(int userId , String date);
}
