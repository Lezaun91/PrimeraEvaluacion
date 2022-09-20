package ElementosBasicos;

import java.util.Scanner;

public class EjemplosLeerPorTeclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ahora ya podemos meter datos por teclado
        //pero para poder utilizarlos después en el programa
        //tenemos que guardarlos en una variable (la vriable sirven para guardar datos)
        //las variables que guardan palabras o cadenas de texto se llaman strong
        System.out.println("introduce tu nombre:");
        String nombre= sc.nextLine(); //escribo el nombre en el teclado y lo guarda en la variable nombre
        System.out.println("hola, " + nombre);
        System.out.println("introduce tus apellido:");
        //crea otra variable para guardar el apellido que v a entrar por teclado
        String apellidos= sc.nextLine();
        System.out.println("hola, " + nombre + " " + apellidos);
        System.out.println("¿cuantos años tienes:?");
        int edad = sc.nextInt();
        /*
        Este metodo nexint() tiene un peligro si a continuacion pones un nextline(), se lo salta.
        La manera de evitarlo es: Cada vez que yo esxcribo nextInt(), si se que luego voy a poner nextLine()
        , escribo un nextline adicional, sin mas, de est manera "limpiamos" el sc.
         */
        sc.nextLine();//esto es solo para evitar que salte
        System.out.println("vaya, pareces muy joven para tener " + edad + " años.");
        System.out.println("¿tienes mascota?");
        String mascota= sc.nextLine();
        System.out.println("Perfecto");
        //vamos a meter un dato con decimales.
        System.out.println("¿y cyal es tu patrimonio?");
        double patrimonio = sc.nextDouble();
        System.out.println("¡" + patrimonio + "!");
        // Cuando los escribimos en el codigo fuente pone .
        //Cuando metemos los datos por teclado se pone: ,
    }
}
