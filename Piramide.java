package org.example;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        int ancho, alto, espacios, asteriscos = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime el ancho");
        ancho = input.nextInt();
        System.out.println("Dime el alto");
        alto = input.nextInt();
        asteriscos = 1;
        espacios = (alto / 2) - 1;
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                if (j == espacios) {
                    System.out.print(" ");

                } else {
                    System.out.print("*");
                    espacios--;
                }
            }
            System.out.println("\n");
        }
    }
}
