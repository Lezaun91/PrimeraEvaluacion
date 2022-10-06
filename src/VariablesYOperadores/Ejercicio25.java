package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        /*Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente
        desea saber cuanto deberá pagar finalmente por su compra.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Precio total de la compra: ");
        double totalCompra = sc.nextDouble();

        double descuento = totalCompra * 15 / 100;
        System.out.println("este es el descuento " + descuento);

        double precioTotal = totalCompra - descuento;
        System.out.println("debe abonar " + precioTotal);

    }
}
