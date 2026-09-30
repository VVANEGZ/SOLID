public class ProfeJirafales implements Educador , Habitante{
    private String nombre= "Profesor Jirafales";

    @Override 
    public void pasarLista(){
        System.out.println(nombre+ " pasa la lista de los alumnos.");
    }

    @Override
    public void hacerCoraje() {
        System.out.println("TA TA TA TA.");
        
    }

    @Override
    public void impartirClase() {
        System.out.println(nombre+ " imparte una clase a su alumnado.");
        
    }

    @Override
    public void interactuarConElChavo() {
        System.out.println("Chavito, avisame con tiempo.");
        
    }
    
}
