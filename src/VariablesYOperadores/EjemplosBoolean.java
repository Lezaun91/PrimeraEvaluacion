package VariablesYOperadores;

public class EjemplosBoolean {
    public static void main(String[] args) {
        boolean apto = false;
        System.out.println("¿es apto? " + apto);

        // Operadores logicos son 4:
        // Unario: ! NOT
        apto = !apto;
        System.out.println("¿es apto " + !apto);

        //Operador binarios: Se utilizan con 2 variables
        // AND
        System.out.println("AND");
        System.out.println("===");
        boolean v1 = true;
        boolean v2 = true;
        boolean and = v1 && v2;
        System.out.println(and);

        // Or o ||
        System.out.println("OR");
        boolean or = v1 || v2;
        System.out.println(or);

        // xor ^
        boolean xor = v1 ^ v2;
        System.out.println(xor);

    }
}
