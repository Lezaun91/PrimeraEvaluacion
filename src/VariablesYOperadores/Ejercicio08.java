package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        /*Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este
        tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos
        son 3 horas, 30 minutos y 10 segundos.
         */
        //recibe un tiempo en segundos
         Scanner sc = new Scanner(System.in);
         int segundos = sc.nextInt();// por ejemplo 3751 segundos

         //calcular de este tiempo las horas, minutos y segundos.


         // de los segundos que entran, primero dividio por 60 para saber cuantos minutos y segundos hay.
         int minutos = segundos / 60; // 62 minutos con ese ejemplo
         int segundosRestantes = segundos % 60; //el resto es 31 segundos

        //en estos minutos puede haber una hora o mas, como en este caso

        int horas = minutos / 60;// en el ejemplo 1
        int minutosRestantes = minutos % 60; //en el ejemplo 2

        //tiempo expresado en horas, minutos y segundos.
        System.out.println(segundos + " contienen" + horas + " horas" + minutosRestantes + " minutos " + segundosRestantes + " segundos ");



             }
}
