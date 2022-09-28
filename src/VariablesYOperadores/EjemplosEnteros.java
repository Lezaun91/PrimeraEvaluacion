package VariablesYOperadores;

import java.util.Scanner;

public class EjemplosEnteros {
    public static void main(String[] args) {
        //perdor por teclado dos numeros y guardarlos en dos varibles de tipo entero.
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int num2 = sc.nextInt();

        //Crear variables que guarden el resultado de las cinco operaciones posible
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multi = num1 * num2;
        int cociente = num1 / num2;
        int resto = num1 % num2;

        //Mostrar el resultado de cada operacion
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + multi);
        System.out.println(num1 + " / " + num2 + " = " + cociente);
        System.out.println(num1 + " % " + num2 + " = " + resto);
        System.out.println("El resto de dividir " + num1 +" entre " + num2 + " es igual a " + resto);
    }
}
