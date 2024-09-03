/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio_1;

/**
 *
 * @author Iago Soave
 */
public class FibonacciLogica {
        public boolean Fibonaccicheck(int number) {
        int a = 0;
        int b = 1;
        while (a <= number) {
            if (a == number) {
                return true;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        return false;
    }
}


    

