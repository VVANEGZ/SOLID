public class Piston implements ActivablePorRedstone{
    @Override
    public void activar() 
    {System.out.println("Piston se activa");}
    
    @Override
    public void desactivar() {
        System.out.println("Piston se desactiva");
    }
}
