package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        /*Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el
        vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las
        tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta
        su sueldo base y comisiones.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Mi suelto base es " );//1100
        double sueldoBase = sc.nextDouble();
        System.out.print("importa venta 1 ");
        double venta1 = sc.nextDouble();
        System.out.print("importe venta 2 ");
        double venta2 = sc.nextDouble();
        System.out.print("importe venta 3 ");
        double venta3 = sc.nextDouble();

        double comisionVenta1 = venta1 * 10 /100;
        System.out.println("Mi primera comision es: " + comisionVenta1);//150 es 15

        double comisionVenta2 = venta2 * 10 /100;
        System.out.println("MI segunda comision es :" + comisionVenta2);//200 es 20

        double comisionVenta3 = venta3 * 10 /100;
        System.out.println("Mi tercera comision es :" + comisionVenta3);//175 es 17,5

        double totalComisiones = comisionVenta1+comisionVenta2+comisionVenta3;
        System.out.println("Total comisiones es:" + totalComisiones);

        double sueldoTotal = sueldoBase+ totalComisiones;// 1152.5
        System.out.print("Mi dinero total es " + sueldoTotal);
    }
}
