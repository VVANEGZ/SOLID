import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        Nono nono = new Nono();
        DonRamon ramonsito= new DonRamon();
        ProfeJirafales profesor = new ProfeJirafales();

        List<Educador> educadores= List.of(profesor);
        for(Educador e: educadores){
            e.impartirClase();
            e.pasarLista();
            e.hacerCoraje();
        }
        List<Inquilino> inquilinos= List.of(ramonsito);
        for(Inquilino i: inquilinos){
            i.pagarRenta();
        }
        List<Habitante> habitantes= List.of(profesor, ramonsito);
        for(Habitante h: habitantes){
            h.interactuarConElChavo();
        }
        List<Nino> ninos= List.of(nono);
        for(Nino n: ninos){
            n.cantar();
            n.llorar();
        }
    }
}
