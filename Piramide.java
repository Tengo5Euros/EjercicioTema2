package org.example;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        int ancho, alto, espacios, asteriscos = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime el alto");
        alto = input.nextInt();
        ancho = alto *2 +1;

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (j <= ancho / 2 + i && j >= ancho / 2 - i) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }
            }
            System.out.print("\n");
        }
    }
}
