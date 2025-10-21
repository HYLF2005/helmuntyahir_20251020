/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helmuntyahir_20251020;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila miPila = new Pila(5);
        
        System.out.println(" La pila esta vacia?   "+miPila.estaVacia());
        System.out.println();
        
        System.out.println("AGREGANDO VALORES CON METODO PUSH()");
        miPila.push(10);
        miPila.push(20);
        miPila.push(30);
        miPila.push(40);
        miPila.push(50);
        
        System.out.println();
        
        miPila.mostrar();
        System.out.println("Tamaño actual de la pila "+miPila.tamaño()+" elementos");
        System.out.println();
        
        System.out.println("AGREGAR ELEMENTO NUEVO CON LA PILA LLENA");
        miPila.push(60);
        System.out.println();
        
        System.out.println("Verificacion del ultimo vaalor agregado");
        System.out.println("El elemento de la cima es: "+miPila.peek());
        System.out.println();
        
        System.out.println("Extraer valores del la pila");
        System.out.println("Se ha extraido el valor de: "+miPila.pop());
        System.out.println("Se ha extraido el valor de: "+miPila.pop());
        System.out.println();
        
        System.out.println("Mostrar valores de la pila");
        miPila.mostrar();
        System.out.println("Tamaño actual de la pila "+miPila.tamaño()+" elemento");
        System.out.println();
        
        System.out.println("Se extraen todos los elementos de la pila");
        while(!miPila.estaVacia()){
            System.out.println("Se ha extraido el valor de: "+miPila.pop());
        }
        System.out.println();
        
        miPila.pop();
        System.out.println();
        
        System.out.println("VERIFICACION DEL ULTIMO VALOR AGREGADO");
        System.out.println("El elemento de la cima es: "+miPila.peek());
        System.out.println();
    }
    
}
