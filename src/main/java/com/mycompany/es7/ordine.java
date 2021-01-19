/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.es7;
import java.util.Vector;
/**
 *
 * @author stefa
 */
public class ordine {
    public static int numero = 0;
    public Vector <piatto> PO;
    public int costo_fisso;
    
   
    public ordine() {
        
        PO = new Vector <piatto>();
        numero++;
    }

    public Vector<piatto> getPO() {
        return PO;
    }

    public void setPO(Vector<piatto> PO) {
        this.PO = PO;
    }


    public void addPiatto(piatto P){
        PO.add(P);

    }

    public void rmPiatto(piatto P){
        PO.remove(P);

    }
    public double Prezzo(){
        double tot = costo_fisso;
            for(int i = 0; i < PO.size(); i++){
                tot += PO.get(i).getPrezzo();
            }
        return tot;
    }

}
