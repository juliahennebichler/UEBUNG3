

package pkg1410653313_u3;

import Classes.Car;
import Classes.Vehicle;



public class Main {

    
    public static void main(String[] args) {
       
        // AUFGABE 2
        Benennbar namedCar = new Car((short)4, Vehicle.color.Silver, (short)220, (short)5, (short)4);
        
        namedCar.setName("bmw");
        System.out.println("Das Auto heißt: "+namedCar.getName());
        
    }
    
}
