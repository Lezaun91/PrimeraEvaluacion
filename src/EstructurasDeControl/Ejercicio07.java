package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        /*Escribe un programa que pregunte al usuario si es culpable o no. Asumiremos que:
• En caso afirmativo el usuario responderá true
• En caso contrario responderá false.
                Si el usuario responde true se le responderá “a la cárcel”. En caso contrario, “¡a casa!”.

         */

        Scanner sc = new Scanner(System.in);
        boolean respuesta = sc.nextBoolean();

        if (respuesta){
            System.out.println("a la carcel");
        } else {
            System.out.println("¡a casa!");
        }


    }
}
