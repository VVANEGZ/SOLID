
public class Director
{
    private readonly ICasaBuilder _builder;
    public Director(ICasaBuilder _builder)
    {
        this._builder = _builder;
    }

    public Casa construirCasaBasica()
    {
        return _builder
        .ConPisos(1)
        .ConColor("Verde menta")
        .ConTecho()
        .Build();
    }

    public Casa constuirCasaDeLujo()
    {
        return _builder
        .ConPisos(4)
        .ConColor("Blanco ostion")
        .ConTecho()
        .ConGarage()
        .ConJardin()
        .ConAlberca()
        .Build();
    }
}