/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author pupil
 */
public class Author {
    String name;
    String lastname;
    int year;
    int day;
    int month;
    
    public Author() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

        public int getMonth() {
        return year;
    }

    public void setMonth(int month) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Author{" 
                + "name=" + name
                + ", lastname=" + lastname 
                + ", year=" + year + ", day=" 
                + day + ", month=" + month 
                + '}';
    }

}

