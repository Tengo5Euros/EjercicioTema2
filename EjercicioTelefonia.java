package org.example;

import java.util.Scanner;

public class EjercicioTelefonia {
    public static void main(String[] args) {
        float estandar = 100, temporal, temporal2;
        boolean quierescontratar, telefono, internet50mb, internet, escliente, renovarpack, personamayor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quieres contratar la tarifa estandar?");
        quierescontratar = teclado.nextBoolean();
        System.out.println("Quieres contratar teléfono y 2GB de datos?");
        telefono = teclado.nextBoolean();
        System.out.println("Quieres contratar internet 50mb sin datos?");
        internet50mb = teclado.nextBoolean();
        System.out.println("Quieres telefono con llamadas ilimitadas y internet 100 mb y television?");
        internet = teclado.nextBoolean();
        System.out.println("Eres ya cliente nuestro?");
        escliente = teclado.nextBoolean();
        System.out.println("Tienes 80 años o más");
        personamayor = teclado.nextBoolean();

        if (quierescontratar == true && telefono == false && internet == false && internet50mb == false) {
            if (personamayor == true) {
                estandar = estandar - 5;
            }
            System.out.println("El precio final es:" + estandar);

        } else if (quierescontratar == true && telefono == true && internet == false && internet50mb == false) {
            temporal = estandar * 0.2f;
            estandar = estandar - temporal;
            if (escliente == true) {
                temporal2 = estandar * 0.05f;
                estandar = estandar - temporal2;
            }
            if (personamayor == true) {
                estandar = estandar - 5;
            }
            System.out.println("Has elegido el plan a, el precio a pagar es:" + estandar);

        } else if (quierescontratar == true && telefono == false && internet50mb == true && internet == false) {
            temporal = estandar * 0.22f;
            estandar = estandar - temporal;
            if (escliente == true) {
                temporal2 = estandar * 0.05f;
                estandar = estandar - temporal2;
            }
            if (personamayor == true) {
                estandar = estandar - 5;
            }
            System.out.println("Has elegido el plan b, el precio a pagar es:" + estandar);

        } else if (quierescontratar == true && telefono == false && internet50mb == false && internet == true) {
            temporal = estandar * 0.5f;
            estandar = estandar - temporal;
            if (escliente == true) {
                temporal2 = estandar * 0.05f;
                estandar = estandar - temporal2;
            }
            if (personamayor == true) {
                estandar = estandar - 5;
            }
            System.out.println("Has elegido el plan c, el precio a pagar es:" + estandar);
        }
    }
}