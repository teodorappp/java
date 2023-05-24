package aut.isp.lab4.exercise0;

public class DieselEngine extends Engine {

    private int fuelLevel;

    /**
     * Constructorul nu este descris in mod explicit in diagrama UML de clase dar este adaugat pentru a permite initializarea atributelor.
     *
     */
    public DieselEngine(int power, int fuelLevel) {
        super(power);
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void startEngine(){
        if(fuelLevel>0) {
            super.startEngine();
            fuelLevel--;
            System.out.println("Diesel engine is started.");
        }  else {
            System.out.println("Engine cannot be started. No fuel.");
        }
    }


}
