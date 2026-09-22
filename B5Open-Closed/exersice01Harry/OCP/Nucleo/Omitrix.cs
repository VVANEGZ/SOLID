using OCP.Aliens;
namespace OCP.Nucleo;
public class Omitrix
{
    public IAlien ? AlienActual {get; private set;}
    public bool EstaTransformado => AlienActual != null;
    public void Transformar(IAlien alien)
    {
        AlienActual = alien;
        System.Console.WriteLine($"Transformación completada. Ahora eres {AlienActual}");
    }

    public void Destransformar(IAlien alien)
    {
        if(AlienActual != null)
        {
            System.Console.WriteLine($"Timeout.{alien.Nombre} ahora eres Ben.");
            AlienActual = null;
        }
    }
}