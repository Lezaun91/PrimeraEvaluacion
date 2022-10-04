package VariablesYOperadores;

public class EjemplosCasting {
    public static void main(String[] args) {
        int num = 100;// int ocupa en memoria 32 bits
        long numGrande = num;//puedo asignar un int a long sin mas (casting implicito)


        //y al reves??
        long numGrande1 = 101;// long ocupad 64 bits
        int entero = (int) numGrande;// esto es un casting explicito

        //de int a short (16 bits)
        short num2 = (short) num;// no puedo hacerlo directamente porque int son 32 bits y short 16

        //de char a int
        char letra = 'a';
        int letraAscil = letra;
        System.out.println(letraAscil);

        //de float a double
        float decimal= 3.1416f;
        double decimalDobke = decimal;

        //al reves
        double decimalDoble = 30000000000000000.1235456;
        float deciimalf = (float) decimalDoble;

        //de double a int
        int entero23Bits = (int) decimalDoble;
        System.out.println(entero23Bits);//resultado impresiviblae

        //de double a short
        short entero16Bits = (short) decimalDoble;
        System.out.println(entero16Bits);



    }
}
