public class Casa
{
    public Casa(){}
    public int Pisos {get; set;}
    public string Color{get; set;} = "Sin definir";
    public string Material{get; set;} ="Sin definir";
    public bool TieneTecho{get; set;}
    public string TipoTecho{get; set;} ="NO tiene";
    public bool TieneGarage{get; set;}
    public bool Jardin{get; set;}
    public bool TieneAlberca{get; set;}
    public void Mostrar()
    {
        System.Console.WriteLine($"Mi casa tiene: ");
        System.Console.WriteLine($"Casa tiene {Pisos} piso(s), es de color {Color}");
        System.Console.WriteLine($"Casa es de {Material}");
        System.Console.WriteLine($"Casa tiene {TieneTecho} y de {TipoTecho}");
        System.Console.WriteLine($"Casa tiene jardin{Jardin}");
        System.Console.WriteLine($"Casa tiene alberca: {TieneAlberca}");
    }
    
}