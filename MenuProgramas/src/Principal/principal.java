package Principal;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        
        Scanner validation = new Scanner(System.in);
        principal comenzar = new principal();
        
        String user = "fiore";
        String password = "2008";
        
        String Usuario, Contrasenia;
        boolean iniciar = true;
        
        System.out.println("----------------------------------------------------------");
        System.out.println("|Hola para poder ingresar porfavor verifica tu identidad: |");
        System.out.println("----------------------------------------------------------");
        
        while (iniciar) {
            System.out.println("-------------------------");
            System.out.print("Ingrese el usuario correcto > ");
            Usuario = validation.nextLine();
            System.out.print("Ingrese la contraseña correcta >");
            Contrasenia = validation.nextLine();
            System.out.println("-------------------------");
            
            if (user.equals(Usuario) && password.equals(Contrasenia)) {
                System.out.println("Bienvenido: " + Usuario);
                iniciar = false;
                comenzar.Menu();
            }else{
                System.out.println("Error: no pudimos encontrar los daots de > " + Usuario);
            }
        }
    }
    
    public void Menu(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("BIENVENIDO AL MENU DE OPCIONES");
        System.out.println("Escoje que deseas probar : ");
        System.out.println("");
        System.out.println("1. Estructuras IF");
        System.out.println("2. Ciclos FOF");
        int opcion = 0;
        
        do {
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    
                    break;
                default:
                    System.out.println("Error: Opcion no valida");
            }
            
        } while (opcion == 0);
    }
}
