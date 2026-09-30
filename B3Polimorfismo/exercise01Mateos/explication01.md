# POLIMORFISMO APUNTES

Polimorfismo permite usar un mismo contrato con objetos que responden de maneras distintas.

## Ejercicio de Mateos: métodos de pago
`MetodoPago` declara `validar()` y `pagar(double monto)`. `Tarjeta`, `PayPal` y `Contado` implementan ese contrato. `Caja.cobrar` recibe un `MetodoPago`: valida y llama a pagar sin preguntar qué clase concreta recibió.

Esto es polimorfismo de subtipo. La llamada se resuelve en ejecución según el objeto. Una tarjeta necesita 16 caracteres; PayPal revisa que el correo tenga @; contado revisa el estado de los billetes. Son validaciones didácticas, no un procesamiento real de pagos.

En tu `App`, la tarjeta "123" es intencionalmente inválida: imprime tu mensaje de datos no válidos. PayPal y contado sí pasan. Para ver un pago con tarjeta puedes usar "1234567890123456".

## Clasificaciones
- **Ad hoc por sobrecarga:** mismo nombre de función u operador con distintas firmas.
- **Coerción:** conversión a un tipo compatible, por ejemplo int a double.
- **Universal de inclusión o subtipo:** usar una clase derivada mediante el contrato de su base.
- **Universal paramétrico:** escribir una plantilla genérica, como `MiVector<T>`.

Una sobreescritura implementa el método heredado con la misma firma; una sobrecarga ofrece firmas distintas. No son lo mismo.

Referencia: [Mateos](https://github.com/omarruiz31/SOLID/tree/main/Polimorfismo/Mateos).
