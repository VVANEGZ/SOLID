# Métodos de pago — Mateos

Ejemplo de polimorfismo de subtipo con MetodoPago, Tarjeta, PayPal y Contado. Caja usa el mismo contrato para validar y pagar. Los apuntes están en [explication01.md](explication01.md).

Desde esta carpeta:
```powershell
javac -encoding UTF-8 -d bin src/*.java
java -cp bin App
```

La tarjeta "123" falla a propósito; PayPal y contado pasan. Se conservaron tus nombres, montos y mensajes.

[Referencia](https://github.com/omarruiz31/SOLID/tree/main/Polimorfismo/Mateos).
