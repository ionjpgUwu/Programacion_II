//Necesario instalar componentes .Jar de JFreeChart-1.0.1
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;

public class Linea {
    public Punto p1, p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public JPanel dibujarLinea() {
        XYSeries serie = new XYSeries("Línea");
        serie.add(p1.x, p1.y);
        serie.add(p2.x, p2.y);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(serie);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Línea",
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
        return "Linea(P1=" + p1 + ", P2=" + p2 + ")";
    }
}
