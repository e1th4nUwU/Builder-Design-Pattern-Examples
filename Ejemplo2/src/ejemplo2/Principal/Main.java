
package ejemplo2.Principal;

import ejemplo2.Clases.*;
import java.util.Scanner;

//MAIN

import ejemplo2.Clases.Director;


public class Main {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int bandera = 1;
        
        
        Director casa = new Director();
        
        do{
            System.out.println("Construir casas");
            System.out.println("1) Construir casa simple");
            System.out.println("2) Construir casa amplia");
            System.out.println("3) Salir");
            System.out.print("Opcion: ");
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Casa con un cuarto");
                    casa.setBuilder(new CasaSimple());
                    casa.construirCasa();
                    
                    break;
                    
                case 2:
                    System.out.println("Casa con 5 cuartos");
                    casa.setBuilder(new CasaAvanzada());
                    casa.construirCasa();
                    break;
                
                case 3:
                    bandera = 0; 
                    break;
                
                default:
                    System.out.println("Opcion no válida");
                    break;
                 
            }
            
         
     
        }while(bandera ==1);
    }
    
}
