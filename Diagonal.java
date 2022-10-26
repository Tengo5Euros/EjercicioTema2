package org.example;

import java.util.Scanner;

public class Diagonal {
    public static void main(String args[]) {
        int ancho = 0;
        int alto = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Introducir el ancho ");
        ancho += input.nextInt();
        System.out.println("Introducir el alto ");
        alto += input.nextInt();
        for (int i = 0; i < alto; i++) {

            for (int j = 0; j < ancho; j++) {
                if (i == j) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.print("\n");
        }
    }

}
