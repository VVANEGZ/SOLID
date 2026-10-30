import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        NucleoEnergia nucleoOriginal = NucleoEnergia.crearInicial();
        Motor motorOriginal = new Motor("Motor", 500, nucleoOriginal);    
        Nave original = new Nave("Interceptos", 100, motorOriginal, new 
        ArrayList<>(List.of(new Arma("Laser", 60), new Arma("Misil", 120))),
        new Tripulacion("Ordis", "777"));

        List <Nave> naves = new ArrayList<>();
        naves.add(original);
        Nave clon1 = new Nave(original.getNombre(), original.getEscudo(),original.getMotor(),original.getArmas(), original.getTripulacion());
        
        Nave clon2 = new Nave(original.getNombre(), original.getEscudo(),original.getMotor(),original.getArmas(), original.getTripulacion());
        
        Nave clon3 = new Nave(original.getNombre(), original.getEscudo(),original.getMotor(),original.getArmas(), original.getTripulacion());
        
        naves.add(clon1); naves.add(clon2); naves.add(clon3);
        muestraTodas(naves, "Estado inicial");

        clon1.getMotor().setPotencia(150);
        muestraTodas(naves, "Cambio de potencia en el motor 1");
    }

    public static void muestraTodas(List<Nave> naves, String titulo){
        System.out.println("\n ==="+ titulo+ " ===");
        for(int i = 0; i< naves.size(); i++) naves.get(i).mostrar(i);
    }
}
