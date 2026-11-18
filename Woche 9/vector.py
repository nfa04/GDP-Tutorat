# Schreiben Sie hier Ihre Lösung in Python:
import math

class Vektor3D:
    def __init__(self, x, y, z):
        self.x = x
        self.y = y
        self.z = z
    
    def laenge(self):
        return math.sqrt(self.x * self.x + self.y * self.y + self.z * self.z)
    
    def multiplizeMitSkalar(self, a):
        return Vektor3D(self.x * a, self.y * a, self.z * a)

    @staticmethod
    def addiereVektoren(vektor1, vektor2):
        resultat = Vektor3D(vektor1.x + vektor2.x, vektor1.y + vektor2.y, vektor1.z + vektor2.z)
        return resultat
y
v1 = Vektor3D(1, 2, 3)
v2 = Vektor3D(5, 6, 7)Vektor3D.addiereVektoren(v1, v2)

print(v1.laenge())
print(v1.multiplizeMitSkalar(2).y)
print(Vektor3D.addiereVektoren(v1, v2).x)