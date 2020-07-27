package com.sindominio.decodificador_adn.clasesprueba;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Adn {

    private String str;
    private String str2;

    private StringBuilder tempCoicidencia;
    private StringBuilder coincidencia;
    private StringBuilder tempIn;
    private String currentIn;
    private int posicion;
    private ArrayList<String> coincidenciasList;
    private String cadenaFinal;

    private char[] nucleotidosChar;

    private String nucleotido;

    public Adn(String str, String str2) {
        this.str = str;
        this.str2 = str2;
        this.nucleotidosChar = str2.toCharArray();

        coincidenciasList = new ArrayList<>();

        this.posicion = 0;
        tempCoicidencia = new StringBuilder();
        coincidencia = new StringBuilder();
        tempIn = new StringBuilder();

        currentIn = "";
        this.cadenaFinal = "";

    }

    public String getCadenaFinal() {
        return cadenaFinal;
    }

    public void setCadenaFinal(String cadenaFinal) {
        this.cadenaFinal = cadenaFinal;
    }

    public void compararStr() {

        while (posicion != (str.length())) {

            currentIn = String.valueOf(str.charAt(posicion));
            tempIn.append(currentIn);

            if (str2.contains(tempIn)) {

                tempCoicidencia.append(str.charAt(posicion));
                coincidencia.append(str.charAt(posicion));

                posicion++;
                coincidenciasList.add(tempCoicidencia.toString());

            } else {

                currentIn = "";
                tempIn = new StringBuilder();
                tempCoicidencia = new StringBuilder();
            }

        }
        for (String string : coincidenciasList) {
            if (string.length() > cadenaFinal.length()) {
                cadenaFinal = string;
            }
        }
        String[] partes = str.split(cadenaFinal);
        System.out.println("size ==> ==> ==> " + partes.length);
        
        if (partes.length > 0) {

            int indexCaracter = partes[0].length() - 1;
            char c;

            c = partes[0].charAt(indexCaracter);

            String izquierdaStr = String.valueOf(c) + cadenaFinal;
            if (str2.contains(izquierdaStr)) {
                cadenaFinal = izquierdaStr;
            }

        }

        System.out.println("++> " + this.cadenaFinal);

    }
    
}
