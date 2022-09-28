package VariablesYOperadores;

import java.util.Scanner;

public class EjemplosDecimales {
    public static void main(String[] args) {
        double ceroComaCero = 0.0;
        double unoComaCero = 1.0;
        double decimalNegativo = - 1.4567;

        //tipo float
        float decimalfloat =1.3f;
        float decimalLargo = -3.12125545566688545f;
        System.out.println(decimalLargo);// perdemos precision

        //Notacion cientefica
        double eps = 5e-3; // es lo mismo que 5 * 10^(-3) = 0.005
        System.out.println(eps);
        double n = 0.01e2; // es lo mismo que 0.01 * 10^2 = 1.0
        System.out.println(n);
        //Operciones aritmeticas:
        System.out.println("suma: " + (eps + n));
        System.out.println("resta: " + (eps - n));
        System.out.println("producto: " + (eps * n));
        System.out.println("division: " + (eps / n));
        //no tiene sentido hacer el % resto

        //¿que pasa si divides numeros enteros y los guardo en una varianle con dcecimales?
        double d1 = 5 / 4;//divide dos numeros enteros (division entera) y lo asigna a la variable decimal.
        System.out.println("Division 1: " + d1);
        double d2 = 5.0 / 4.0;// divide dos numeros decimales (division decimal)
        System.out.println("division 2; " +d2);

        //falta de precision a veces con las variables primitivas decimales
        System.out.println(3.3 / 3); // imprime 1.0999999999999999

        double d = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println(d); // imprime 0.9999999999999999

        //leer desde teclado
        Scanner sc = new Scanner(System.in);
        float decimalPorTeclado = sc.nextFloat(); //los numeros decimales se escriben con ,
        System.out.println(decimalPorTeclado);
        double doublePorTeclado = sc.nextDouble();
        System.out.println(doublePorTeclado);
    }
}
