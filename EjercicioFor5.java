import java.util.Scanner;

public class EjercicioFor5 {
    public static void main(String[] args){
        int variable1=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Dime un número");
        variable1=input.nextInt();
        for (int i=0; i<=variable1; i=i+5){
            System.out.println(i);
        }
    }
}