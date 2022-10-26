package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Pedro
 */
public class EjercicioSwitch {
    enum Tipos {
        Mini("Mini"),
        Economico("Económico"),
        Compacto("Compacto"),
        Mediano("Mediano"),
        Familiar("Familiar"),
        Lujo("Lujo"),
        SUV("SUV"),
        Monovolumen("Monovolumen"),
        Descapotable("Descapotables");
        private String tipo;
        private Tipos(String tipo) {
            this.tipo = tipo;
        }
    }
    public static void main(String[] args) throws IOException {
        int precio;
        String tipo;
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        tipo= br.readLine();
        Tipos t= Tipos.valueOf(tipo);
        precio = switch (t) {
            case Mini -> 45;
            case Economico -> 50;
            case Mediano -> 60;
            case Lujo -> 200;
            case SUV -> 150;
            case Monovolumen -> 80;
            case Descapotable -> 170;
            default -> -1;
        };
        if (precio>-1){
            System.out.println("El precio es de "+precio+ " €");

        }else{
            System.out.println("Tipo de vehiculo no encontrado");
        }
    }
}
//1.El código es difícil de leer debido a que el if es muy extenso.
//3El tamaño del código ha disminuido drásticamente y es mucho más legible
//Se debe de colocar break
