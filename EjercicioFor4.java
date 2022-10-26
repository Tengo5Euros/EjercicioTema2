import java.util.Scanner;

public class EjercicioFor4 {
    public static void main(String[] args){
        int numero, suma=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Dime un número");
        numero=input.nextInt();
        for(int i=0; i<numero && suma<1000; i++){
            suma=i+numero;
            System.out.println("El resultado es "+suma);
        }
        System.out.println("Fin del programa");
    }
}
