

package Aufgabe5;



public class Car2 extends Vehicle2{
    
    public Car2(){}
    
    private boolean aircondition;
    private short airbag;

    public Car2(short wheels, color f, short ps, short doors, boolean started, short speed) {
        super(wheels, f, ps, doors, started, speed);
    }

    public Car2(boolean aircondition, short airbag) {
        this.aircondition = aircondition;
        this.airbag = airbag;
    }

    public Car2(short wheels, color f,short ps,short doors, short airbag) {
        super(wheels, f, ps, doors, false, (short)0);
        this.aircondition = false;
        this.airbag = airbag;
    }




    
    

    public boolean isAircondition() {
        return aircondition;
    }

    public void setAircondition(boolean aircondition) {
        this.aircondition = aircondition;
    }

    public short getAirbag() {
        return airbag;
    }

    public void setAirbag(short airbag) {
        this.airbag = airbag;
    }
   
    

public void startAircondition(){
    if (aircondition = false){
            aircondition = true;
        }
        else{
            System.out.println("Klimaanlage läuft bereits");
        }
}

public void stopAircondition(){
    if (aircondition = true){
            aircondition = false;
        }
        else{
            System.out.println("Klimaanlage bereits aus");
        }
}

    @Override
    public String toString() {
        return "Mein Auto hat " +getPs()+ " und fährt mit " +getSpeed()+ " km/h";
    }




}
