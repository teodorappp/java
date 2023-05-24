package isp.lab10.racedemo;

public class TimerThread extends Thread {
    private boolean running;
    private long startTime;
    private long elapsedTime;

    public TimerThread() {
        running = false;
        startTime = 0;
        elapsedTime = 0;
    }

    public void startTimer() {
        running = true;
        startTime = System.currentTimeMillis();
    }

    public void stopTimer() {
        running = false;
        elapsedTime = System.currentTimeMillis() - startTime;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(10); // Sleep for 10 milliseconds
                elapsedTime = System.currentTimeMillis() - startTime;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
