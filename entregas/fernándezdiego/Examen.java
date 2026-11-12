import java.util.Scanner;
public class Examen{
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        final int NUMERO_ASIG;
        do { 
            System.out.println("Cuantas asignaturas estas: ");
            NUMERO_ASIG = scannerInt();
            
        } while (1>NUMERO_ASIG<10);
        int suma = 0;
        for(i:i<=NUMERO_ASIG:i++){
        System.out.println("Di la nota de la asignatura " i+1);
        
        suma = suma +1;
        }
        double promedio = suma/NUMERO_ASIG;
        System.out.println(promedio);
        

    }
}