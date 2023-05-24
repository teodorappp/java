package aut.isp.lab4.exercise0;


/**
 * Base class.
 */
public class Engine {
    private boolean status;


    /**
     * Constructorul nu este descris in mod explicit in diagrama UML de clase dar este adaugat pentru a permite initializarea atributelor.
     *
     */
    public Engine(int power) {
    }

    public void startEngine(){
        status = true;
    }

    public void stopEngine(){
        status = false;
    }

    public boolean isStatus() {
        return status;
    }
}
