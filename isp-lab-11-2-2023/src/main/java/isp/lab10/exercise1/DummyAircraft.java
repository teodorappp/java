package isp.lab10.exercise1;
import java.io.FileWriter;
import java.io.IOException;

public class DummyAircraft implements Runnable{

    String id;
    final String lock = "lock";
    public DummyAircraft(String id) {
        this.id = id;
        System.out.println("Aircraft "+id+" is created. Ready to take off.");
    }

    public void run() {
        try (FileWriter fileWriter = new FileWriter("aircraft_" + id, true)) {
            fileWriter.write("Aircraft" + id + " is standing\n");
            fileWriter.flush();
            synchronized (lock) {
                lock.wait();
            }
            fileWriter.write("Aircraft" + id + "is taxing\n");
            fileWriter.flush();
            Thread.sleep(10 * 1000);
            fileWriter.write("Aircraft" + id + "is landing.\n");
            fileWriter.flush();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("InstantiatingAThreadWithDefaultRunMethod")
    public static void main(String[] args) {
        Aircraft da = new Aircraft("1");
       Thread t = new Thread(da.toString());
        t.start();
    }


}

