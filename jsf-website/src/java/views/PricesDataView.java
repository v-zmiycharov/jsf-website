/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import entities.Price;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
 
@ManagedBean(name = "pricesDataView")
@ViewScoped
public class PricesDataView implements Serializable {
     
    private List<Price> prices;
    
    @PostConstruct
    public void init() {
        prices = new ArrayList<>();
        prices.add(new Price("Двойна стая /за 1 възрастен/", 45, 40, 33, 28)); 
        prices.add(new Price("Двойна стая /за 1 възрастен + 1 дете/", 60, 52, 40, 32)); 
        prices.add(new Price("Двойна стая /за 1 възрастен +2 деца /", 75, 64, 47, 36)); 
        prices.add(new Price("Двойна стая /за 2 възрастни /", 74, 64, 50, 40));
        prices.add(new Price("Двойна стая /за 2 възрастни + 1 дете /", 89, 76, 57, 44)); 
        prices.add(new Price("Мансардна стая, /за 1 възрастен/", 50, 45, 38, 33));
        prices.add(new Price("Мансардна стая, /за 1 възрастен +1 дете /", 65, 57, 45, 37)); 
        prices.add(new Price("Мансардна стая, /за 1 възрастен + 2 деца/", 80, 69, 52, 41)); 
        prices.add(new Price("Мансардна стая, /за 2 възрастни/", 80, 70, 56, 46));
        prices.add(new Price("Мансардна стая, /за 2 възрастни+1 дете/", 95, 82, 63, 50));
        prices.add(new Price("Апартамент /за 1 възрастен /", 57, 52, 45, 40));
        prices.add(new Price("Апартамент /за 1 възрастен + 1 дете/", 72, 64, 52, 44)); 
        prices.add(new Price("Апартамент /за 1 възрастен + 2 деца /", 87, 76, 59, 48)); 
        prices.add(new Price("Апартамент /за 1 възрастен + 3 деца /", 102, 88, 66, 52)); 
        prices.add(new Price("Апартамент /за 2 възрастни/", 90, 80, 66, 56)); 
        prices.add(new Price("Апартамент /за 2 възрастни+1 дете/", 105, 92, 73, 60));
        prices.add(new Price("Апартамент /за 2 възрастни+2 деца/", 110, 94, 80, 64)); 
        prices.add(new Price("Апартамент /за 3 възрастни/", 116, 101, 80, 65));
    }
     
    public List<Price> getPrices() {
        return prices;
    }
}
