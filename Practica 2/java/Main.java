import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);

            Punto centro = new Punto(0, 0);
            Punto p1 = new Punto(-5, -5);
            Punto p2 = new Punto(5, 5);

            Circulo circulo = new Circulo(centro, 5);
            Linea linea = new Linea(p1, p2);
            frame.add(circulo.dibujarCirculo());
            //frame.add(linea.dibujarLinea());

            frame.setVisible(true);
        });
    }
}
