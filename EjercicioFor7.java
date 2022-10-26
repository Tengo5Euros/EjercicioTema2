import java.util.Scanner;

public class EjercicioFor7 {
    public static void main(String[] args){
        int n1, n2, resultado;
        Scanner input=new Scanner(System.in);
        System.out.println("Dime numero1");
        n1=input.nextInt();
        System.out.println("Dime numero2");
        n2=input.nextInt();
        for(int i=0; i<=n2; i++){
            resultado= n1*i;
            System.out.println(n1+"x"+i+" = "+resultado);
            n1++;
        }
    }
}
