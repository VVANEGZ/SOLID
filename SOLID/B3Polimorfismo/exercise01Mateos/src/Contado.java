public class Contado implements MetodoPago {
    boolean EstadoBilletes;
    public Contado(boolean EstadoBilletes){
        this.EstadoBilletes = EstadoBilletes;
    }
    @Override
    public boolean validar(){
        if(EstadoBilletes == true){
            return true;
        } else{
            return false;
        }
    }
    @Override
    public void pagar(double monto){
        System.out.println("El billete esta en buen estado.");
    }
    @Override
    public String toString(){
        return "Pago al contado. Billetes en buen estado?: " + this.EstadoBilletes;
    }
}
