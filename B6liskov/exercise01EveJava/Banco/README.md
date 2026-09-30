# Banco de Eve — ejemplo malo de Liskov

LSP dice que un objeto de una subclase debe poder usarse donde se espera su clase base sin romper el contrato que utiliza el cliente.

La referencia de Eve es únicamente el ejemplo malo; en clase no se realizó una versión buena. Se conserva esa intención.

## La infracción
CuentaBancaria ofrece pagarDeuda. CuentaCredito puede pagar una deuda; CuentaAhorro lanza "No hay deuda que pagar." y CuentaCorriente hereda una operación vacía. Cliente no puede usar uniformemente esa operación con todas las cuentas.

Además, consultarSaldo en crédito significa crédito disponible, mientras que en ahorro y corriente representa saldo. Esa diferencia necesita un contrato explícito y no debe ocultarse al diseñar una versión buena.

Compilar no demuestra que LSP se cumpla. La aplicación imprime los clientes y captura la excepción del ahorro para mostrar la infracción sin terminar abruptamente.

## Archivos
CuentaBancaria define operaciones comunes. CuentaAhorro calcula 5% sobre saldo. CuentaCorriente permite sobregiro y calcula 2% sobre lo utilizado. CuentaCredito calcula 3% sobre deuda y controla crédito disponible. Cliente delega y SistemaBancario ejecuta la demostración. App llama a SistemaBancario.

NuevaBancaria era una clase vacía sin uso; se dejó intacta. No se inventó una versión buena.

## Ejecutar
Desde esta carpeta:
```powershell
javac -encoding UTF-8 -d bin src/*.java
java -cp bin App
```

Saldo de ahorro: 1900; corriente: 3000; crédito disponible: 9200 tras retirar 1000 y pagar 200. Intereses: 95, 0 y 24, respectivamente. Después se demuestra el pago incompatible del ahorro.

Se corrigieron firmas, herencia, delegación, número de cuenta y límite de crédito. Estos arreglos operativos no eliminan la infracción didáctica.

[Referencia de Eve](https://github.com/omarruiz31/SOLID/tree/main/liskov/Eve/Eve).
