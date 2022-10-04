package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        //Realiza un programa que pida las notas de las tres evaluaciones del módulo
        //Programación y muestre la nota final (la nota final es la media de las tres
        //evaluaciones).

        Scanner sc = new Scanner(System.in);
        double nota1 = sc.nextDouble();
        System.out.print("Nota 1 evaluacion;" );
        double nota2 = sc.nextDouble();
        System.out.print("Nota 2 Evaluacion" );
        double nota3 = sc.nextDouble();
        System.out.print("Nota 3 Evaluacion" );

        double suma = nota1 + nota2 + nota3;
        double media= suma/3;
        System.out.printf("la nota final es %.2f", media);
    }
}
