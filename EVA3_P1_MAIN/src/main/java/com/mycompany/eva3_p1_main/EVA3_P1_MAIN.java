/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_p1_main;

/**
 *
 * @author Gabael
 */
public class EVA3_P1_MAIN {

    public static void main(String[] args) {
        //Llamada a funcion
        imprimirMensaje("Hola mundo!!" , 3);
    }
    public static void imprimirMensaje(String mensaje, int cant){
        for (int i = 0; i < cant; i++) {
        System.out.println(mensaje);    
        }
        
    }
   
}
