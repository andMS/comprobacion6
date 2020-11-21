
import java.util.Scanner;


public class MainClass {
    
    public static void main(String args[]) {
        
        String usuario, usuarioCheck;
        String password, passwordCheck;
        boolean validation = false, valid = false;
        int n = 0;
        Scanner sc = new Scanner(System.in);
	    
	System.out.println("Crea un nombre de usuario: ");
	usuario = sc.nextLine();
	System.out.println("Crea un password: ");
	password =  sc.nextLine();
        
        do{
        if (usuario.isEmpty()){
            System.out.println("Usuario no introducido. \nVuelve a intentarlo.");
            System.out.println("Crea un nombre de usuario: ");
            usuario = sc.nextLine();
    
        } else {
               System.out.println("Su usuario es:"+ usuario+ "\n");
               validation = true;
         
                }
        }while (validation == false);
        
       do {
       if (password.isEmpty()){
    System.out.println("Contraseña no introducida. \nVuelve a intentarlo.");
    System.out.println("Crea un password: ");
    password =  sc.nextLine();
    
        } else {
               System.out.println("Su contraseña es:"+ password+ "\n");
               valid = true;
         
                }
       } while (valid == false);
  
		
		
	do{
                        
            System.out.println("Para iniciar sesion, introduce tu nombre de usuario: ");
            usuarioCheck = sc.nextLine();
            System.out.println("Ahora introduce el password: ");
            passwordCheck = sc.nextLine();
		
            if (password.equals(passwordCheck) && usuario.equals(usuarioCheck)){
		    System.out.println("Login exitoso.");
		} else {
		    
		    System.out.println("Usuario o password incorrecto.\nNuevo intento:");
		    n = 1;
		}
            
		} while (n == 1);
		
		System.out.println("Fin del programa.");
		
		
		
	}
    
}
