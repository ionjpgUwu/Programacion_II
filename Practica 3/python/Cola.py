class Cola:
    def __init__(self, n):
        self.arreglo = []
        self.inicio = 0
        self.fin = -1
        self.n = n

    def insert(self, e):
        if self.isFull():
            print("Cola llena: no se puede insertar")
        else:
            self.fin += 1
            self.arreglo.append(e)
            print("Elemento añadido:", e)

    def remove(self):
        if self.isEmpty():
            print("Cola vacía: no se puede eliminar")
        else:
            e = self.arreglo[self.inicio]
            self.inicio += 1
            if self.isEmpty():
                self.arreglo = []
                self.inicio = 0
                self.fin = -1
            return e

    def peek(self):
        if self.isEmpty():
            print("Cola vacía: no se puede hacer peek")
        else:
            return self.arreglo[self.inicio]

    def isEmpty(self):
        return self.size() == 0

    def isFull(self):
        return self.size() == self.n

    def size(self):
        return self.fin - self.inicio + 1

cola = Cola(3)

cola.insert(10)
cola.insert(20)
cola.insert(30)

cola.insert(40)  

print("Primer elemento de la cola:", cola.peek())  

print("Elemento eliminado:", cola.remove())  
print("Elemento eliminado:", cola.remove())

print("Primer elemento de la cola:", cola.peek()) 

print("Elemento eliminado:", cola.remove())  

cola.remove()