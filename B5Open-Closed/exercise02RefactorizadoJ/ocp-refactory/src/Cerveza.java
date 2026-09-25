public class Cerveza {
     public Cerveza(String nombreBebida, double precioBase){
        super( nombreBebida, Etiqueta.CON_IEPS, precioBase);
        }

    @Override 
    public boolean requiereINE(){
        return false;
    }

     @Override 
    public double calcularTotal(){
        
}
