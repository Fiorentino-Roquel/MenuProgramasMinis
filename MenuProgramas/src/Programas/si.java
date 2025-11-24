package Programas;

import java.util.Scanner;

public class si {

    public static void main(String[] args) {
        
        String validacion = "14";
        int catorce;
        boolean iniciar = true;
        
        Scanner leer = new Scanner(System.in);
        si empezar = new si(); 
        
        System.out.println("Hola Bienvenido al menu de estructuras if");
       
        while (iniciar) {
            System.out.println("Ingresa el numero 14 para ingresar al menu: ");
            catorce = leer.nextInt();
            
            if (validacion.equals(catorce)) {
                iniciar = false;
                empezar.Estructuras();
            }else{
                System.out.println("Error: numero incorrecto vuelve a intentarlo.");
            }
        }
    }
    
    public void Estructuras (){
        Scanner lector = new Scanner(System.in);
        
        System.out.println("ESCOJA LA ESTRUCTURA QUE DESEA PROBAR");
        int opcion = 0;
        
        do {
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion == 0);
    }
}
