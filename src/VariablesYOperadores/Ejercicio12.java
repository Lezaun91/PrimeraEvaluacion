package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
       // Escribe un programa que lea un número de tres cifras y muestre el número invertido.
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();




        //Por ejemplo: si introducimos el número 320, el programa debe mostrar 23; si
        //introducimos 976, el programa debe mostrar 679.

        int centenas = numero/100;
        int auxiliar = numero % 100;
        int decenas = auxiliar/10;
        int unidades = auxiliar % 10;

        System.out.println("el numero es " + unidades + " " + " " + decenas + " " + " " +centenas);
    }
}
