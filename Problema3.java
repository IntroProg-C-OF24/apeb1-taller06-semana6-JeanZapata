
package com.mycompany.problema3;

import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Costo de envio de paquetes");
        System.out.println("Ingrese la region");
        String region = teclado.nextLine();
        region.toLowerCase();
        System.out.println("Ingrese el peso del paquete en kg");
        double peso = teclado.nextDouble();
        if (region.equals("local")&&peso < 5) {
            double costo=peso*5;
            System.out.println("El costo es de 5$: "+costo);
        }else if(region.equals("local")&&peso > 5 && peso < 10){
            double costo=peso*10;
            System.out.println("El costo es de 10$: "+costo);
        }else{
            double costo=peso*15;
            System.out.println("El costo es de 15$"+costo);
        }

    }
}
