/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucas.Music;

/**
 *
 * @author lucas.cortes
 */
public class Violao extends InstrumentoMusical {
    private int numeroCordas;
    
    public Violao(String nome, String material, boolean afinado, int numeroCordas){
        super(nome, material, afinado);
        this.numeroCordas = numeroCordas;
    }
    
    @Override
    public void afinar(){
        System.out.println("Sons de violão");
        super.afinar();
    }
    
    @Override
    public void tocar(){
        super.tocar();
        System.out.println("Sons de violão");
    }
    
    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Cordas: " + numeroCordas);
    }
    
    
    public int getCordas(){
        return numeroCordas;
    }
}
