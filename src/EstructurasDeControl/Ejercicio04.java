package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*Dentro de una clase Joven tenemos las variables enteras edad, nivelDeEstudios e
        ingresos. */
        Scanner sc = new Scanner(System.in);
        System.out.println("edad: ");
        int edad = sc.nextInt();
        System.out.println("Nivel de estudios:\n0 - Sin estudios \n1 - Educacion primaria \n2  ESO\n3 - Grado medio\n4  Estudios superiores");
        int estudios = sc.nextInt();
        System.out.println("Ingresos: ");
        int ingresos = sc.nextInt();

        //Necesitamos almacenar en la variable boolean jasp el valor:
        boolean jasp;





       /* a. true, si la edad es menor o igual a 28 y el nivelDeEstudios es mayor que tres, o
        bien la edad es menor de 30 y los ingresos superan los 28.000 euros.*/

        if (edad <= 28 && estudios > 3 || edad <30 && ingresos >28000) {
            jasp = true;
        } else {
            jasp = false;
        }
        if (jasp){
            System.out.println("Eres un joven aunque sobradamente preparado");
        }
       /* b. false, en caso contrario.
        Escribe el código necesario.*/

    }
}
