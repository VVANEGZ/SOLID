public class DonRamon implements Inquilino, Habitante{
    private String nombre= "Don Ramon";

    @Override
    public void pagarRenta() {
        System.out.println(nombre + " le jura al sr Barriga pagarle dentro de un mes.");
        
    }

    @Override
    public void interactuarConElChavo() {
        System.out.println(nombre+ " le mete un buen golpe a chavo.");
        
    }
    
}
