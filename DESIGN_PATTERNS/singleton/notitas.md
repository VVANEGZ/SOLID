# singleton
es un patrón creacional que controla la creación de instancias de una clase.
mantiene una única instancia compartida.

- un constructor privado para restringir la creación directa.
- campo estático que conserva la instancia.
- propiedad que permite acceder a ella.

TAMBIÉN SE CONSIDERA COMO UN ANTIPATRÓN, porque introduce un estado global oculto y un alto acoplamiento.