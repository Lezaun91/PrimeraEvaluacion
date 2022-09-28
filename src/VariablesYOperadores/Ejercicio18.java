package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
//        Hacer un programa que lea una temperatura en grados centígrados y la calcule y
//        visualice en las escalas: (reamur, Fahrenheit y kelvin). Teniendo en cuenta:
        Scanner sc = new Scanner(System.in);

        double centigrados = sc.nextDouble();
        double Reamur = centigrados * 0.8;
        double Farenheit = (centigrados * 9/5)+32;
        double Kelvin = centigrados + 273;
        System.out.println("reamur son  " + Reamur);
        System.out.println("Farenheit son " + Farenheit);
        System.out.println("Kelvin son " + Kelvin);


//        Reamur = Centígrados x 0.8
//        Fahenheit = (Centígrados * 9/5)+32
//        Kelvin = Centígrados + 273
    }
}
