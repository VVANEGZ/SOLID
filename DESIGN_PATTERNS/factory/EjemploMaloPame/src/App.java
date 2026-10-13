import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while(opcion != 0){
            System.out.println("\n1. Bosque Oscuro");
            System.out.println("2. Castillo Embrujado");
            System.out.println("3. Volcan infernal.");
            System.out.println("0. Salir");
            System.out.println("Elige un nivel: ");
            opcion = sc.nextInt();
            if(opcion >=1 && opcion <= 3){
                Nivel nivel = new Nivel(opcion);
                nivel.jugar();
            } else if(opcion != 0){
                System.out.println("Opcion invalida.");
            }
        } sc.close();
    }
}
