/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.es7;

/**
 *
 * @author stefa
 */
public class ordine_tavolo extends ordine {
    public int nT;
    public String nomeC;
    public static double costo_fisso = 0;

    public ordine_tavolo(int nT, String nomeC) {
        super();
        this.nT = nT;
        this.nomeC = nomeC;
    }

    public int getnT() {
        return nT;
    }



    public String getNomeC() {
        return nomeC;
    }


    
  
}
