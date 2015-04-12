package main.java.com.expensehead.form;

import java.util.Date;

public class TransactionData {

    private String username;
   
    private Date entryDate;
    
    private String discription;
    
    private int amount;

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

    /**
     * @return entryDate
     */
    public Date getEntryDate() {
        return entryDate;
    }

    /**
     * @param entryDate
     */
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    /**
     * @return discription
     */
    public String getDiscription() {
        return discription;
    }

    /**
     * @param discription
     */
    public void setDiscription(String discription) {
        this.discription = discription;
    }

    /**
     * @return amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

}
