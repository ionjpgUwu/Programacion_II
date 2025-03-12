public class FiguraGeometrica {
    public double area(double lado) {
        return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
    }
    public double area(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }
    public double area(double base, double altura) {
        return (base * altura) / 2;
    }
    public double area(int base, int altura) {
        return base * altura;
    }
    public double area(double radio, boolean c) {
        return Math.PI * Math.pow(radio, 2);
    }
    public static void main(String[] args) {
        FiguraGeometrica a=new FiguraGeometrica();
        System.out.println("Área del hexágono: " + a.area(5.0));
        System.out.println("Área del trapecio: " + a.area(10.0, 6.0, 5.0));
        System.out.println("Área del triángulo: " + a.area(4.0, 3.0));
        System.out.println("Área del rectángulo: " + a.area(6, 4));
        System.out.println("Área del círculo: " + a.area(3.0,true));
    }
}