package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
//        Escribe un programa que lea cuatro números por teclado y decremente cada uno de
//        ellos. El programa debe mostrar los resultados en la misma línea, en el mismo orden
//        que entraron, separados por espacios.

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        n3 -= 1;
        n4--;

        System.out.println( (n1 - 1) + " " + --n2 + " " + n3 + " " + n4);
    }
}
