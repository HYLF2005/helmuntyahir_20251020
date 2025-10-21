/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helmuntyahir_20251020;

/**
 *
 * @author UFG
 */
public class Pila {
    
    private int[] elementos;
    private int cima;
    private int capacidad;
    
    //METODO CONSTRUTOR DE LA CLASE PILA
    //AL INSTANCIAR UNA NUEVA VARIABLE DE TIPO PILA, ENTONCES
    //SE CREARA EN MEMORIA UN OBJETO
    public Pila(int tamaño){
        
        this.capacidad = tamaño;
        this.elementos = new int[this.capacidad];
        this.cima =-1;
        
    }
    
    public boolean estaVacia(){
        if(this.cima == -1){
            return true;
            
        }else{
            //EL VALOR DE LA CIMA ES UN NUMERO DIFERENTE DE -1 POR LO TANTO LA PILA SITIENE UN VALOR
            return false;
        }
    }
    
    public boolean estaLlena(){
        
        if(this.cima == (this.capacidad -1) ){
            //El valor de la cima es igual a la cantidad de elementos
            return true;
            
        }else{
            //el valor de la cima es distinto
            return false;
        }
    }
    //Devuelve el valor de la cima, es decir el valor del ultimo elemento que fue insertado
    public int tamaño(){
        return this.cima + 1;
    }
    //METODO PARA AGREGAR ELEMENTOS AL ARREGLO
    public void push(int elemento){
        
        if(estaLlena()){
            System.out.println("La pila esta llena, no puede agregar el valor: "+elemento);
            
        }else{
            this.cima++;//SE INCREMENTA EL VALOR DE LA CIMA 
            this.elementos[this.cima] = elemento;//SE AGREGA EL ELEMENTO NUEVO AL ARREGLO 
            System.out.println("El valor: "+elemento+" fue agregado a la pila");
        }
    }
    
    public int pop(){
        if(estaVacia()){
            System.out.println("La pila esta vacia, no puede hacer la extraccion del elemento");
            return -1;
        }else{
            int elementoExtraido = this.elementos[this.cima];
            this.cima--;//se reduce el valor de la cima debido a que ya se extrajo un elemento
            return elementoExtraido;//se devuelve al usuario el valor que fue extraido
        }
    }
    
    
    public int peek(){
        if(estaVacia()){
            //si esta vacia por lo tanto, se muestra mensaje al usuario
            System.out.println("La pila esta vacia");
            //no se realiza ninguna accion 
            return -1;
        }else{
            //se devuelve al usuario el ultimo elemto que fue insertado
            //y que es el proximo elemnto a ser extraido
            return this.elementos[this.cima];
            
        }
    }
    
    public void mostrar(){
        
        if(estaVacia()){
            System.out.println("La pila esta vacia");
        }else{
            System.out.print("Conteo de la pila desde la cima, hasta la base de la pla");
            System.out.print("[");
            
            for(int i = this.cima; i >=0; i--){
                System.out.println(this.elementos[i]);
                if(i>0){
                    System.out.print(",");// se imprime una coma
                }
            }
            //se cierra la estructura de corchete para la salida del usuario final
            System.out.print("]");
        }
    }
    
}
