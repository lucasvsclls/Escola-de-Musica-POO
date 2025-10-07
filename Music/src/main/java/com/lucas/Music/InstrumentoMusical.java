/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lucas.Music;

/**
 *
 * @author lucas.cortes
 */
public abstract class InstrumentoMusical {
    private String nome;
    private String material;
    private boolean afinado;
    
    public InstrumentoMusical(String nome, String material, boolean afinado){
        this.nome = nome;
        this.material = material;
        this.afinado = afinado;
    }
    
    public void afinar(){
        if(afinado){ //ja esta afinado
            System.out.println("O " + nome + " já está afinado.");
        }
        else { //esta desafinado
            afinado = true;
            System.out.println(nome + " afinado!");
        }
    }
    
    public void tocar(){
       if(afinado){
           System.out.println("Tocando " + nome);
       }
       else{
           System.out.println("Afine primeiro!");
       }
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getMaterial(){
        return material;
    }
    
    public boolean isAfinado(){
        return afinado;
    }
    
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Material: " + material);
    }
}
