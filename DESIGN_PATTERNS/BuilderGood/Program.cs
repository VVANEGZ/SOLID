using System;
public class Program
{
    public static void Main()
    {
        Casa personalizada = new CasaBuilder()
        .ConAlberca()
        .ConColor("Azul")
        .ConTecho()
        .Build();

        Casa personalizada1 = new CasaBuilderModerna()
        .ConPisos(2)
        .ConColor("Amarillo")
        .ConTecho()
        .ConMaterial()
        .Build();

        Director director = new Director(new CasaBuilder());
        Director director1 = new Director(new CasaBuilderModerna());

        Casa basica = director.construirCasaBasica();
        Casa delujo = director.constuirCasaDeLujo();
        Casa menosBasica = director.constuirCasaDeLujo();

        personalizada.Mostrar();
        personalizada1.Mostrar();
        basica.Mostrar();
        delujo.Mostrar();
        menosBasica.Mostrar();
    }
}