package src;

import java.util.Scanner;

public class Ejercicio10 {

    //clase main
    public static void main(String[] args) {
        Ejercicio10 ej = new Ejercicio10();  
    }
    
    int A [][] = new int[3][4];
    int B [][] = new int[4][3];

    int x, y, aleatorio, sumaFila = 0;
    
    
     public Ejercicio10(){
        //valores
        for(int x = 0 ; x < 3; x++){
                for (int y = 0; y < 4; y++) {
                    aleatorio =(int)(Math.random() * (50));
                    A [x][y] = aleatorio;
                }
        }
         
        //ciclo para mostrar datos ingresados
        for(int x = 0 ; x < 3; x++){
            for (int y = 0; y < 4; y++) {
                System.out.print(A[x][y] +"\t"); 
            }

            System.out.println();
        }

        
        //traspuesta
        System.out.println();
        for(int x = 0 ; x < 3; x++){
            for (int y = 0; y < 4; y++) {
                B[y][x] = A[x][y]; 
            }

            System.out.println();
        }
        
        //mostrar
        for(int x = 0 ; x < 4; x++){
            for (int y = 0; y < 3; y++) {
                System.out.print(B[x][y] + "\t"); 
            }

            System.out.println();
        }
        
    }
 
}