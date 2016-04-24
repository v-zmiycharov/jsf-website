/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;

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
}
