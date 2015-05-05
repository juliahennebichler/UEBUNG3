/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe4;


public class Aufruf1 {
    
    public static void main (String[] args){
        
          Liste neu = new Liste(3); 
                    neu.save(2.5);
                    neu.save(5.0);
                    neu.save(200.0);

                    System.out.println(neu.toString());
    }
    
}
