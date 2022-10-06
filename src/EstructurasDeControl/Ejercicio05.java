package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        /*Programa que solicita 10 números por teclado y al concluir escribe el mayor y menor
        de ellos.
         */

        //vamos a usar dos variables auxiliares: max y min
        //en max vamos a ir guardandi temporalmente el numero mayor que tengamos
        //en min vamos a ir guardando temporalmente el numero menos que tengamos
        Scanner sc = new Scanner(System.in);

        System.out.println("numero: ");
        int n1 = sc.nextInt();
        //al pedir el primer numero es el mayor y el menos que tenemos, asi que lo asignamos a estas variables
        int max = n1;
        int min = n1;
        System.out.println("numero: ");
        int n2 = sc.nextInt();
        if (n2 > max) {//si n2 es mayor que el que teniamos, lo guardamos en max
            max = n2;
        }
        if (n2 < min)
            min = n2;
        System.out.println("numero: ");
        int n3 = sc.nextInt();
        if (n3 > max) {
            max = n3;
        }
        int n4 = sc.nextInt();
        System.out.println("numero: ");
        int n5 = sc.nextInt();
        System.out.println("numero: ");
        int n6 = sc.nextInt();
        System.out.println("numero: ");
        int n7 = sc.nextInt();
        System.out.println("numero: ");
        int n8 = sc.nextInt();
        System.out.println("numero: ");
        int n9 = sc.nextInt();
        System.out.println("numero: ");
        int n10 = sc.nextInt();
    }
}
