package src;

import java.util.Scanner;
public class Ejercicio4 {

    //clase main
    public static void main(String[] args) {
        Ejercicio4 ej = new Ejercicio4();  
    }

    //Arreglos con 10 elementos (global)
    int[] arreglo = new int[10];
    Scanner entrada = new Scanner(System.in);
    int aleatorio, datoMayor = 0;
    
    
    //constructor, ejecutaremos la lógica principal
    public Ejercicio4(){
        //ciclo para pedir valores
        for(int i = 0 ; i < 10; i++){
            generarValor(i);
        }

        //ciclo para mostrar datos ingresados
        for(int i = 0 ; i < 10; i++){
            mostrarDato(i);
        }
        
        //valor mayor
        for(int i = 0 ; i < 10; i++){
            valorMayor(i);
        }
        
        //diferencia
        valorDiferencia();
    }
    
    
    //metodos
              //generarValor(i)             *enumera
    public void generarValor(int numero){
        aleatorio = (int)(Math.random() * (90));
        System.out.println("Se genero el valor No. " + numero + ": " + aleatorio);
//      arreglo[posicion] = entrada.nextInt();
        arreglo[numero] = aleatorio;
    }

              //mostrarDato(i)
    public void mostrarDato(int numero){
        System.out.println("Indice: "+numero+ " Valor: "+ arreglo[numero]);
    }
    
            //mayor
    public void valorMayor(int numero){
         int actual = arreglo[numero];
         if (actual > datoMayor) {
             datoMayor = actual;
         } 

     }

            //diferencia
    public void valorDiferencia(){
        for (int i = 0; i < 10; i++) {
            int contador = i + 1;
            int diferencia = datoMayor - arreglo[i];
            System.out.println("La distancia que lo separa del numero mayor es: " + diferencia);
        }
    }
 
}