/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author pupil
 */
public class History {
    private Book book;
    private Reader riden;
    private Date givenDate;
    private Date returnDate;

    public History() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getRiden() {
        return riden;
    }

    public void setRiden(Reader riden) {
        this.riden = riden;
    }

    public Date getGivenDate() {
        return givenDate;
    }

    public void setGivenDate(Date givenDate) {
        this.givenDate = givenDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "History{" 
                + "\nbook=" + book.toString()
                + ",\n riden=" + riden.toString()
                + ",\n givenDate=" + givenDate.toString()
                + ",\n returnDate=" + returnDate 
                + "\n}";
    }
    
    
}
