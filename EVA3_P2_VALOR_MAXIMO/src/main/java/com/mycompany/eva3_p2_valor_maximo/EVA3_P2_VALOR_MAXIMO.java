/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_p2_valor_maximo;

/**
 *
 * @author Gabael
 */
public class EVA3_P2_VALOR_MAXIMO {

    public static void main(String[] args) {
        //utilizar directamente la funcion
        System.out.println(buscarMaximo(100,200));
        //guardar el valor y usarlo despues
        int resu = buscarMaximo (100, 200);
        System.out.println(resu);
        //Llamar la funcion e ignorar el resultado
        buscarMaximo(100,200);
    }
    
    public static int buscarMaximo(int num1, int num2){
        /*if (num1 > num2)
            return num1;
        else
            return num2;*/
        int resultado;
        
        if (num1 > num2)
        resultado = num1;
        else 
            resultado = num2;
    
        return resultado;
                    
    }
}
