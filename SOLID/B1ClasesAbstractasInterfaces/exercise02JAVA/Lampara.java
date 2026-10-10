public class Lampara implements ActivablePorRedstone{
    @Override
    public void activar(){
        System.out.println("Lampará se activa");
    }
    @Override
    public  void desactivar(){
        System.out.println("Lampará se desactiva");
    }
}
