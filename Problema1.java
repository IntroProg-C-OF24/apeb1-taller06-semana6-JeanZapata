
package com.mycompany.problema1;

import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Empresa Amazon");
        String articulo = "Celulares";
        String  aritculo1 = "Ropa";
        double celular = 280;
        double laptop = 999.99;
        double costoAdicional = 5.50;
        double subtotal = celular + laptop;
        double costototal = subtotal;
        double iva = costototal*0.1;
        double fin=costototal+costoAdicional+120;
        if(subtotal > 1000){
            double descuento = (costototal * 0.8)+ iva;
            System.out.println("El costo es: "+descuento);
        }else if(subtotal == 1000){
            double descuento = (costototal * 0.95)+ iva;
            System.out.println("El costo es: "+descuento);
        }else if(subtotal > 5000){
            System.out.println("El envio sera gratuito");
            double total = costototal+ iva;
        }else{
            System.out.println("El costo Total"+fin);
        }        
    }
}
