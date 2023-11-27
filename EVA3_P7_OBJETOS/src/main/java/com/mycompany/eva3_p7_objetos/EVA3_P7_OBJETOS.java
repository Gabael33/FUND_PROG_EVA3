/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_p7_objetos;

/**
 *
 * @author Gabael
 */
public class EVA3_P7_OBJETOS {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println(persona1);
        persona1.nombre = "Pedro";
        persona1.apellido = "Espinoza";
        persona1.edad = 18;
        imprimirPersonas(persona1);
        
        Persona persona2 = new Persona();
        persona2.nombre = "Uriel";
        persona2.apellido = "Frias";
        persona2.edad = 18;
        imprimirPersonas (persona2);
     
    }
    public static void imprimirPersonas(Persona persona){
        System.out.println("Direccion: " + persona); 
        System.out.println("Nomre completo: " + persona.nombre + " " + persona.apellido);
        System.out.println("Edad: " + persona.edad); 

    }
}
//Creas un nuevo tipo de datos
class Persona {
    String nombre;
    String apellido;
    int edad;
    
}
