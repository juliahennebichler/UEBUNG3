

package Aufgabe5;

public class Vehicle2 extends Benennbar2 {
    
    public Vehicle2 (){};
    
    private short wheels;
    private color f;
    private short ps;
     private short doors;
    private boolean started;
    private short speed;
    private String name;

    public Vehicle2(short wheels, color f, short ps, short doors, boolean started,short speed) {
        this.wheels = wheels;
        this.f = f;
        this.ps = ps;
        this.doors = doors;
        this.started = started;
        this.speed = speed;
    }
   

    public short getWheels() {
        return wheels;
    }

    public void setWheels(short wheels) {
        this.wheels = wheels;
    }

    public color getF() {
        return f;
    }

    public void setF(color f) {
        this.f = f;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getDoors() {
        return doors;
    }

    public void setDoors(short doors) {
        this.doors = doors;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String n) {
        name = n;
    }
    
    
    
    
    public enum color{
    Black, Silver, Red, Grey, Yellow, Blue;
    }
    
    public void start(){
       started = true;
    }
    
    public void stop(){
        started = false;
    }
    
    public void accelerate (short speed){
        if (started = true){
           if (speed +speed <= 250){
                speed += speed;
           }
    }
        }
        
  public void bremsen (short speed){
    if (started = true){
            if (speed-speed >= 0){
                speed -=speed; 
            }

            }
  }

    @Override
    public String toString() {
        return "Mein Fahrzeug hat " +getPs()+ " und fährt mit " +getSpeed()+ " km/h";
    }
  
  
    
    
}

