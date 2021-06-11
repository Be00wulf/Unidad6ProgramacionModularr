package src;

public class Ejercicio7 {

    //clase main
    public static void main(String[] args) {
        Ejercicio7 ej = new Ejercicio7();  
    }

    //Arreglos con elementos (global)
    int A [][] = new int[4][3];
    int B [][] = new int[4][3];
    int x, y, aleatorio, sumaFila = 0;
    
    //constructor, ejecutaremos la lógica principal
    public Ejercicio7(){
        //valores
        for(int x = 0 ; x < 4; x++){
                for (int y = 0; y < 3; y++) {
                    aleatorio =(int)(Math.random() * (555));
                    B [x][y] = aleatorio;
                }
        }
         
        //ciclo para mostrar datos ingresados
        for(int x = 0 ; x < 4; x++){
            for (int y = 0; y < 3; y++) {
                System.out.print(B[x][y] +"\t"); 
            }

            System.out.println();
        }

    }
}