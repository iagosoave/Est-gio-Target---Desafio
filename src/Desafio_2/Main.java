/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio_2;

import java.util.Scanner;

/**
 *
 * @author Iago Soave
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
     
        VerificarString verificar = new VerificarString();
     
        System.out.println("Verificar se possui a letra A, Digite uma palavra:");
        String palavra = leia.next();
        
        verificar.VerificarA(palavra);
        verificar.Verificar_existencia(palavra);
        
        if(verificar.Verificar_existencia(palavra) == true){
            System.out.println("Essa palavra possui a letra A" + ", e ela se repete "
                    + verificar.VerificarA(palavra) + " vezes.");
        }else{
            System.out.println(palavra + ", não possui a letra A.");
        }
        
       
        
     
        
    }
    
}
