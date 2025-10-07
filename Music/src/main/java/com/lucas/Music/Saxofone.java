/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucas.Music;

/**
 *
 * @author lucas.cortes
 */
public class Saxofone extends InstrumentoMusical{
    private String tipo;
    
    public Saxofone(String nome, String material, boolean afinado, String tipo){
        super(nome, material, afinado);
        this.tipo = tipo;
    }
    
    @Override
    public void afinar(){
        System.out.println("Sons de saxofone");
        super.afinar();
    }
    
    @Override
    public void tocar(){
        super.tocar();
        System.out.println("Sons de saxofone");
    }
    
    public String getTipo(){
        return tipo;
    }
    
    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Tipo: " + tipo);
    }
}
