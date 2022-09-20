package ElementosBasicos;

public class LasVariables {
    public static void main(String[] args) {
        // Variables
        int a = 5; // declaro la variable a (a partir de ahora hay un trocito de memoria que se llama a)
        //por fvor, las variables en minúsculas.
        // y a continuación guardo en ella el valor 5.
        System.out.println("La variable a vale" + a);
        // su valor puede ser modificado en cualquier momento
        a = 8;
        System.out.println("La variable a vale" + a);


        //reglas para nombras variables
        //int0a = 5; (peta)
        //no puede comenzar por ningun digito
        //Int 5c = 4;--> no compila
        //puede contener cualquier letra o digito
        int c58= 2;
        //no puede contener ninfun caracter  especial (signos de puntuacon...)
        //a excepcion de los caracteres _ y simpolo dolar
        int _variable = 3;
        int $otravariable = 4;
        //No puede contener espacion
        //int otra variable, --> no compila

        System.out.println("TIPOS DE VARIABLES");
        System.out.println("===========");
        System.out.println("Las variables se declara poniendo 1´ el tiepo de variable que es y 2´ el nombre que le damos a la variable");
        System.out.println("variables para números enteros: byte, short, int, long");
        System.out.println("byte");
        byte variableBytepos = 127; // es el número mas grande que pueda guardar en una variable de tipo byte
        byte variableByteneg = -128; //es el numero mas pequeño que puedo guardar en una variable byte
        System.out.println("variableBytepos = " + variableBytepos);
        System.out.println("variableByteneg = " + variableByteneg);
        System.out.println("Números con decimales: float o double");
        // va a dar error int decimal = 3,14
        double numero = 3;
        System.out.println(numero);
        float otroDecimal = 8.43f; // si declars una variable de tipo float ponemos una f al final del dato


    }
}
