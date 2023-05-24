package isp.lab7.safehome;
import java.util.HashMap;
public class SafeHome {
    public static void main(String[] args) {
        ControllerInterface ctrl = new DoorLockController<>(new HashMap<>());
        try {
            String pin = null;
            String name;
            ctrl.addTenant(pin:"1234", name:"Maria")
            ctrl.addTenant(pin:"5678", name:"Vlad")
            ctrl.addTenant(pin:"0910", name:"Ilinca")
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


