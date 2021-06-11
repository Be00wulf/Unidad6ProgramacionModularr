package src;

public class Ejercicio6 {

    //clase main
    public static void main(String[] args) {
        Ejercicio6 ej = new Ejercicio6();  
    }

    //Arreglos con elementos (global)
    int A [][] = {{5,6,13}, {14,2,4},{21,7,6}};
    int B [][] = new int[3][3];
    int x,y;
    
    //constructor, ejecutaremos la lógica principal
    public Ejercicio6(){
        //valores
        for(int x = 0 ; x < 3; x++){
                for (int y = 0; y < 3; y++) {
                    B [x][y] = A[x][y] * 2;
                }
        }
         
        //ciclo para mostrar datos ingresados
        for(int x = 0 ; x < 3; x++){
            for (int y = 0; y < 3; y++) {
                System.out.print(B[x][y] +"\t");
                
            }
            System.out.println();
        }

    }
}