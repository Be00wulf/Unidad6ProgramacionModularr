package src;

public class Ejercicio2 {

    //clase main
    public static void main(String[] args) {
        Ejercicio2 ej = new Ejercicio2();
       
    }
    
    
    
    //Arreglos con 10 elementos (global)
    int[] arreglo = new int[10];
    //Scanner entrada = new Scanner(System.in);
    int aleatorio, datoMayor = 0, repeticiones = 0;
    
    
    
    //constructor, ejecutaremos la lógica principal
    public Ejercicio2(){
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
        
        //valor repetido
        for(int i = 0 ; i < 10; i++){
            valorRepetido(i);
        }
      
        //mostrar datos 
        System.out.println(mostrarDatos());
    }
    
    
    
    //metodos
              //generarValor(i)             *enumera
    public void generarValor(int numero){
        aleatorio = (int)(Math.random() * (99));
        System.out.println("Se genero el valor No. " + numero + ": " + aleatorio);
      //arreglo[posicion] = entrada.nextInt();
        arreglo[numero] = aleatorio;
    }
    
    
    
              //mostrarDato(i)
    public void mostrarDato(int numero){
        System.out.println("Indice: "+numero+ " Valor: "+ arreglo[numero]);
    }
    
    
    
    public void valorMayor(int numero){
        int actual = arreglo[numero];
        if (actual > datoMayor) {
            datoMayor = actual;
        }  
    }
    
    
    public void valorRepetido(int numero){
        if (arreglo[numero] == datoMayor) {
            ++repeticiones;
        }
    }
    
    public String mostrarDatos(){
        return "El dato mayor es: " + datoMayor + " y se repite en " + repeticiones + " ocasion(es)";
    }
    
}