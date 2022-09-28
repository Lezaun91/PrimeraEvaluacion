package VariablesYOperadores;

public class Ejercicio15 {
    public static void main(String[] args) {
       /* 15. Realiza un programa que calcule el área de una circunferencia de radio 5,2
        centímetros.
        */
        // Math.pow (base,exponente) 3*3*3*3*3 = Math.pow(3,5)

        //Forula pi * radio al cuadrado

        //como me dce lo que mide el radio no tenfo que pedirlo por teclado
        double radio = 5.2;
        double area = Math.PI * Math.pow(radio,2);
        //System.out.println(area); //con esto muestra todos los decimales
        System.out.printf("El resultado es %.2f",area);
    }
}
