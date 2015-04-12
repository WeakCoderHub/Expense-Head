package com.expensehead.form;

import java.util.Date;

public class JournalData {
    
    private int credit;
    
    private int debit;
    
    private Date recordDate;
    
    private String username;

    /**
     * @return credit
     */
    public int getCredit() {
        return credit;
    }

    /**
     * @param credit
     */
    public void setCredit(int credit) {
        this.credit = credit;
    }

    /**
     * @return debit
     */
    public int getDebit() {
        return debit;
    }

    /**
     * @param debit
     */
    public void setDebit(int debit) {
        this.debit = debit;
    }

    /**
     * @return recordDate
     */
    public Date getRecordDate() {
        return recordDate;
    }

    /**
     * @param recordDate
     */
    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

}
