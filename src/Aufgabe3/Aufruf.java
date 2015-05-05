

package Aufgabe3;




public class Aufruf {

    
    public static void main(String[] args) {
       
        //AUFGABE 3

         Benennbar1 namedCar = new Car1((short)4, Vehicle1.color.Silver, (short)220, (short)5, (short)4); 
         namedCar.setName("BMW");
         System.out.println("Das Auto heißt " + namedCar.getName());
        
    }
    
}
