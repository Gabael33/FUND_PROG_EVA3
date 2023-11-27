/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_p6_paso_parametros_referencia;

/**
 *
 * @author Gabael
 */
public class EVA_P6_PASO_PARAMETROS_REFERENCIA {

    public static void main(String[] args) {
        int arreglo [] = new int [5];
        System.out.println("La direccion del arreglo es " + arreglo);
        
        llenarArreglo(arreglo);
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + arreglo[i] + "]");
        }
        
    }
    public static void llenarArreglo (int [] valores){
        System.out.println("La direccion de valores es " + valores);
        for (int i = 0; i < valores.length; i++) {
           valores[i] = (int)(Math.random()*100);
           
        }
    }
}
