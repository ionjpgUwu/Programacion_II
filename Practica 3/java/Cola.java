public class Cola {
    private long[] arreglo;
    private int inicio;
    private int fin;
    private int n;

    public Cola(int n) {
        this.arreglo = new long[n];
        this.inicio = 0;
        this.fin = -1;
        this.n = n;
    }

    public void insert(long e) {
        if (isFull()) {
            System.out.println("Cola llena: no se puede insertar");
        } else {
            fin++;
            arreglo[fin] = e;
            System.out.println("Elemento añadido: " + e);
        }
    }

    public long remove() {
        if (isEmpty()) {
            System.out.println("Cola vacía: no se puede eliminar");
            return -1;
        } else {
            long e = arreglo[inicio];
            inicio++;
            if (isEmpty()) {
                inicio = 0;
                fin = -1;
            }
            System.out.println("Elemento eliminado: " + e);
            return e;
        }
    }

    public long peek() {
        if (isEmpty()) {
            System.out.println("Cola vacía: no se puede hacer peek");
            return -1;
        } else {
            return arreglo[inicio];
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return size() == n;
    }

    public int size() {
        return fin - inicio + 1;
    }

    public static void main(String[] args) {
        Cola cola = new Cola(3);

        cola.insert(10);
        cola.insert(20);
        cola.insert(30);
        cola.insert(40);
        System.out.println("Primer elemento de la cola: " + cola.peek());

        cola.remove();
        cola.remove();
        cola.remove();
        cola.remove();


    }
}