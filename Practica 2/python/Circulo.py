import matplotlib
matplotlib.use('TkAgg')
import matplotlib.pyplot as plt
from Punto import Punto  

class Circulo:
    def __init__(self, c: Punto, r: float):
        self.centro = c
        self.radio = r

    def dibuja_circulo(self):
        fig, ax = plt.subplots()
        circulo = plt.Circle((self.centro.x, self.centro.y), self.radio, color='r', fill=False)
        ax.add_patch(circulo)

        ax.plot(self.centro.x, self.centro.y, 'ro')  

        ax.set_xlim(self.centro.x - self.radio - 10, self.centro.x + self.radio + 10)
        ax.set_ylim(self.centro.y - self.radio - 10, self.centro.y + self.radio + 10)
        ax.set_aspect('equal')  
        plt.grid()

        plt.show()

    def __str__(self):
        return f"Circulo(Centro={self.centro}, Radio={self.radio})"

p = Punto(0, 0)
c = Circulo(p, 20)
c.dibuja_circulo()
