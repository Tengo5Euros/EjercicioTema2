package org.example;

import java.util.Scanner;

public class EjercicioAdivinarNumero {
    public static void main(String[] args) {
        int numero, numerosecreto;
        numerosecreto = 1 + (int) (Math.random() * 1000);
        System.out.println(numerosecreto);
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Adivina el numero secreto");
            numero = input.nextInt();
            if (numero <numerosecreto){
                System.out.println("El numero secreto es mayor que el número");
            }else if(numero >numerosecreto){
                System.out.println("El númer secreto es menor que el número");
            }else{
                System.out.println("Enhorabuena, has acertado el numero");
            }

        } while (numero != numerosecreto);
    }

}
