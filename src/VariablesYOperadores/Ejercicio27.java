package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        /*Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha
        calificación se compone de los siguientes porcentajes:
        a. 55% del promedio de sus tres calificaciones parciales.
        b. 30% de la calificación del examen final.
        c. 15% de la calificación de un trabajo final.
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime parcial uno ");
        double calificacion1= sc.nextDouble();
        System.out.print("Dime parcial dos ");
        double calificacion2= sc.nextDouble();
        System.out.print("Dime parcial tres ");
        double calificacion3= sc.nextDouble();
        System.out.print("Dime nota final ");
        double calificacionFinal = sc.nextDouble();
        System.out.print("Dime trabajo final ");
        double trabajoFinal = sc.nextDouble();

        double notaCalificacionesParciales = (calificacion1 + calificacion2 + calificacion3) * 0.55 / 3;
        System.out.println("Calificacion final de parciales : " + notaCalificacionesParciales);

        double notaFinalPorcentaje = calificacionFinal * 0.3;
        System.out.println("Mi nota definitiva final es: " + notaFinalPorcentaje);

        double trabajoFinalPorcentaje = trabajoFinal * 0.15;
        System.out.println("Nota trabajo final es " + trabajoFinalPorcentaje);

        double notaTotal = notaCalificacionesParciales + notaFinalPorcentaje + trabajoFinalPorcentaje;
        System.out.printf("Mi nota final es %.2f", notaTotal);




    }
}
