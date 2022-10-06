package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        /*Realiza un programa que pida el precio de venta de un producto, la cantidad de
        productos comprados y el porcentaje de IVA aplicado. El programa mostrará el
        importe a abonar.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("precio de venta ");
        double producto = sc.nextDouble();//100

        System.out.print("Cantidad productos ");
        int productosComprados = sc.nextInt();// 5

        System.out.print("porcentaje de iva aplicado es ");
        double porcentajeIva = sc.nextDouble(); // 10

        //1)calcula el importe total
        double precioSinIva = producto * productosComprados;//500
        System.out.println(precioSinIva);

        double ivaCalculado = precioSinIva * porcentajeIva/100; //500*10/100 = 50
        System.out.println(ivaCalculado);

        double precioConIva = precioSinIva + ivaCalculado;// 500 + 50
        System.out.println(precioConIva);




    }
}
