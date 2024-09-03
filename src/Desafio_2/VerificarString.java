/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio_2;

/**
 *
 * @author Iago Soave
 */
public class VerificarString {
    
    
    public boolean Verificar_existencia(String letra){
         for(int i =0;i< letra.length();i++){
              if(letra.charAt(i)== 'a' || letra.charAt(i)=='A'){
                  return true;
              }
         
         }
            return false;
    
    }
    
    public int VerificarA(String letra){
        int contar = 0;
        for(int i =0;i< letra.length();i++){
            if(letra.charAt(i)== 'a' || letra.charAt(i)=='A'){
                contar++;
            
            }
        
        }
        return contar;
    }
    
}
