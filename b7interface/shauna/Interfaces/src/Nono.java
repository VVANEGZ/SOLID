public class Nono implements AccionesPersonaje {
    private final String nombre="Ñoño";

    
    @Override
    public void cobrarRenta() {
        
        throw new UnsupportedOperationException(nombre+ ": No es dueño de la vecindad");
    }

    @Override
    public void darGolpe() {
        
        throw new UnsupportedOperationException(nombre+ ": No golpea por menso.");
        
    }

    @Override
    public void jugar() {
        System.out.println(nombre+". Juega a la pelota.");
        
    }

    @Override
    public void llorar() {
        
        throw new UnsupportedOperationException(nombre+ ": No llora.s");
    }

    @Override
    public void pagarRenta() {
        throw new UnsupportedOperationException(nombre+ "No paga renta.");
        
    }

}
