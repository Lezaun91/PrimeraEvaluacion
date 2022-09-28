package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*Dado un número de dos dígitos, imprime su primer número (las decenas).
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero de dos digitos: ");
        int numero = sc.nextInt();

        //las decenas son el cociente
        System.out.println("las decenas son: " + (numero/10));
        System.out.println( "las unidades son: " + (numero%10));
    }
}
