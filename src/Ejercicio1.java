package src;

//Ejercicio1
import java.util.Scanner;
public class Ejercicio1 {

    //clase main
    public static void main(String[] args) {
        Ejercicio1 ej = new Ejercicio1();
    }
    
    
    
    //Arreglos con 5 elementos (global)
    int[] arreglo = new int[5];
    Scanner entrada = new Scanner(System.in);
    
    
    
    //constructor, ejecutaremos la lógica principal
    public Ejercicio1(){
        

        //ciclo para pedir valores
        for(int i = 0 ; i < 5; i++){
            pedirValor(i);
        }
        
        
        //ciclo para mostrar datos ingresados
        for(int i = 0 ; i < 5; i++){
            mostrarDato(i);
        }
    }
    
    
    
    //metodos
              //pedirValor(i)
    public void pedirValor(int numero){
        System.out.print("Ingrese el valor No. " + numero + ": ");
      //arreglo[posicion] = entrada.nextInt();
        arreglo[numero] = entrada.nextInt();
    }
    
    
    
              //mostrarDato(i)
    public void mostrarDato(int numero){
        System.out.println("Indice: "+numero+ " Valor: "+ arreglo[numero]);
    }
    
    
    
}