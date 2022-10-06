package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        /*Haz el ejercicio anterior, pero de forma que el usuario responda con un “sí” o con un
“no” (en vez de true/false).

         */
        Scanner sc = new Scanner(System.in);
        String respuesta = sc.nextLine();

        if (respuesta.equals("si") ) {// la comparaciones entre string se hace con el metodo equals; queremos decir: si la variable
            //sirespuesta es igual a si
            System.out.println("a la carcel");
        } else if (respuesta.equals("no")) {
            System.out.println("quedas libre");
        } else {
            System.out.println("esto es de prueba");
        }



    }
}
