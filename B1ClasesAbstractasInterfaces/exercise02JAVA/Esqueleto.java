public class Esqueleto extends MobHostil {
    public Esqueleto(){
        super("Esqueleto", 20);
    }

    @Override
    void atacar(){
        System.out.println("El esqueleto te persigue y te atacal.");
    }
}
