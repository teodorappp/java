package isp.lab7.safehome;
import java.util.Map;

public class DoorLockController<addTenant> implements ControllerInterface {

    private final Map<Tenant, AccessKey> validAccess;
    private String name;
    private Object String;

    public DoorLockController(Map<Tenant, AccessKey> validAccess) {
        this.validAccess = validAccess;
    }

    @Override
    public DoorStatus enterPin(String pin) throws Exception {
        java.lang.String name1 = name;
        for (Map.Entry<Tenant, AccessKey> keyValuePair : validAccess.entrySet()) {
            Tenant tenant = keyValuePair.getKey();
            AccessKey accessKey = keyValuePair.getValue();

            if (pin.equals(accessKey.getPin)) {
            }


            return null;
        }

        public addTenant (String pin, String name1) throws Exception{
            Tenant tenant = new Tenant(name1);
            AccessKey accessKey = new AccessKey(pin);
            if (validAccess.containsKey(tenant)) {
                throw new TenantAlreadyExistsException("Tenant already registred:" + name1);
            }
            validAccess.put(tenant, accessKey);
        }


        public void removeTenant(String name) throws Exception {
            Tenant tenant = new Tenant(name1);
            AccessKey accessKey = new AccessKey(pin);

            if (validAccess.containsKey(tenant)) {
                throw new TenantNotFoundException("Tenant is not registred:" + name1);
            }
            validAccess.put(tenant, accessKey);
        }
    }