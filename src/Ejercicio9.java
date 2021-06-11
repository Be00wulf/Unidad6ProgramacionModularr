package src;

import java.util.Scanner;

public class Ejercicio9 {

    //clase main
    public static void main(String[] args) {
        Ejercicio9 ej = new Ejercicio9();  
    }

    //Arreglos con elementos (global)
    int A [] = new int[5];
    int B [] = new int[5];
    Scanner entrada = new Scanner(System.in);
    int x;
    int numeros1, numeros2, suma;
    
    //constructor, ejecutaremos la lógica principal
    public Ejercicio9(){
        //valores
        for(int x = 0 ; x < 5; x++){
            System.out.print("Ingrese una valor: ");
            numeros1 = entrada.nextInt();
            A[x] = numeros1;
                
        }
         
        //ciclo para mostrar datos ingresados
        for(int x = 0 ; x < 5; x++){
            System.out.print("Ingrese otro valor: ");
            numeros2 = entrada.nextInt();
            B[x] = numeros2;
        }
        
        for(int x = 0 ; x < 5; x++){
            suma = A[x] + B[x];
            System.out.println(suma);
        }
        

    }
}