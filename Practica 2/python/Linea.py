import matplotlib
matplotlib.use('TkAgg')
import matplotlib.pyplot as plt
from Punto import Punto 

class Linea:
    def __init__(self, p1: Punto, p2: Punto):
        self.p1 = p1
        self.p2 = p2

    def dibuja_linea(self):
        fig, ax = plt.subplots()

        ax.plot([self.p1.x, self.p2.x], [self.p1.y, self.p2.y]) 

        ax.set_xlim(min(self.p1.x, self.p2.x) - 2, max(self.p1.x, self.p2.x) + 2)
        ax.set_ylim(min(self.p1.y, self.p2.y) - 2, max(self.p1.y, self.p2.y) + 2)
        plt.grid()

        plt.show()

    def __str__(self):
        return f"Linea(P1={self.p1}, P2={self.p2})"
p1 = Punto(0, 0)
p2 = Punto(5, 5)
linea = Linea(p1, p2)
print(linea)
linea.dibuja_linea()
