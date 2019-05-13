package com.zm.net.teaching.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "treasure_book")
public class TreasureBook {
    @Id
    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "user_login_id")
    private Integer userLoginId;

    @Column(name = "labels_id")
    private Integer labelsId;

    @Column(name = "book_question")
    private String bookQuestion;

    @Column(name = "book_answer")
    private String bookAnswer;

    @Column(name = "book_Release_time")
    private Date bookReleaseTime;

    @Column(name = "book_views_number")
    private Integer bookViewsNumber;

    /**
     * @return book_id
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * @param bookId
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * @return user_login_id
     */
    public Integer getUserLoginId() {
        return userLoginId;
    }

    /**
     * @param userLoginId
     */
    public void setUserLoginId(Integer userLoginId) {
        this.userLoginId = userLoginId;
    }

    /**
     * @return labels_id
     */
    public Integer getLabelsId() {
        return labelsId;
    }

    /**
     * @param labelsId
     */
    public void setLabelsId(Integer labelsId) {
        this.labelsId = labelsId;
    }

    /**
     * @return book_question
     */
    public String getBookQuestion() {
        return bookQuestion;
    }

    /**
     * @param bookQuestion
     */
    public void setBookQuestion(String bookQuestion) {
        this.bookQuestion = bookQuestion;
    }

    /**
     * @return book_answer
     */
    public String getBookAnswer() {
        return bookAnswer;
    }

    /**
     * @param bookAnswer
     */
    public void setBookAnswer(String bookAnswer) {
        this.bookAnswer = bookAnswer;
    }

    /**
     * @return book_Release_time
     */
    public Date getBookReleaseTime() {
        return bookReleaseTime;
    }

    /**
     * @param bookReleaseTime
     */
    public void setBookReleaseTime(Date bookReleaseTime) {
        this.bookReleaseTime = bookReleaseTime;
    }

    /**
     * @return book_views_number
     */
    public Integer getBookViewsNumber() {
        return bookViewsNumber;
    }

    /**
     * @param bookViewsNumber
     */
    public void setBookViewsNumber(Integer bookViewsNumber) {
        this.bookViewsNumber = bookViewsNumber;
    }
}