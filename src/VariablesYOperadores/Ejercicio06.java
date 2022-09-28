package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        /*N ardillas encuentran K nueces y deciden dividirlas equitativamente. Escribe un
        programa que calcule (y muestre) cuántas nueces corresponden a cada ardilla y
        cuántas sobrarán tras el reparto.
         */
        //pedimos el numero de ardilas y de nueces
        Scanner sc = new Scanner(System.in);
        System.out.print("N de ardillas: ");
        int N = sc.nextInt();
        System.out.print("N de nueces: ");
        int K = sc.nextInt();

        //las dividimos (division entera)
        int cociente = K / N;
        int resto = K % N;

        //Mostramos el resultado
        System.out.println("tocan a " + cociente + " nueces por ardilla y" +
                " sobran " + resto +" nueces");
    }
}
