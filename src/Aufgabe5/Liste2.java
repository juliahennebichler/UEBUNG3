
package Aufgabe5;



public class Liste2 <T extends Benennbar2> {

    Benennbar2[] array;

    public Liste2(int size) {
        
    array =  new  Benennbar2[size];
    
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
         String listenInhalt = "";
        for (Benennbar2 x : array) {
            listenInhalt += x + "\n";
        }
        return listenInhalt;
    }

    

    
    
}
