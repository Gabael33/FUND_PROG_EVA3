/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eav3_p6_paso_parametros;

/**
 *
 * @author Gabael
 */
public class EAV3_P6_PASO_PARAMETROS {

    public static void main(String[] args) {
        int x = 5;
        System.out.println("El valor de x en el main () es de " + x);
        pasoPorValor(x);
        System.out.println("El valor de x en el main () es de " + x);

    }
    
    //En el paso por valor de argumentos, se envia una copia al metodo
    public static void pasoPorValor(int valor){
        System.out.println("El valor de x en el main () es de " + valor);
        valor++;
        System.out.println("El valor de x en el main () despues de la llamada es de " + valor);

    }
}
