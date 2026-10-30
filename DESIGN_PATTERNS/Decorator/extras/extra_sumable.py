from Decorator.extras.extra_taco import ExtraTaco

class ExtraSumable(ExtraTaco):
    NOMBRE = ""
    PRECIO = 0.0
    CALORIAS = 0
    
    def descripcion(self) -> str:
        return self._taco.descripcion() + "+" + self.NOMBRE
    
    def precio(self) -> float:
        return self.taco.precio() + self.PRECIO
    
    def calorias(self) -> int:
        return self._taco_calorias() + self.CALORIAS