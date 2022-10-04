package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio03bis {
    public static void main(String[] args) {


        //este en inventado para ver la diferencia entre que me pregunten una cosa u otra habiendo if de por medio
        Scanner sc = new Scanner(System.in);
        System.out.print("primer numero: ");
        int numero1 = sc.nextInt();
        System.out.print("segundo numero: ");
        int numero2 = sc.nextInt();

        // indique si el primere es mauor es igual o menos que el segundo
        if (numero1 > numero2) {
            System.out.println("el primero es mayor que el segundo");
        } else if (numero1 == numero2) {
            System.out.println("los dos numeros son iguales");
        } else if (numero1 < numero2) {
            System.out.println("el primero menos que el segundo");
        }
    }
}