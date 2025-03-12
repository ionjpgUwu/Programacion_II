import math

class FiguraGeometrica:

    def area(self, figura, *args):
        if figura == 'H':
            return (3 * math.sqrt(3) * args[0]**2) / 2
        elif figura == 'T':
            return ((args[0] + args[1]) * args[2]) / 2
        elif figura == 'I':
            return (args[0] * args[1]) / 2
        elif figura == 'R':
            return args[0] * args[1]
        elif figura == 'C':
            return math.pi * args[0]**2
        return -1

figura = FiguraGeometrica()

print("Área del hexágono:", figura.area('H', 5.0))
print("Área del trapecio:", figura.area('T', 10.0, 6.0, 5.0))
print("Área del triángulo:", figura.area('I', 4.0, 3.0))
print("Área del rectángulo:", figura.area('R', 6, 4))
print("Área del círculo:", figura.area('C', 3.0))
