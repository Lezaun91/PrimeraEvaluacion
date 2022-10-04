package EstructurasDeControl;

import java.util.Scanner;

public class EjemplosIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* System.out.print("Dime tu edad: ");
        int edad = sc.nextInt();

        //Si es la edad es mayor que 100 es una persona con mucha experiencia
        //Si no, pues nada, no decimos nada.
        if (edad > 100) {
            System.out.println("Eres un hombre con mucha experiencia.");
        }*/

       /* // El resultado de la condicion es boolean; podemos simplificar, a veces, asi
        boolean semaforoAbierto = false;
        if (semaforoAbierto) {//es lo mismo que semaforoAbierto ==true
            System.out.println("adelante, puedes pasar.");
        } else {
            System.out.println("Detente, pecador.");
        }*/

        //vamos a ver si un numero es par o impar

        /*
        System.out.println("introduce un numero: ");
        int numero = sc.nextInt();
        if (numero%2 == 0) {
            System.out.println("el numero es par.");
        } else {
            System.out.println("el numero es impar.");

        }
        */

        int presupuesto = sc.nextInt();
        if (presupuesto < 100) {
            System.out.println("este bolso no es para mi");
        } else if (presupuesto < 200) {
            System.out.println("Puedo comprar el basico");
        } else if (presupuesto < 300){
            System.out.println("puedo comprar el estandar");
        } else if (presupuesto >=300) {
            System.out.println("puedo comprar el mas top");
        }



    }

}
