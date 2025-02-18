public class Punto {
    public float x;
    public float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] coordCartesianas() {
        return new float[]{x, y};
    }

    public double[] coordPolares() {
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.toDegrees(Math.atan2(y, x)); 
        return new double[]{r, theta};
    }

    @Override
    public String toString() {
        return "Punto(x=" + x + ", y=" + y + ")";
    }
    public static void main(String[] args) {
        Punto p = new Punto(3, 4);
        System.out.println(p); 
        
        float[] cartesianas = p.coordCartesianas();
        System.out.println("Cartesianas: (" + cartesianas[0] + ", " + cartesianas[1] + ")");

        double[] polares = p.coordPolares();
        System.out.println("Polares: (" + polares[0] + ", " + polares[1] + "°)");
    }
}
