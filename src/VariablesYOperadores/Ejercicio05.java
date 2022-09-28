package VariablesYOperadores;

public class Ejercicio05 {
    public static void main(String[] args) {
        /*Escribe un programa que lea un valor entero n de la entrada estándar y muestre el
        resultado de la siguiente expresión aritmética:
        ((n + 1) * n + 2) * n + 3
         */
        int n = 4;
        int suma = n + 1;
        int multi = (suma * n + 2);
        int multi2 = (multi) * n + 3;

        System.out.println(suma + multi + multi2);
        //hay que hacerlo por scanner a eso se refiere la entrada estandar
    }
}
