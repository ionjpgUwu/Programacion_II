class Pila:
    def __init__(self,n):
        self.arreglo=[]
        self.top=-1
        self.n=n
    def push(self,e):
        if self.isFull():
            print("Pila Llena: Push() no posible")
        else:
            self.top+=1
            self.arreglo.append(e)
            print(f"Push(): [{e}] añadido a la pila")
    def pop(self):
        if self.isEmpty():
            print("Pila vacía: Pop() no posible")
        else:
            e=self.arreglo[self.top]
            self.top-=1
            print(f"pop(): [{e}] eliminado de la pila")
            return e

    def peek(self):
        if self.isEmpty():
            print("Pila vacía: Peek() no posible")
        else:
            return self.arreglo[self.top]
    def isEmpty(self):
        return self.top==-1
    def isFull(self):
        return self.top==self.n-1
    
    
pila = Pila(3)

pila.push(10)
pila.push(20)
pila.push(30)
pila.push(40)

print(pila.peek())

pila.pop()
pila.pop()
pila.pop()
pila.pop()