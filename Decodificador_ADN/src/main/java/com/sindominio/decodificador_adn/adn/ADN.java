/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sindominio.decodificador_adn.adn;

/**
 *
 * @author julio
 */
public class ADN {
    private String nucleótidos;

    public ADN(String nucleótidos) {
        this.nucleótidos = nucleótidos;
        
    }

    public String getNucleótidos() {
        return nucleótidos;
    }

    public void setNucleótidos(String nucleótidos) {
        this.nucleótidos = nucleótidos;
    }
    
    
}
