/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_p8_tuttifruti;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA3_P8_TUTTIFRUTI {
     final static String USUARIO = "TUTTI";
        final static String PASSWORD = "FRUTTI";

    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      String usuario;
      String pwd;
        do{
            System.out.println("Usuario:");
            usuario = input.nextLine();
            System.out.println("Password:");
            pwd = input.nextLine();
      }while(!validarUsuario(usuario, pwd));
        System.out.println("BIENVENIDO!!!");
         
    }
    
    public static boolean validarUsuario (String usuario, String pwd){
    if(usuario.equals(USUARIO) && pwd.equals(PASSWORD))
        return true;
    else
        return false;
        
    }
}
