public class CasaBuilderModerna: ICasaBuilder
{
    private Casa _casa = new Casa();
    
    public ICasaBuilder ConPisos(int Pisos)
    {
        _casa.Pisos = Pisos;
        return this;
    }
    public ICasaBuilder ConColor(string Color)
    {
        _casa.Color = Color;
        return this;
    }
    public ICasaBuilder ConMaterial()
    {
        _casa.Material = "Concreto";
        return this;
    }
        public ICasaBuilder ConTecho()
    {
        _casa.TieneTecho= true;
        _casa.TipoTecho = "Aluminio";
        return this;
    }
    public ICasaBuilder ConGarage()
    {
        _casa.TieneGarage= true;
        return this;
    }
    public ICasaBuilder ConJardin()
    {
        _casa.Jardin = true;
        return this;
    }
    public ICasaBuilder ConAlberca()
    {
        _casa.TieneAlberca = true;
        return this;
    }
    public  Casa Build()
    {
        Casa resultado= _casa;
        _casa= new Casa();
        return resultado;
    }
}