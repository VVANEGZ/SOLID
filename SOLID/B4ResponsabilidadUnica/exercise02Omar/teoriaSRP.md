# APUNTES SINGLE RESPONSABILITY

Una clase debe tener una sola razón para cambiar. No significa que solo pueda tener un método: sus métodos deben atender una responsabilidad coherente.

## Omar: suscripciones del club deportivo
**Malo: `SRP.ts`.** `Cliente` valida datos, simula almacenamiento, calcula precios, genera facturas y envía mensajes. Un cambio en cualquiera de esas políticas obliga a modificar la misma clase.

**Bueno: `SRP-refactory.ts`.**
- `User` conserva los datos del usuario.
- `Validadora` revisa nombre, edad y correo.
- `Facturadora` calcula el precio y genera una factura.
- `ServicioCorreo` simula el correo.
- `RepositorioBD` simula el almacenamiento.
- `ServicioDeportivo` coordina el registro.

La coordinación puede llamar a varias clases y seguir teniendo una única responsabilidad. En la versión completada se valida antes de guardar, se genera la factura y se usa al enviar la bienvenida. No hay conexión real a una base de datos ni envío real de correo.

Tus ejemplos usan planes y nombres distintos entre versiones; se conservaron. Los precios no necesitan ser idénticos para explicar SRP.

## Pakito: Mario
En `SRP.rb`, las clases mutantes mezclan puntos o salud con sonido. En `FIXSRP.rb`, audio, puntuación, poderes y salud tienen clases separadas. Ambas versiones deben ejecutarse: "malo" significa mal diseño para el principio, no código que no compila.

Referencia: [responsabilidad única](https://github.com/omarruiz31/SOLID/tree/main/Single-Responsibility).
