public class App {
    public static void main(String[] args) throws Exception {
        DonRamon ramon= new DonRamon();
        DonaFlorinda florindameza= new DonaFlorinda();
        Nono nono = new Nono();
        System.out.println("===LA VECINDAD DEL CHAVO===");
        ramon.darGolpe();
        ramon.pagarRenta();

        florindameza.llorar();
        nono.jugar();
        nono.pagarRenta();

        try{
            ramon.cobrarRenta();
        } catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
        try{
            ramon.jugar();
        }catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
        try{
            ramon.llorar();
        }catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }

        try{
            florindameza.llorar();
        }catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }

        try{
            nono.jugar();
        }catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
        try{
            ramon.cobrarRenta();
        }catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
    }
}
