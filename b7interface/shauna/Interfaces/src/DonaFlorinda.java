public  class DonaFlorinda implements AccionesPersonaje{
    private final String nombre= "Doña Florinda";

    
    @Override
    public void cobrarRenta() {
        
        throw new UnsupportedOperationException(nombre+ ": No es dueño de la vecindad");
    }

    @Override
    public void darGolpe() {
        
        System.out.println(nombre+": Le da un cachetadón a Don Ramón.");
        
    }

    @Override
    public void jugar() {
        throw new UnsupportedOperationException(nombre+ ": No juega nada.");
        
    }

    @Override
    public void llorar() {
        
        throw new UnsupportedOperationException(nombre+ ": No lloras");
    }

    @Override
    public void pagarRenta() {
        System.out.println(nombre+ ": Paga la renta de 5K.");
        
    }

}
