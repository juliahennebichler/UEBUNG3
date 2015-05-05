

package Aufgabe3;



public class Boat extends Vehicle1 {
    
    private double draft;
    private short propeller;
    private double cargo;

    public Boat(double draft, short propeller, double cargo) {
        this.draft = draft;
        this.propeller = propeller;
        this.cargo = cargo;
    }

    public Boat(short wheels, color f,short ps,  short doors, double draft, short propeller, double cargo) {
        super(wheels, f, ps, doors,false,(short)0);
        this.draft = draft;
        this.propeller = propeller;
        this.cargo = cargo;
    }
    

    public double getDraft() {
        return draft;
    }

    public void setDraft(double draft) {
        this.draft = draft;
    }

    public short getPropeller() {
        return propeller;
    }

    public void setPropeller(short propeller) {
        this.propeller = propeller;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }
    
    
    public void unload() throws InterruptedException{
        cargo = 0;
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return "Mein Wasserfahrzeug hat " +getPs()+ " und einen Tiefgang mit " +getDraft()+ " m";
    }

   
    
    
    
}
