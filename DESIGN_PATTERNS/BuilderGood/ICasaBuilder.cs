public interface ICasaBuilder
{
    public ICasaBuilder ConPisos(int Pisos);
    public ICasaBuilder ConColor(string Color);
    public ICasaBuilder ConMaterial();
    public ICasaBuilder ConTecho();
    public ICasaBuilder ConGarage();
    public ICasaBuilder ConJardin();
    public ICasaBuilder ConAlberca();
    public  Casa Build();
}