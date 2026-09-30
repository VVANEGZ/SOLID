# apuntes — OPEN/CLOSED

Las entidades deben estar abiertas a extensión y cerradas a modificación: añadir una variante debería requerir una nueva implementación del contrato, sin cambiar el algoritmo que consume ese contrato.

## Ejercicio malo: bebidas con condicionales
En `ocp/src`, `Caja`, `GeneradorEtiqueta` y `VerificadorEdad` reconocen cada bebida mediante condicionales. Para agregar una bebida hay que editar varios lugares. `CalculadoraDescuento` también necesita nuevos condicionales para cada descuento.

Tus tipos agua, refresco, tepache y cerveza se conservaron. El tepache es una extensión local respecto al ejemplo refactorizado.

## Ejercicio bueno: refactorizado
En `../exercise02RefactorizadoJ/ocp-refactory/src`:
- `Bebida` define `calcularTotal()` y `requiereINE()`.
- `Agua`, `Refresco` y `Cerveza` implementan su comportamiento.
- `Descuento` define `aplicar(total)` y `getDescripcion()`.
- `SinDescuento` y `DescuentoNavidad` implementan las políticas.
- `Caja.cobrar` recorre bebidas, aplica el descuento y muestra el cambio.

Para agregar otra bebida se crea una subclase y se incluye en el arreglo de la aplicación. Para agregar un descuento se implementa la interfaz. El algoritmo de cobro no cambia.

## Cálculos del ejercicio
Se usa IVA de 16% y, en cerveza, un factor adicional de 1.25. Son reglas del ejemplo de clase.
Agua de 20 = 20; refresco de 25 = 29; cerveza de 30 = 43.50.
Subtotal = 92.50; descuento navideño de 10% = 83.25; con 100 de efectivo, cambio = 16.75.

La referencia tenía fórmulas inconsistentes y un main que no cobraba. Se completaron y corrigieron para que la versión buena haga la misma operación de venta. La verificación de INE se muestra como aviso; no hay captura ni validación real de identificación.

Referencia: [Open/Closed de Justin](https://github.com/omarruiz31/SOLID/tree/main/Open-Closed/Justin).
