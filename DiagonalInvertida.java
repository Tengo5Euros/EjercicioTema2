import java.util.Scanner;

public class DiagonalInvertida {
    public static void main(String[] args) {

        int ancho, alto, espacios;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime el ancho");
        ancho = input.nextInt();
        System.out.println("Dime el alto");
        alto = input.nextInt();
        espacios = ancho-1;
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                //si j no es igual a espacios printea un espacio, y cuando sea igual printeará un asterisco
                if (j != espacios) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                    espacios--;
                }

            }
            System.out.print("\n");

        }
    }
}
