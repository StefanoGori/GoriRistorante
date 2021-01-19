/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.es7;
import java.util.Calendar.*;
import java.util.GregorianCalendar;
/**
 *
 * @author stefa
 */
public class ordine_domicilio extends ordine{
    public String indirizzo;
    public GregorianCalendar ora;
    public static double costo_fisso = 3.5;

    public ordine_domicilio(String indirizzo, int anno, int mese,int giorno,int oraio,int minuto ) {
        super();
        this.indirizzo = indirizzo;
        ora = new GregorianCalendar(anno,mese,giorno,oraio,minuto);
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public GregorianCalendar getOra() {
        return ora;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setOra(GregorianCalendar ora) {
        this.ora = ora;
    }
    
    
    
}
