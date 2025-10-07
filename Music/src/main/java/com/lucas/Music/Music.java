/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.lucas.Music;

/**
 *
 * @author lucas.cortes
 */
public class Music {

    public static void main(String[] args) {
        InstrumentoMusical[] banda = new InstrumentoMusical[4];
        
        banda[0] = new Violao("Violao", "Mahogany", true, 6);
        banda[1] = new Piano("Piano", "Maple", true, 88);
        banda[2] = new Saxofone("Saxofone", "Metal", true, "Alto");
        banda[3] = new Bateria("Bateria", "Metal", true, 10);
        
        System.out.println("\nAfinar todos os instrumentos da banda\n");
        for(InstrumentoMusical instrumento : banda){ 
            instrumento.afinar();
        }
        
        System.out.println("\n\nTocar tudo junto\n");
        for(InstrumentoMusical instrumento : banda){ 
            instrumento.tocar();
        }
        
        System.out.println("\n\nInformacoes dos instrumentos da banda");
        for(InstrumentoMusical instrumento : banda){ 
            System.out.println("\n");
            instrumento.mostrarInformacoes();
        }
    }
}
