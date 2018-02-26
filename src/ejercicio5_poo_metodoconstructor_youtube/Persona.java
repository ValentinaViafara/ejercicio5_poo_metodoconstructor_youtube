/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_poo_metodoconstructor_youtube;

/**
 *
 * @author danie
 */
public class Persona {
    //ATRIBUTOS
    String nombre;
    int edad;
    
    //Metodo constructor 
    public Persona(String nombre, int edad){
        //se pone this para que se entienda que ese nombre y edad es el atributo y que no saque valor NULL
        this.nombre=nombre;
        this.edad=edad;
    }
    
    //METODOS
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("la edad es: "+edad);
    }
}
