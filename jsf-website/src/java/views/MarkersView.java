/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;
 
@ManagedBean
public class MarkersView implements Serializable {
    
    private MapModel simpleModel;
  
    @PostConstruct
    public void init() {
        simpleModel = new DefaultMapModel();
          
        //Shared coordinates
        LatLng coord1 = new LatLng(41.952317,24.37127);
          
        //Basic marker
        simpleModel.addOverlay(new Marker(coord1, "Хотел Борѝка"));
    }
  
    public MapModel getSimpleModel() {
        return simpleModel;
    }
}
