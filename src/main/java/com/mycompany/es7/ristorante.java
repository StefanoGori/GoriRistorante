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
public class ristorante {
    public Vector <piatto> Menù;
    public Vector <ordine> LS;
    public ordine_domicilio d;
    public ordine_tavolo t;

    public ristorante() {
        Menù = new Vector <piatto>();
        LS = new Vector <ordine>();
    }
    
    public void addMenù(piatto P){
        Menù.add(P);
    }
    public void rmMenù(piatto P){
        Menù.remove(P);
    }

    public void addOrdine(ordine O){
        LS.add(O);
    }
    public void rmOrdine(ordine O){
        LS.remove(O);
    }
    public double Incasso(){
        double Inc = 0;
        for(int i = 0; i < LS.size(); i++){    
            if(LS.get(i) instanceof ordine_domicilio){
                d = (ordine_domicilio)LS.get(i);
                Inc += d.Prezzo();
         }
            else{
             t = (ordine_tavolo)LS.get(i);
             Inc += t.Prezzo();
         }
        }
        return Inc;
    }
    public ordine ImpMax(){
        ordine Max = new ordine();
        for(int i = 0; i < LS.size(); i++){
            if(LS.get(i).Prezzo() > Max.Prezzo()){
                Max = LS.get(i);
            }
        }
        return Max;
    }

    public void printls(String tipo){
        Vector <piatto> M = null;
        for(int i =0; i < Menù.size();i++ ){
            if(Menù.get(i).getTipo().equals(tipo)){
                M.add(Menù.get(i));
            }
        }
        piatto Min = new piatto("//",tipo);  
        Min.setPrezzo(100000000);
        int i;
        for(int j=0; j < M.size();j++){
            for(i = 0; i < M.size(); i++){
                if(M.get(i).getPrezzo() < Min.getPrezzo()){
                    Min = M.get(i);
                }
            }
            Min.print();
            M.remove(i);
        }
    }
}
