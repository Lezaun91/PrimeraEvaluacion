package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        //Escribe un programa que pida dos números e indique si el primero es mayor que el
        //segundo o no.
        Scanner sc = new Scanner(System.in);
        System.out.print("primer numero: ");
        int numero1 = sc.nextInt();
        System.out.print("segundo numero: ");
        int numero2 = sc.nextInt();
        if (numero1>numero2){
            System.out.println("el primer numero es mayor");
        } else {//sino es mayor es menor o igual
            System.out.println("el segundo numero es mayor");
        }
    }
}
