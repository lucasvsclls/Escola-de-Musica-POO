/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucas.Music;

/**
 *
 * @author lucas.cortes
 */
public class Bateria extends InstrumentoMusical {
    private int numeroPecas;
    
    public Bateria(String nome, String material, boolean afinado, int numeroPecas){
        super(nome, material, afinado);
        this.numeroPecas = numeroPecas;
    }
    
    @Override
    public void afinar(){
        System.out.println("Sons de bateria");
        super.afinar();
    }
    
    @Override
    public void tocar(){
        super.tocar();
        System.out.println("Sons de bateria");
    }
    
    public int getPecas(){
        return numeroPecas;
    }
    
    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Pecas: " + numeroPecas);
    }
}
