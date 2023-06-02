import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
       
        Runnable runnable = () -> {
            try {
                
                BufferedWriter writer = new BufferedWriter(new FileWriter("numere.txt", true));

               
                while (true) {
                
                    int numar = (int) (Math.random() * 991) + 10;

                 
                    writer.write(Integer.toString(numar));
                    writer.newLine();
                    writer.flush();

                 
                    Thread.sleep(10000);
                }


            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        };

       
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
