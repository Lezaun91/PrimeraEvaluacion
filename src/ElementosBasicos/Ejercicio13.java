package ElementosBasicos;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*Imagina que eres un gerente de recursos humanos en un restaurante y necesitas
contratar a un chef. Para hacer eso, necesitas recopilar algunos datos preliminares
sobre los candidatos, concretamente 5 campos: nombre, edad, años de experiencia,
preferencia de cocina. Escribe un programa que lea todas las palabras (o números)
una a una e imprima lo siguiente: "El formulario de <NOMBRE>, de <EDAD> años
y <AÑOS DE EXPERIENCIA> de experiencia, está completo. Nos comunicaremos
con usted si necesitamos a alguien que cocine comida <PREFERENCIA DE
COCINA>".
         */
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        int edad = sc.nextInt();
        int añosExperiencia = sc.nextInt();
        //para que no sale aladunis ka siguiente linea
        sc.nextLine();
        String platoFavorito = sc.nextLine();


        System.out.println("el formulario de " + nombre + ", de" + edad + "años y " +  añosExperiencia + "de experencia, esta completo. Nos comunicamos con usted" + " si necesitamos a alguien que cocine" + platoFavorito);
        System.out.println();
        System.out.println();
        System.out.println();

    }
}
