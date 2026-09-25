using System.Diagnostics;

namespace OCP.Aliens;
public class CuatroBrazos: IAlien
{
    public virtual string Nombre => "Cuatro brazos";
    public virtual string Descripcion => "Tetramand | Posee súper fuerza, piel blindada y cuatro brazos";
    public virtual void UsarHabilidad()
    {
        System.Console.WriteLine($"{Nombre} ataca con aplauso sonico");
    }
}