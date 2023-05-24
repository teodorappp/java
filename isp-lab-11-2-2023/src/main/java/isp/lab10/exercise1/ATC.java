package isp.lab10.exercise1;
import java.util.HashMap;
import java.util.Map;

public class ATC {
    private final Map<String, Aircraft> aircraftById = new HashMap<>();
    public void addAircraft(String id){
        Aircraft aircraft = new Aircraft(id);
        aircraftById.put(id, aircraft);

        System.out.println("Aircraft with id " + id + " added");
    }

    public void sendCommand(String id, AtcCommand command){
        Aircraft aircraft = aircraftById.get(id);
        if(aircraft!=null) {
            aircraft.receiveAtcCommand(command);
            System.out.println("Aircraft with id " + id + " received command " + command);
        }
    }

    public void showAircrafts(){
        System.out.println("Display aircrafts.");
    }

}
class AtcCommand {
    String command;

    public AtcCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "AtcCommand{" +
                "command='" + command + '\'' +
                '}';
    }

}

