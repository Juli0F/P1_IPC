/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sindominio.decodificador_adn.searchlogic;

/**
 *
 * @author julio
 */
public class Search {
    
   /*
    *utilizare el algoritmo de busqueda binaria como base para 
    *para encontrar en la cadena los caracteres repetidos
    *
    *dividir a la mitad la cadena y ver si contiene algunade las mitades
    *sino contiene ningua de las mitades volver a dividir la cadena
    *hasta que la cadena tenga una longitud de 1
    *cuando encuentre una cadena que contenga el otro adn
    *entonces agregarle un caracter a la derecha y verifcar si la cadena lo contiene
    *sino lo contiene, quitar el ultimo caracter agregado, y agregar uno a la izquierda 
    *y volver a verificar si lo contiene agregar otro sino, almacenar y mostrar la cadena que 
    *coincidio
    *
    * debo crear
    * un metod que divida la cadena
    * otro donde la compare y verifique si contiene y devuelva un booleano
    * si retorna true agregar un caracter a la cadena enviadda y volverla enviar
    * si retorna false enviar la cadena al metodo de que divida la cadena
    * y la nueva cadena enviarla al metodo que verifica
    */
    private String strAdnOriginal;
    private String strAdnDividir;
    private String nucleotidos;
    private String nucleotidosTemporal;

    public void receiveInitialStrings(String... adn){
        String cadena1 = adn[0];
        String cadena2 = adn[1];
        
        if (cadena1.contains(cadena2)) {
            
            System.out.println("Nucleotidos Iguales ==> Es el Mismo Adn");
        }else {
            
            
        }
        
    }
    public boolean containsSubString(){


        return false;
    }
    public String dividirString(){
        int size = strAdnDividir.length();
        int inferior = 0;
        int centro;
        int superior = size - 1;
        String strIzquierda;
        String derecha;
        while (inferior <= superior ){
            
        }

        return "";
    }
    public String binarySearch(String adn,String adnADividir) {
        int size = adn.length();
        int inferior = 0;
        int centro;
        int superior = size - 1;
        String strIzquierda;
        String derecha;

        while (inferior <= superior) {
            centro = (superior + inferior) / 2;
            strIzquierda = adnADividir.substring(0, centro);
            derecha = adnADividir.substring(centro, superior);
            if (adn.contains(strIzquierda)) {
                System.out.println("cadena: " + strIzquierda + " \nsize: " + strIzquierda.length());


            }

        }
        return "fin";
    }

    
}
