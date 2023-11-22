
package com.mycompany.problema5;

import java.util.Scanner;

public class Problema5 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Determinar el tipo de operacion matematica");
        System.out.println("Ingrese un numero");
        int numero = teclado.nextInt();
        switch (numero){
            case 1:
                System.out.println("Suma");
                break;
            case 2:
                System.out.println("Resta");
                break;
            case 3:
                System.out.println("Multiplicacion");
                break;
            case 4:
                System.out.println("Division");
                break;
            default:
                System.out.println("Numero incorrecto");
        }
                    
    }
}
