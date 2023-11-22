
package com.mycompany.problema2;

import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Clasificación de un triángulo");
        System.out.println("Ingrese el valor 1");
        int var1 = teclado.nextInt();
        System.out.println("Ingrese el valor 2");
        int var2 = teclado.nextInt();
        System.out.println("Ingrese el valor 3");
        int var3 = teclado.nextInt();
        int suma = var1 + var2;
        if (var1 == var2 && var2 == var3) {
            System.out.println("Es un triángulo equilátero");
        } else if (var1 == var2 || var2 == var3 || var1 == var3) {
            System.out.println("Es un triángulo isósceles");
        } else {
            if (suma > var3) {
                System.out.println("Es un triángulo escaleno");
            } else {
                System.out.println("No es un triángulo");
            }
        }
    }
}
    