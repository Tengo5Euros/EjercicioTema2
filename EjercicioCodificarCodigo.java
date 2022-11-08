package org.example;

import java.io.*;
import java.nio.charset.Charset;

public class EjercicioCodificarCodigo {
    public static void main(String[] args) throws FileNotFoundException,
            IOException {
        String file = "C:\\Users\\Bruno\\Documents\\Ejercicios\\fichero.txt";
        //Se crean las variables para poder contar los caracteres
        long contador_lineas = 0, contador_caracteres = 0, contador_palabras = 0;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file),
                        Charset.forName("UTF-8")));
        int c, n = 0, anterior = ' ';
        //A partir de aquí, empieza a leer el archivo
        while ((c = reader.read()) != -1) {
            char character = (char) c;
            contador_caracteres++;
            //si el texto se corresponde con el predicado, se añadirá 1 a contador de palabras
            if (character == '\n') {
                contador_lineas++;
            }
            if ((anterior == ' ' || anterior == '\t' || anterior == '\n') && (character != ' ' || character == '\t' || character == '\n')) {
                contador_palabras++;
            }
            anterior = c;
        }

        System.out.println("En el fichero existes: " + contador_palabras + " palabras, "+ contador_lineas +" líneas y "+ contador_caracteres +" caracteres");
    }
}
/*1.La forma de codificar el código es muy mala, debido a que no es legible y cuesta mucho analizarlo
2.Tabular bien el código para que cuando un programador tenga que ver tu código, el lo pueda leer con facilidad y así pueda entenderlo
3.Se inicia el código poniendo una excepción, y el compilador lee un fichero para así poder contar las líneas que tiene,  los caracteres y las palabras
 */
