# OCP — ejemplo malo de Justin

El programa funciona, pero usa condicionales por bebida y descuento. Agregar variantes exige modificar clases existentes: esa es la infracción de OCP.

Desde esta carpeta:
```powershell
javac -encoding UTF-8 -d bin src/*.java
java -cp bin App
```

Tu ejemplo vende agua, refresco, tepache y cerveza a 25 de precio base. Subtotal esperado: 119.25; con descuento navideño: 107.325. double puede mostrar decimales adicionales por su representación binaria.

Apuntes y comparación: [apuntesOCP.md](../apuntesOCP.md).
[Referencia](https://github.com/omarruiz31/SOLID/tree/main/Open-Closed/Justin/OCP).
