package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        //Realizar un programa que lea cuatro valores numéricos e imprima su suma y su media.
        //como vamos a tener que calcular la media, valores decimales

        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();




        //imprima suma y media Ten en cuenta que la media puede contener decimales.
        double suma = n1 + n2 + n3 + n4;
        double media = suma/4;
        System.out.println("suma : " + suma);
        System.out.println( "media: " + media);
        }
    }
