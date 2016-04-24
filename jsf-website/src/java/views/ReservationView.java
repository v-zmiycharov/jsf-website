/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartModel;

/**
 *
 * @author valen
 */
@ManagedBean(name = "reservationView")
public class ReservationView {
    private String name;
    private String phone;
    private String email;
    private Date dateFrom;
    private Date dateTo;
    private String roomKind;
    private int adultsCount;
    private int childrenCount;
    private boolean hasBreakfast;
    private boolean hasSPA;
    private String additionalInformation;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public String getRoomKind() {
        return roomKind;
    }

    public int getAdultsCount() {
        return adultsCount;
    }

    public int getChildrenCount() {
        return childrenCount;
    }

    public boolean isHasBreakfast() {
        return hasBreakfast;
    }

    public boolean isHasSPA() {
        return hasSPA;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public void setRoomKind(String roomKind) {
        this.roomKind = roomKind;
    }

    public void setAdultsCount(int adultsCount) {
        this.adultsCount = adultsCount;
    }

    public void setChildrenCount(int childrenCount) {
        this.childrenCount = childrenCount;
    }

    public void setHasBreakfast(boolean hasBreakfast) {
        this.hasBreakfast = hasBreakfast;
    }

    public void setHasSPA(boolean hasSPA) {
        this.hasSPA = hasSPA;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }
    
    @PostConstruct
    public void init() {
        adultsCount = 1;
        roomKind = "Двойна стая";
    }
    
    public String preview() {
        return "reservationsPreview";
    }
    
    public String finish() {
        return "reservationsFinish";
    }
}
