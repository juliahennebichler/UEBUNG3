
package Aufgabe4;


public class Liste <T> {

    T[] array;

    public Liste(int size) {
        
    array = (T[]) (new Object[size]); //object ist typ von array
    
    }

   public void save(T wert){ //T = der zu definierende Datentyp

		for (int i = 0; i < array.length; i++){
                    
                    if (array[i] == null) {
                    array[i] = wert;
                    System.out.println("Wert gespeichert!");
                    break; 
                    
            }
                    
		}

	}

    @Override
    public String toString() {
         String listenInhalt = ""; //leerer String 
        for (T x : array) {
            listenInhalt += x + "\n"; //leerer listeninhalt + wert + enter
        }
        return listenInhalt;
    }

    

    
    
}
