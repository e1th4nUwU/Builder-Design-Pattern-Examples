import java.util.Scanner;
import inventario.Director;
import inventario.Computadora;


public class Mostrador {
    public static void main(String[] args) {
        Computadora barata, media, cara;
        int opcion;
        Scanner sc = new Scanner(System.in);
        Director director = new Director();
        
        director.setBuilder("barata");
        director.construirComputadora();
        barata = director.getComputadora();

        director.setBuilder("media");
        director.construirComputadora();
        media = director.getComputadora();

        director.setBuilder("cara");
        director.construirComputadora();
        cara = director.getComputadora();

        do{
            System.out.println("----------------------");
            System.out.println("TIENDA DE COMPUTADORAS");
            System.out.println("----------------------\n");
            System.out.println("\t0. Salir");
            System.out.println("\t1. Ver computadora barata");
            System.out.println("\t2. Ver computadora media");
            System.out.println("\t3. Ver computadora cara");
            System.out.print(": ");
            opcion = sc.nextInt();
            switch(opcion){
                case 0:
                    System.out.println("\nAdios!");
                    break;
                case 1:
                    System.out.println(barata.toString());
                    System.out.println("Probando PC...");
                    barata.probar();
                    break;
                case 2:
                    System.out.println(media.toString());
                    System.out.println("Probando PC...");
                    media.probar();
                    break;
                case 3:
                    System.out.println(cara.toString());
                    System.out.println("Probando PC...");
                    cara.probar();
                    break;
            }
        }while(opcion != 0);
        
        sc.close();
    }
}
