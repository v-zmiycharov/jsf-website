/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.joda.time.*;

/**
 *
 * @author valentin.zmiycharov
 */
@ManagedBean(name = "PersonBean")
@SessionScoped
public class person {

    /**
     * Creates a new instance of person
     */
    public person() {
    }
    
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public int checkMyYears() {
        LocalDate birthdate = new LocalDate(this.year, this.month, this.day);
        LocalDate now = new LocalDate();
        Years age = Years.yearsBetween(birthdate, now);
        
        //invalidate user session
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        session.invalidate();
        
        return age.getYears();
    }
}
