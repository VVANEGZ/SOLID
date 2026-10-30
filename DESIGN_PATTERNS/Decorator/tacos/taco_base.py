from taco import Taco
""""Componente concreto base"""
class TacoBase (Taco):
    NOMBRE = ""
    PRECIO = 0
    CALORIAS = 0

    def descripcion(self) -> str:
        return self.NOMBRE
    
    def precio(self) -> float:
        return self.PRECIO
    
    def calorias(self) -> int:
        return self.CALORIAS