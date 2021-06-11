package src;
import java.util.Scanner;

public class Ejercicio11 {

    //clase main
    public static void main(String[] args) {
        Ejercicio11 ej = new Ejercicio11();  
    }
    String A [] = new String[6];
    double B [] = new double[6];
    Scanner entrada = new Scanner(System.in);
    int x;
    double nota;
    String nombre; 
    
     public Ejercicio11(){
     //nombres
        for(int x = 0 ; x < 6; x++){
            System.out.println("Nombre del alumno #" + x);
            nombre = entrada.next();
            A[x] = nombre;
                
        }
    //notas
        for(int x = 0 ; x < 6; x++){
            System.out.println("Ingrese la nota del alumno #" + x);
            nota = entrada.nextDouble();
            B [x] = nota;
        }

        
    //ciclo para mostrar datos ingresados
        for(int x = 0 ; x < 6; x++){
            System.out.println("Alumno #" + x +" " + A[x] + " Nota: " + B[x]);
            if (B[x] >=0 && B[x] <= 4.99)  {
                System.out.println("Suspenso");
            }   else if (B[x] >=5 && B[x] <= 6.99) {
                System.out.println("Bien");
            }   else if (B[x] >=7 && B[x] <= 8.99) {
                System.out.println("Notable");
            }   else if (B[x] >=9 && B[x] <= 10) {
                System.out.println("Sobresaliente");
            }
            System.out.println();
        }
        
    }
 
}