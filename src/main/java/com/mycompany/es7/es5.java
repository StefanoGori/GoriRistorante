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
public class es5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ingrediente Spaghetti = new ingrediente("spaghetti", 100, 0.5 );
        ingrediente olio = new ingrediente("olio", 50, 2 );
        ingrediente aglio= new ingrediente("aglio",30,1);
        ingrediente Gnocchi = new ingrediente("Gnocchi", 100, 0.5 );
        ingrediente Ragu= new ingrediente("ragù",50,2);
        piatto SpaghettiAglioOlio = new piatto("spaghetti aglio e olio", "primo");
        SpaghettiAglioOlio.addIng(Spaghetti);
        SpaghettiAglioOlio.addIng(olio);
        SpaghettiAglioOlio.addIng(aglio);
        piatto GnocchiAlRagù = new piatto("Gnocchi Al Ragù", "primo");
        GnocchiAlRagù.addIng(Ragu);
        GnocchiAlRagù.addIng(Gnocchi);
        ordine_domicilio f = new ordine_domicilio("via vai", 2020, 11, 0, 12, 30);
        f.addPiatto(SpaghettiAglioOlio);
        f.addPiatto(GnocchiAlRagù);
        System.out.println(SpaghettiAglioOlio.getPrezzo());
        System.out.println(GnocchiAlRagù.getPrezzo());
        System.out.println(f.Prezzo());
    }
    
}
