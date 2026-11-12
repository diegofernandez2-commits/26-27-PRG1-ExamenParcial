import java.util.Scanner;
public class Examen{
    public static void main(String[] args){
        System.out.println("Examen parcial PRG1");
        Scanner scanner =  new Scanner(System.in);
        final int EDAD;
        System.out.println("dime tu edad: ");
        EDAD = Scanner.Int();
        if (EDAD>=18){
            System.out.println("eres mayor de edad");
        }else{
            System.out.println("eres menor de edad");
        }
        System.out.println("Cuantas asignaturas estas matriculado: ");
        final int ASIGNATURAS = Scanner.int();

    }
}