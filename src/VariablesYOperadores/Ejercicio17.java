package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
//        17. Calcular el área de un triangulo ( base * altura)
        Scanner sc = new Scanner(System.in);
        System.out.println("base: ");
        double base = sc.nextDouble();
        System.out.println("Altura: ");
        double altura = sc.nextDouble();
//        /2. Resuelve el ejercicio primero con variables de tipo entero y después con variables de tipo float.// pasamos porque no es correcto
        //hacerlo asi
        double area = (base * altura)/2;
        System.out.println("aresa es" + area);
    }
}
