import matplotlib
matplotlib.use('TkAgg')
import matplotlib.pyplot as plt
import math

class Punto:
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

    def coord_cartesianas(self):
        return (self.x, self.y)

    def coord_polares(self):
        r = math.sqrt(self.x**2 + self.y**2)
        theta = math.atan2(self.y, self.x)
        return (r, math.degrees(theta))  

    def __str__(self):
        return f"Punto(x={self.x}, y={self.y})"

