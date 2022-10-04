package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        //Escribe un programa que lea tres números enteros e imprima true si el primer
        //número está entre el segundo y el tercero (ambos inclusive).
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean resultadoTrue = b < a && a < c;
        System.out.println(resultadoTrue);



        // De lo contrario, debe imprimir false.
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        boolean resultadoFalse = e < d && d <= f;
        System.out.println(resultadoFalse);
    }
}
