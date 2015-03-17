package com.expensehead.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stickynote", catalog = "expenseheaddb")
public class StickyNote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stickyNoteId")
    private int stickyNoteId;

    @Column(name = "userId")
    private int userId;

    @Column(name = "date")
    private String date;

    @Column(name = "message")
    private String message;

    /*
     * @ManyToOne
     * 
     * @JoinColumn(name = "userId") private User user;
     */

    public int getstickyNoteId() {
        return stickyNoteId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setstickyNoteId(int stickyNoteId) {
        this.stickyNoteId = stickyNoteId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
