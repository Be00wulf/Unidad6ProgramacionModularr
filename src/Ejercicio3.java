package src;

import java.util.Scanner;
public class Ejercicio3 {

    //clase main
    public static void main(String[] args) {
        Ejercicio3 ej = new Ejercicio3();
       
    }
 
    
    //Arreglos con 8 elementos (global)
    int[] arreglo = new int[8];
    Scanner entrada = new Scanner(System.in);
    int aleatorio, seleccion;
    boolean meta = false;
    
    
    //constructor, ejecutaremos la lógica principal
    public Ejercicio3(){
        //ciclo para pedir valores
        for(int i = 0 ; i < 8; i++){
            generarValor(i);
        }

        //ciclo para mostrar datos ingresados
        for(int i = 0 ; i < 8; i++){
            mostrarDato(i);
        }
        
        //valor buscado
        System.out.println("¿Que numero entero busca?");
        seleccion = entrada.nextInt();


        //coincidencia
        for(int i = 0 ; i < 8; i++){
            valorBuscado(i);
            
        }

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
    
    
            //buscar
    public void valorBuscado(int numero){
        if (seleccion == arreglo[numero]) {
            meta = true;
            System.out.println("Posicion: " + numero + " coincidencia = " +meta);
        }  else {
            meta = false; 
            System.out.println("Posicion: " + numero + " coincidencia = " +meta);
        }  

    }

    
}