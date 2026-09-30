public class Cerveza extends Bebida {
     public Cerveza(String nombreBebida, double precioBase){
        super( nombreBebida, Etiqueta.CON_IEPS, precioBase);
        }

    @Override
    public boolean requiereINE(){
        return true;
    }

     @Override
    public double calcularTotal(){
        return getPrecioBase() * (1 + IVA) * 1.25;
    }

}
