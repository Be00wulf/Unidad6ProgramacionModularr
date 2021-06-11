package src;
import java.util.Scanner;

public class Ejercicio5 {

    //clase main
    public static void main(String[] args) {
        Ejercicio5 ej = new Ejercicio5();  
    }
    
    Scanner entrada = new Scanner(System.in);
        int numero, elementos=0, resultado=0;
        float media; 
        
        
     public Ejercicio5(){
     
        
        System.out.println("Calculadora de medias: digite un numero");
        numero = entrada.nextInt();
        
        
        
        while (numero >= 0) {            
            resultado = resultado + numero;     //suma iterativa
       
               elementos++;
               
               System.out.println("Digite otro numero o presione uno negativo para salir");
               numero = entrada.nextInt();
        }
        
        
        
        if (elementos == 0) {
            System.out.println("Error: la division entre 0 no existe");
        } else {
            media = (float)(resultado / elementos);     //se convierte en float ya que resultado y elementos son int
            System.out.println("La media es: " + media);
        }
        
    }
 
}