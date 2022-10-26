import java.util.Scanner;

public class EjercicioFor6 {
    public static void main(String[] args){
        int numero;
        Scanner input= new Scanner(System.in);
        System.out.println("Dime otro número");
        numero=input.nextInt();
        for (int i = 0; i < numero; i++) {
            if(i%2==0 || i%3==0){
                System.out.println(i);
            }

        }
    }
}