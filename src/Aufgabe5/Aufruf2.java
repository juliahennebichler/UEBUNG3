/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aufgabe5;


public class Aufruf2 {
    
    public static void main (String[] args){
        
     Liste2 fahrzeuge=  new Liste2(3);
     Benennbar2 bmw = new Car2 ();
     Benennbar2 motorboot = new Boat2();
     Benennbar2 auto = new Vehicle2();
     
     fahrzeuge.save(bmw);
     fahrzeuge.save(motorboot);
     fahrzeuge.save(auto);
     
      System.out.println(fahrzeuge.toString());
    }
    
}
