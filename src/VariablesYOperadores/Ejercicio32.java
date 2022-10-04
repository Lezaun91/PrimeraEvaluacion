package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        ///Escribe un programa que lea un valor entero y verifique si es menor que 10 y mayor que 0.
        Scanner sc = new Scanner(System.in);
        int valorTeclado = sc.nextInt();
        //El programa debe imprimir un booleano (true o false).

        boolean resultado = valorTeclado < 10 && valorTeclado > 0;
        System.out.println(resultado);



    }
}
