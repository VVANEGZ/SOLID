public class DonRamon implements AccionesPersonaje{
    private final String nombre= "Don Ramon";

    @Override
    public void cobrarRenta() {
        
        throw new UnsupportedOperationException(nombre+ ": No es dueño de la vecindad");
    }

    @Override
    public void darGolpe() {
        
        System.out.println(nombre+": Toma!, toma!");
        
    }

    @Override
    public void jugar() {
        throw new UnsupportedOperationException(nombre+ ": No juega nada.");
        
    }

    @Override
    public void llorar() {
        
        throw new UnsupportedOperationException(nombre+ ": No llora.s");
    }

    @Override
    public void pagarRenta() {
        throw new UnsupportedOperationException(nombre+ "Nunca paga renta.");
        
    }

    
}
