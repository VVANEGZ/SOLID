public class Esqueleto extends Enemigo{

    public Esqueleto() {
        super("Esquelto", 150, 50);
    }
    public void atacar(){
        System.out.println("El esquelto te pega con su espada y te quita: "+ this.ataque+ " de vida.");
    }
}
