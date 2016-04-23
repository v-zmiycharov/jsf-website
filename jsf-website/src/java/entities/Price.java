/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author valen
 */
public class Price {
    private String roomType;
    private double roomSpaBreakfast;
    private double roomSpa;
    private double roomBreakfast;
    private double room;

    /**
     * @return the roomType
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * @param roomType the roomType to set
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    /**
     * @return the roomSpaBreakfast
     */
    public double getRoomSpaBreakfast() {
        return roomSpaBreakfast;
    }

    /**
     * @param roomSpaBreakfast the roomSpaBreakfast to set
     */
    public void setRoomSpaBreakfast(double roomSpaBreakfast) {
        this.roomSpaBreakfast = roomSpaBreakfast;
    }

    /**
     * @return the roomSpa
     */
    public double getRoomSpa() {
        return roomSpa;
    }

    /**
     * @param roomSpa the roomSpa to set
     */
    public void setRoomSpa(double roomSpa) {
        this.roomSpa = roomSpa;
    }

    /**
     * @return the roomBreakfast
     */
    public double getRoomBreakfast() {
        return roomBreakfast;
    }

    /**
     * @param roomBreakfast the roomBreakfast to set
     */
    public void setRoomBreakfast(double roomBreakfast) {
        this.roomBreakfast = roomBreakfast;
    }

    /**
     * @return the room
     */
    public double getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(double room) {
        this.room = room;
    }
    
    public Price() {}
    
    public Price(String roomType, double roomSpaBreakfast, double roomSpa, double roomBreakfast, double room) {
        this.roomType = roomType;
        this.roomSpaBreakfast = roomSpaBreakfast;
        this.roomSpa = roomSpa;
        this.roomBreakfast = roomBreakfast;
        this.room = room;
    }
}
