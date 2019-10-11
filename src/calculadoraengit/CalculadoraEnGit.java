/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraengit;

import java.util.Scanner;

/**
 *
 * @author DIEGO
 */
public class CalculadoraEnGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        boolean trabajar = true;
        
        
        
        while(trabajar){
        System.out.println("elija una opcion");
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");
        System.out.println("0: Salir");
        int eleccion = scan.nextInt();
        double v1 = 0;
        double v2 = 0;
       
        switch(eleccion){
            case 1:
                System.out.println("Ingrese el primer valor");
                v1 = scan.nextInt();
                System.out.println("Ingrese el segundo valor");
                v2 = scan.nextInt();
                //suma(v1,v2);
                
                break;
                
                case 2:
                System.out.println("Ingrese el primer valor");
                v1 = scan.nextInt();
                System.out.println("Ingrese el segundo valor");
                v2 = scan.nextInt();
                //resta(v1,v2);
                
                break;
                
                case 3:
                System.out.println("Ingrese el primer valor");
                v1 = scan.nextInt();
                System.out.println("Ingrese el segundo valor");
                v2 = scan.nextInt();
                //multiplicacion(v1,v2);
                
                break;
                
                case 4:
                System.out.println("Ingrese el primer valor");
                v1 = scan.nextInt();
                System.out.println("Ingrese el segundo valor");
                v2 = scan.nextInt();
                //division(v1,v2);
                
                break;
                
                case 0:
                trabajar = false;
                
                break;
                
                
        }
        
        }
        
    }
    
}
