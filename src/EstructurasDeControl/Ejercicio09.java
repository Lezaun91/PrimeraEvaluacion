package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        //Escribe un programa que pida un nombre de usuario y una contraseña.
        // Esos datos secomparan con dos valores guardados previamente.
        // Si coinciden, se indica “Has entrado al sistema”, en caso contrario se da un error.


        String user = "Pablito";
        String Password = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.print("usuario: ");
        String usuario = sc.nextLine();
        System.out.println("contraseña");
        String passw = sc.nextLine();

        if (usuario.equals(user) && passw.equals(Password)) {
            System.out.println("Has entrado al sistema.");
        } else {
            System.out.println("Error. Usuario o contraseña incorrectos.");
        }

    }
}
