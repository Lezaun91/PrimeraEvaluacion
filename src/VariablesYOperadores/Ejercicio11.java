package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        //11.dado un numero de dos cifras
        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero de dos cifras: ");
        int numero = sc.nextInt();
        //escribe un programa que permita obteener el numero invertido.
       // ejemplo si se introduce 23 que muestre 32

        //extraemos las decenas
        int decenas = numero / 10;
        int unidades = numero % 10;

        //la mostramos al reves
        System.out.println(unidades + "" + decenas);
    }
}
