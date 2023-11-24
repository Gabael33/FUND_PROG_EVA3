/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_p3_factorial;

/**
 *
 * @author Gabael
 */
public class EVA3_P3_FACTORIAL {

    public static void main(String[] args) {
        int num = 5;
        System.out.println("El valor factorial de 5 es: " + calcularFactorial (num));
        System.out.println("");
        System.out.println("------------------------");
        int base = 2;
        int potencia = 2;
        System.out.println("El valor de 2 a la potencia 2 es: " + calcularPotencia(base, potencia));
    }
    public static int calcularFactorial (int num){
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
           factorial *= i; //= factorial = factorial * i;
        }
        return factorial;
    }
    public static int calcularPotencia (int base, int potencia){
        int resultado = 1;
                
        for (int i = 1; i <= potencia; i++) {
             resultado = resultado * base;
        }
        return resultado;
    }
}
