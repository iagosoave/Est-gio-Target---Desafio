/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio_1;

import java.util.Scanner;

/**
 *
 * @author Iago Soave
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        FibonacciLogica check = new FibonacciLogica();
        
        System.out.println("Digite um número:");
        int numero = leia.nextInt();
        
        if(check.Fibonaccicheck(numero)){
            System.out.println(numero +", Pertence a sequencia fibonacci");
        }else{
            System.out.println(numero +",Nnão Pertence a sequencia fibonacci");
        }
        
    }
    
}
