package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        /*Realiza un programa que pida un número y un porcentaje, y
        a. Calcule y muestre ese número incrementado en ese porcentaje.
                b. Calcule y muestre ese número decrementado en ese porcentaje.

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("numero: ");
        double numero = sc.nextDouble();
        System.out.print("porcentaje: ");
        double porcentaje = sc.nextDouble();

        //calcula el porcentaje
        double porcentajeCalculado = numero * porcentaje / 100;
        System.out.println(porcentajeCalculado);

        //y muestre el numero incrementado

        double incrementadoPorcentaje = numero + porcentajeCalculado;
        System.out.println(numero + "incrementado en un " + porcentaje + "% es " + incrementadoPorcentaje);

        double decrementadoPorcentaje = numero - porcentajeCalculado;
        System.out.println(numero + "incrementado en un " + porcentaje + "% es " + decrementadoPorcentaje);
    }
}
