package VariablesYOperadores;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
//Escribe un programa que calcule (y muestre) cuántas horas, minutos y segundos han transcurrido entre dos momentos del mismo día.

// Para ello, el programa ha de pedir

//por teclado seis números enteros:
// las horas, minutos y segundos para el momento
        Scanner sc = new Scanner(System.in);
        System.out.println("MOMENTO INICIAL");
        System.out.println("===============");
        System.out.println("Introduce la hora");
        int hora1 = sc.nextInt();
        System.out.println("Introduce los minutos");
        int minuto1 = sc.nextInt();
        System.out.println("Introduce los segundos");
        int segundos1 = sc.nextInt();

        //inicial y lo mismo para el momento final.

        System.out.println("MOMENTO FINAL");
        System.out.println("===============");
        System.out.println("Introduce la hora");
        int hora = sc.nextInt();
        System.out.println("Introduce los minutos");
        int minuto = sc.nextInt();
        System.out.println("Introduce los segundos");
        int segundos = sc.nextInt();
        System.out.println("datos introducidos: momento inicial" + hora1 + ":" + minuto1 +":" + segundos1 + "\t" + "momento final: " + hora +":" + minuto +":" +segundos);



        // De momento vamos a considerar que los números introducidos van a estar en el rango adecuado y que el momento inicial introducido es menor (o igual) que el momento final.


        // EL TRUCO; PASAR A SEGUNDOS EL MOMENTOINICIAL
        int segundosCambiados1= hora1 * 60 * 60;
        int segundosCambiados2 = minuto1 *60;
        int momentoInicialensegundos = segundosCambiados1 + segundosCambiados2 + segundos1;
       //System.out.println(momentoInicialensegundos);

        //pasmos a segundos el MOMENTO FINAL

        int segundosCambiados = hora * 60 * 60;
        int segundosCambiadoss = minuto * 60;
        int momentoFinalsegundos = segundosCambiados + segundosCambiadoss +segundos;
        //System.out.println(momentoFinalsegundos);//muestro en pantalla para ver si voy bien


        //HALLAR LA DIFERENCIA EN AMBOS

        int diferenciaEnSegundos =momentoFinalsegundos - momentoInicialensegundos;
        //System.out.println(diferenciaEnSegundos);
        //System.out.println(diferenciaEnSegundos /60);
        //System.out.println(diferenciaEnSegundos % 60);
        //System.out.println(diferenciaEnSegundos);

        //extraigo los segundos
        int segundosDiferencia = diferenciaEnSegundos % 60;
        //extraigo los minutos totales que tengo en esos segundos
        int minutosTotalesDiferencia = diferenciaEnSegundos / 60;
        //de esos minutos extraigo las horas
        int horasDiferencia = minutosTotalesDiferencia / 60;
        int minutosDiferencia = minutosTotalesDiferencia % 60;




        // El programa debe mostrar por pantalla la diferencia en el formato: hh:mm:ss.
        System.out.println("la diferencia entre ambos momentos es: " + horasDiferencia + ":" + minutosDiferencia + ":" + segundosDiferencia);
    }
}
