//Necesario instalar componentes .Jar de JFreeChart-1.0.1
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;

public class Circulo {
    public Punto centro;
    public float radio;

    public Circulo(Punto c, float r) {
        this.centro = c;
        this.radio = r;
    }

    public JPanel dibujarCirculo() {
        XYSeries serie = new XYSeries("Círculo");

        for (double t = 0; t <= 360; t += 1) {
            double radianes = Math.toRadians(t);
            double x = centro.x + radio * Math.cos(radianes);
            double y = centro.y + radio * Math.sin(radianes);
            serie.add(x, y);
        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(serie);

        JFreeChart chart = ChartFactory.createScatterPlot(
                "Círculo",
                "X",
                "Y",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                false,
                false
        );

        return new ChartPanel(chart);
    }

    @Override
    public String toString() {
        return "Circulo(Centro=" + centro + ", Radio=" + radio + ")";
    }
}
