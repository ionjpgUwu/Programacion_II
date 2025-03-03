public class Pila {
    private long[] arreglo;
    private int top;
    private int n;

    public Pila(int n) {
        this.arreglo = new long[n];
        this.top = -1;
        this.n = n;
    }

    public void push(long e) {
        if (!isFull()) {
            top++;
            arreglo[top] = e;
            System.out.printf("Elemento añadido: %d\n", e);
        } else {
            System.out.println("Pila llena: no se puede insertar");
        }
    }

    public long pop() {
        if (!isEmpty()) {
            long elemento = arreglo[top];
            top--;
            System.out.printf("Elemento eliminado: %d\n", elemento);
            return elemento;
        } else {
            System.out.println("Pila vacía: no se puede eliminar");
            return -1;
        }
    }

    public long peek() {
        if (!isEmpty()) {
            return arreglo[top];
        } else {
            System.out.println("Pila vacía: no se puede hacer peek");
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == n - 1;
    }

    public static void main(String[] args) {
        Pila pila = new Pila(3);
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);
        System.out.println("Elemento en la cima: " + pila.peek());
        pila.pop();
        pila.pop();
        pila.pop();
        pila.pop();

    }
}