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
public class piatto {
    public String nome;
    public String tipo;
    public Vector <ingrediente> IngP;
    public double prezzo;

        public piatto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        double p = 0;
        IngP = new Vector <ingrediente>();
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
        
public void addIng(ingrediente I){
    IngP.addElement(I);
    double p = 0;
        for(int i = 0; i < IngP.size(); i++){
        p += IngP.get(i).getPrezzoU()*IngP.get(i).getPrezzoU();
        }
        prezzo = p;
}
    
public void rmIng(ingrediente I){
    IngP.removeElement(I);
    double p = 0;
        for(int i = 0; i < IngP.size(); i++){
        p += IngP.get(i).getPrezzoU()*IngP.get(i).getPrezzoU();
        }
        prezzo = p;
    
    }

public void print(){
System.out.println("Nome: "+nome);
System.out.println("Prezzo: "+prezzo+"€");
}
}
