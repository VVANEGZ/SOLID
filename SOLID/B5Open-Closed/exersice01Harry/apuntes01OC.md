# APUNTE CHIPOCLUDAS OPEN/CLOSED

Las entidades de software deben estar abiertas para la extensión, pero cerradas para la modificación :)

## Omnitrix
`IAlien` define nombre, descripción y habilidad. El núcleo `Omitrix` transforma usando ese contrato. Fuego, CuatroBrazos y Humongusaurio proporcionan habilidades diferentes.

`HumongusaurioSupremo` extiende a Humongusaurio mediante sobreescritura. `Fusion<A, B>` combina dos tipos con genéricos. `Skurd` implementa IAlien y compone dos objetos para prestar habilidades. `FabricaAlien` crea un alien a partir de `MuestraADN`.

`GestorDeAliens` reúne el catálogo, muestras escaneadas, fusiones y formas supremas. `Program.cs` ofrece transformación, elección aleatoria, fusión, escaneo, habilidades, evolución y destransformación.

## Por qué sirve para OCP
Se pueden agregar implementaciones de IAlien sin cambiar Transformar ni su uso de la habilidad. El registro del catálogo y las recetas sí debe actualizarse cuando se añaden tipos compilados; esa parte no está completamente cerrada a modificación. El escaneo permite registrar datos nuevos en ejecución.

Un ejemplo malo sería colocar un switch por nombre de alien dentro de Transformar o UsarHabilidad y editarlo con cada alien nuevo. No se agregó una versión mala nueva porque no existe en tu carpeta ni en las referencias de este ejercicio.

Se conservaron tus mensajes de habilidades. Se completó el gestor y el menú, se hizo que Skurd implemente IAlien y se corrigió la transformación para mostrar el nombre del alien.

Referencias: [Fabian](https://github.com/JMFabian240/OCP-Principio-Abierto-Cerrado) y [copia de clase](https://github.com/omarruiz31/SOLID/tree/main/Open-Closed/Fabian).
