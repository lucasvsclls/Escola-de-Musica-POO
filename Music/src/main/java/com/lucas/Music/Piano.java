/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucas.Music;

/**
 *
 * @author lucas.cortes
 */
public class Piano extends InstrumentoMusical{
    private int numeroTeclas;
    
    public Piano(String nome, String material, boolean afinado, int numeroTeclas){
        super(nome, material, afinado);
        this.numeroTeclas = numeroTeclas;
    }
    
    @Override
    public void afinar(){
        System.out.println("Sons de piano");
        super.afinar();
    }
    
    @Override
    public void tocar(){
        super.tocar();
        System.out.println("Sons de piano");
    }
    
    public int getTeclas(){
        return numeroTeclas;
    }
    
    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Teclas: " + numeroTeclas);
    }
}
