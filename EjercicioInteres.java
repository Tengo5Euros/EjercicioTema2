package org.example;

import java.util.Scanner;

public class EjercicioInteres {
    public static void main(String[] args) {

        float importe_prestamo, interes_anual, anyos, interes_mensual, meses, cuota, capital_pendiente, intereses_cuota, capital_cuota;
        Scanner input = new Scanner(System.in);
        System.out.println("Dime el importe del préstamo");
        importe_prestamo = input.nextFloat();
        System.out.println("Dime el interés anual");
        interes_anual = input.nextFloat();
        System.out.println("¿Cuantos años van a ser?");
        anyos = input.nextFloat();
        meses = anyos * 12f;
        interes_mensual = interes_anual / 12f;
        cuota = (float) (importe_prestamo * (interes_mensual / (1 - Math.pow(1 + interes_mensual, -meses))));
        capital_pendiente = importe_prestamo;



        for (int i = 1; i <= meses; i++) {
            intereses_cuota = (float) (capital_pendiente *  interes_mensual);
            capital_pendiente = capital_pendiente-(cuota-intereses_cuota);
            capital_cuota=(cuota*intereses_cuota)/100;
            System.out.println("Mes " + i + "   Cuota  " + cuota + "   Interés Cuota " + intereses_cuota + "   Capital Cuota "+ capital_cuota+  "  Capital Pendiente " + capital_pendiente);
        }
    }
}