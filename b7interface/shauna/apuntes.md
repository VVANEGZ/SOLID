# Apuntes I- Interface Principle-Segregación de interfaces
"Los cliente no deberían verse obligados a depender de interfaces que no utilizan"- Tío Bob

Elimina las interfaces "gordas" o contaminada que agrupa demasiadas operaciones relacionadas.
Obliga a las clases a depender de un mismo código.

Si aplicamos la ISP, tendremos alta cohesión, bajo acoplamiento y facilidad de mantenimiento.

En otras palabras:

Es mejor tener varias interfaces pequeñas y específicas.

Evita crear una sola interfaz enorme con métodos que no todas las clases utilizarán.

Cada clase debe implementar solo las operaciones que realmente necesita.

Problema que evita

Cuando una interfaz contiene demasiados métodos:

Las clases terminan implementando métodos que no les corresponden.

Aparecen métodos vacíos.

Se lanzan excepciones como NotSupportedException.

El código queda más difícil de mantener.

Las clases se vuelven dependientes de funcionalidades innecesarias.

Ejemplo incorrecto ❌

public interface ITrabajador
{
    void Trabajar();
    void Comer();
}

Ahora tenemos un humano:

public class Empleado : ITrabajador
{
    public void Trabajar()
    {
        Console.WriteLine("Trabajando...");
    }

    public void Comer()
    {
        Console.WriteLine("Comiendo...");
    }
}

Pero también un robot:

public class Robot : ITrabajador
{
    public void Trabajar()
    {
        Console.WriteLine("Trabajando...");
    }

    public void Comer()
    {
        throw new NotSupportedException();
    }
}

¿Cuál es el problema?

El robot puede trabajar, pero no necesita comer.

Sin embargo, la interfaz lo obliga a implementar Comer().

Esto viola ISP.

Solución correcta ✅

Dividir la interfaz:

public interface ITrabajador
{
    void Trabajar();
}

public interface IComedor
{
    void Comer();
}

El empleado puede implementar ambas:

public class Empleado : ITrabajador, IComedor
{
    public void Trabajar()
    {
        Console.WriteLine("Trabajando...");
    }

    public void Comer()
    {
        Console.WriteLine("Comiendo...");
    }
}

Mientras que el robot implementa únicamente lo que necesita:

public class Robot : ITrabajador
{
    public void Trabajar()
    {
        Console.WriteLine("Trabajando...");
    }
}

Regla rápida para identificar una violación

Si una clase implementa una interfaz y tienes que escribir algo como:

throw new NotSupportedException();

o:

public void Metodo()
{
    // No aplica
}

probablemente la interfaz tiene demasiadas responsabilidades.

ISP busca

Interfaces pequeñas.

Interfaces específicas.

Bajo acoplamiento.

Mayor cohesión.

Clases más fáciles de mantener.

Menos dependencias innecesarias.

No significa...

ISP no significa crear una interfaz para cada método.

La idea es agrupar métodos que estén relacionados y tengan sentido para el mismo tipo de cliente.

Forma fácil de recordarlo

No obligues a una clase a saber hacer algo que nunca va a usar.

Interfaz grande ❌

        IDispositivo
        /    |     \
 imprimir escanear fax

Todos los dispositivos tendrían que implementar todo.

Interfaces segregadas ✅

IImprimible
   |
Impresora

IEscaneable
   |
Escáner

IFaxeable
   |
Fax

Un dispositivo multifunción simplemente puede implementar varias interfaces.

Palabras clave

Segregación: separar responsabilidades.

Interfaz: contrato que define operaciones.

Cliente: clase que depende de la interfaz.

Cohesión: métodos relacionados entre sí.

Acoplamiento: dependencia entre componentes.

En una frase

ISP establece que los clientes no deben depender de métodos que no utilizan; por ello, se prefieren interfaces pequeñas, específicas y enfocadas en una responsabilidad concreta.