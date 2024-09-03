/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio_5;

import static Desafio_5.Testar.esperar;

/**
 *
 * @author Iago Soave
 */
public class Main {
    public static void main(String[] args) {
        boolean[] lampadas = {false, false, false};
        boolean[] quentes = {false, false, false};

        lampadas[0] = true;
        esperar(5000);
        lampadas[0] = false;
        lampadas[1] = true;

        quentes[0] = true;
        quentes[1] = true;

        for (int i = 0; i < lampadas.length; i++) {
            System.out.println("Lâmpada " + (i + 1) + " está " + (lampadas[i] ? "acesa" : "desligada") + " e está " + (quentes[i] ? "quente" : "fria"));
        }
        
    }
    
}
