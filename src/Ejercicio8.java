package src;

import java.util.Scanner;

public class Ejercicio8 {

    //clase main
    public static void main(String[] args) {
        Ejercicio8 ej = new Ejercicio8();  
    }

    //Arreglos con elementos (global)
    String A [] = new String[5];
    String B [] = new String[5];
    Scanner entrada = new Scanner(System.in);
    int x;
    String palabra1, palabra2;
    
    //constructor, ejecutaremos la lógica principal
    public Ejercicio8(){
        //valores
        for(int x = 0 ; x < 5; x++){
            System.out.println("Ingrese una palabra");
            palabra1 = entrada.next();
            A[x] = palabra1;
                
        }
         
        //ciclo para mostrar datos ingresados
        for(int x = 0 ; x < 5; x++){
            System.out.println("Ingrese otra palabra");
            palabra2 = entrada.next();
            B[x] = palabra1;

            System.out.println();
        }
        
        for(int x = 0 ; x < 5; x++){
            if (A[x].equals(B[x])) {
                System.out.println("iguales");
            }   else{
                System.out.println("diferentes");
            }
        }
        

    }
}