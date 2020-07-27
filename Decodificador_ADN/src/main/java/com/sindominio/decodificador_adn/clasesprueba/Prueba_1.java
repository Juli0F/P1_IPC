package com.sindominio.decodificador_adn.clasesprueba;

public class Prueba_1 {

    private String adn;
    private String secondDna;
    private char[] nucleotidosPAdn;
    private char[] nucleotidosSAdn;
    private String temp ;
    private String tempValue;
    private String strComparator;

    public Prueba_1(String adn, String secondDna) {
        this.adn = adn;
        this.secondDna = secondDna;
        this.temp = " ";
    }

    public void descomponerAdn(){
        this.nucleotidosPAdn = adn.toCharArray();
        this.nucleotidosSAdn = secondDna.toCharArray();
    }
    public void comparar(){
        /*
        *tomar el caracter del primer del primer adn
        *  ver si el segundo adn lo tiene
        * si lo tiene verificar que el siguiente caracter sea el mismo
        * si es el mismo regresar al segundo paso
        * sino regresar al primer paso y sumar uno al indice
         */


        int indice = 0 ;
        int posicion= -1;
        int otro = -1;
        char caracter;
        boolean flag = true;

        while (indice<= nucleotidosPAdn.length) {
            while (flag) {


                caracter = nucleotidosPAdn[indice];
                System.out.println(indice + " => ==> ===> ====> " + caracter);

                if (secondDna.contains(String.valueOf(caracter))) {

                    if (posicion != -1) {
                        System.out.println("posicion != -1" + posicion);
                        otro = secondDna.indexOf(caracter);
                        if (otro - posicion == 1) {
                            temp += caracter;
                            System.out.println("Nucleotido concatenado == ===> " + temp);
                            flag = true;
                        } else {
                            flag = false;
                        }
                    } else {
                        posicion = secondDna.indexOf(caracter);
                        indice++;
                    }
                    System.out.println("posicion:" + posicion);
                    if ((posicion - otro) == 1) {
                        temp += caracter;
                    }

                    otro = posicion;


                } else {
                    System.out.println("Diferentes");
                    if (indice < nucleotidosPAdn.length) {
                        indice++;
                    } else {
                        break;
                    }
                }
                System.out.println("" + temp);
            }
        }

    }

   

    }


