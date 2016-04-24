/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class GalleryView {
    private List<String> hotelImages;
    private List<String> roomImages;
    private List<String> facilityImages;
    private List<String> natureImages;
    private List<String> funImages;
     
    @PostConstruct
    public void init() {
        hotelImages = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            hotelImages.add("hotel/" + formatTwoDigits(i) + ".jpg");
        }
        
        roomImages = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            roomImages.add("rooms/" + formatTwoDigits(i) + ".jpg");
        }
        
        facilityImages = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            facilityImages.add("facilities/" + formatTwoDigits(i) + ".jpg");
        }
        
        natureImages = new ArrayList<>();
        for (int i = 1; i <= 48; i++) {
            natureImages.add("nature/" + formatTwoDigits(i) + ".jpg");
        }
        
        funImages = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            funImages.add("fun/" + formatTwoDigits(i) + ".jpg");
        }
    }

    public List<String> getHotelImages() {
        return hotelImages;
    }

    public List<String> getRoomImages() {
        return roomImages;
    }

    public List<String> getFacilityImages() {
        return facilityImages;
    }

    public List<String> getNatureImages() {
        return natureImages;
    }

    public List<String> getFunImages() {
        return funImages;
    }
    
    private String formatTwoDigits(int input) {
        return String.format("%02d", input);
    }
}
