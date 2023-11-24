/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_p4_funcion_arreglo;

/**
 *
 * @author Gabael
 */
public class EVA3_P4_FUNCION_ARREGLO {

    public static void main(String[] args) {
        int [] arreglo;
        arreglo = crearArreglo(10);
        for (int valor : arreglo)
        System.out.println("[" + valor + "]" );
    
        
        
    }
    public static int [] crearArreglo (int tama){
    int [] arreglo = new int [tama];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo [i] = (int)(Math.random()*100);
        }
        return arreglo;
    }
}
