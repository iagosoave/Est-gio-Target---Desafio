/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio_5;

/**
 *
 * @author Iago Soave
 */
public class Testar {
    public static void esperar (int segundos){
        
        try{
            Thread.sleep(segundos);
        
            
        }catch(InterruptedException e){
             e.printStackTrace();
        }
            
            
        }
    
}
