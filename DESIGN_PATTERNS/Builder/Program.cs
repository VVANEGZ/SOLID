using System;
using System.Data.SqlTypes;
using System.Drawing;
public class Casa
{
    public int Pisos { get; set; }
    public string Color { get; set; }
    public bool TieneTecho { get; set; }
    public bool TieneGarage { get; set; }
    public bool TieneAlberca { get; set; }
    public bool TieneJardin { get; set; }

    

    public decimal CalcularCosto()
    {
        decimal costo = 50000m * Pisos;
        if (TieneTecho) costo += 10000m;
        if (TieneGarage) costo += 40000m;
        if (TieneAlberca) costo += 11000;
        if (TieneJardin) costo += 130000m;
        return costo;
    }
    public Casa(int pisos, string color, bool techo, bool garage, bool alberca, bool jardin)
    {
        Pisos = pisos;
        Color = color;
        TieneTecho = techo;
        TieneGarage = garage;
        TieneAlberca = alberca;
        TieneJardin = jardin;
    }

    public Casa(int pisos)
    {
        :this(pisos, "Blanco"){ }
    }
    public Casa(int pisos, string color)
    {
        :this(pisos, color, true){ }
    }
    public Casa(int pisos, string color, bool techo)
    {
        :this(pisos, color, techo, false){ }
    }
    public Casa(int pisos, string color, bool techo, bool garage)
    {
        :this(pisos, color, techo, garage, false){ }
    }
    public Casa(int pisos, string color, bool techo, bool garage, bool alberca)
    {
        :this(pisos, color, techo, garage, alberca, false){ }
    }
    public void Mostrar()
    {
        System.Console.WriteLine($"Casa con {Pisos} pisos | Color {Color}");
        System.Console.WriteLine($"Techo{TieneTecho} | Garage {TieneGarage} | Alberca: {TieneAlberca} | Jardin {TieneJardin}");
        System.Console.WriteLine($"Costo {CalcularCosto():C}");
    }

    public class CasaConAlberca : Casa
    {
        public CasaConAlberca(int pisos, string color)
            : base(pisos, color, true, true, false, false) { }
    }

    public class CasaConGarage : Casa
    {
        public CasaConGarage(int pisos, string color)
        : base(pisos, color, true, true, false, false) { }
    }
    public class CasaGarageYAlberca : Casa
    {
        public class CasaConGarageYAlberca(int pisos, string color)
        : base(pisos, color, true, true, true, false){}
    }

    class Program
    {
        static Casa ConstruirCasaFamiliar()
        {
            Casa c = new Casa(2);
            c.Color ="Beige";
            c.TieneTecho = true;
            c.TieneJardin = true;
            c.TieneGarage= true;
            if(c.Pisos <=0|| c.TieneTecho)
            {
                throw new Exception("Casa invalida");
                return c;
            }
        }
        static Casa ConstruirCasaVacacional()
        {
            Casa c = new Casa(2);
            c.Color ="Beige";
            c.TieneTecho = true;
            c.TieneJardin = true;
            c.TieneGarage= true;
            if(c.Pisos <=0|| c.TieneTecho)
            {
                throw new Exception("Casa invalida");
                return c;
            }
        }

        static void Main()
        {
            System.Console.WriteLine("Constructor telescopico");
            Casa lujo = new Casa(2);
            lujo.Mostrar();

            System.Console.WriteLine("Subclases");
            Casa conGarage = new CasaConGarage(1, "Azul");
            Casa conAlberca = new CasaConAlberca(1, "Rojo");
            conGarage.Mostrar();
            conAlberca.Mostrar();

            System.Console.WriteLine("Incosistencia");
            Casa i = new Casa(3);
            i.TieneTecho=false;
            i.TieneAlberca=true;
            i.Mostrar();

            System.Console.WriteLine("Duplicacion");
            ConstruirCasaFamiliar().Mostrar();
            ConstruirCasaVacacional().Mostrar();
        }
    }
}