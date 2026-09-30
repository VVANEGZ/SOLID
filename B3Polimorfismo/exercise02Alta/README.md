# POLIMORFISMO APUNTES

## Clasificaciones
Ad hoc: sobrecarga de funciones u operadores. Coerción: conversión entre tipos compatibles. Universal de inclusión: una subclase se usa como su base. Universal paramétrico: se escribe un algoritmo genérico que funciona con distintos tipos.

## Altair: MiVector
`Contenedor<T>` es el contrato abstracto: vacío, tamaño, agregar, obtener y quitar. Su destructor virtual permite destruir correctamente implementaciones derivadas.
`MiVector<T>` administra un arreglo dinámico y aumenta su capacidad al agregar elementos.

- `Contenedor<int>*` apuntando a MiVector muestra inclusión y despacho dinámico.
- MiVector de int, string y Alumno muestra polimorfismo paramétrico.
- `operator[]`, `operator()` y `operator<<` permiten acceso e impresión con sintaxis de operadores; cada sobrecarga ofrece una operación concreta.

## Compilar los cinco ejemplos
Desde esta carpeta, en PowerShell:

```powershell
g++ -std=c++17 01_test_interfaz.cpp -o test1.exe
./test1.exe
g++ -std=c++17 02_test_costruccion.cpp -o test2.exe
./test2.exe
g++ -std=c++17 03_test_subtipo.cpp -o test3.exe
./test3.exe
g++ -std=c++17 04_test_parametrico.cpp -o test4.exe
./test4.exe
g++ -std=c++17 05_test_adhoc.cpp -o test5.exe
./test5.exe
```

Cada archivo tiene su propio main: se compilan por separado. Una ejecución correcta muestra `##POLI:OK##`.
Se completó la impresión y se corrigió quitar para no acceder fuera del arreglo. Este contenedor didáctico no implementa copia profunda; no copies MiVector por valor, usa referencias.

Referencia: [Altair](https://github.com/omarruiz31/SOLID/tree/main/Polimorfismo/Altair).
