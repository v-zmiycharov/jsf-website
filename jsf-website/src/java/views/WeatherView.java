/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.ChartSeries;

@ManagedBean
public class WeatherView implements Serializable {

    private LineChartModel temperatureModel;

    public LineChartModel getTemperatureModel() {
        return temperatureModel;
    }

    @PostConstruct
    public void init() {
        temperatureModel = new LineChartModel();

        ChartSeries lowest = new ChartSeries();
        lowest.setLabel("Най-ниска температура (градуси по Целзий)");
        lowest.set("Януари", -20);
        lowest.set("Февруари", -18);
        lowest.set("Март", -12);
        lowest.set("Април", -5);
        lowest.set("Май", 2);
        lowest.set("Юни", 2);
        lowest.set("Юли", 7);
        lowest.set("Август", 10);
        lowest.set("Септември", 1);
        lowest.set("Октомври", -5);
        lowest.set("Ноември", -6);
        lowest.set("Декември", -14);

        ChartSeries highest = new ChartSeries();
        highest.setLabel("Най-висока температура (градуси по Целзий)");
        highest.set("Януари", 6);
        highest.set("Февруари", 8);
        highest.set("Март", 13);
        highest.set("Април", 15);
        highest.set("Май", 21);
        highest.set("Юни", 25);
        highest.set("Юли", 30);
        highest.set("Август", 33);
        highest.set("Септември", 27);
        highest.set("Октомври", 19);
        highest.set("Ноември", 13);
        highest.set("Декември", 7);

        temperatureModel.addSeries(lowest);
        temperatureModel.addSeries(highest);

        temperatureModel.setTitle("Климат");
        temperatureModel.setLegendPosition("e");
        temperatureModel.setShowPointLabels(true);
        temperatureModel.getAxes().put(AxisType.X, new CategoryAxis("Месеци"));
        Axis yAxis = temperatureModel.getAxis(AxisType.Y);
        yAxis.setLabel("Градуси по Целзий");
        yAxis.setMin(-20);
        yAxis.setMax(35);
    }

}
