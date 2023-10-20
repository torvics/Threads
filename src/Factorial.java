import java.util.logging.Logger;

public class Factorial implements Runnable {
    public static final String TAG = Factorial.class.getSimpleName();
    public static final long WAIT_TIME = 800L;
    public static final Logger LOGGER = Logger.getLogger(TAG);

    private int maxValue;

    public Factorial(int max) {
        this.maxValue = max;
    }

    public void run() {
        String name = Thread.currentThread().getName();
        long milis = 0L;
        long delta = 0L;

        long result = 1;

        for (int j = maxValue; j >= 1; j--) {
            result *= j;
            System.out.println("Calculando Factorial de " + maxValue + ": " + result + " " + name);
            try {
                Thread.sleep(WAIT_TIME);
            } catch (InterruptedException ex) {
                LOGGER.severe(ex.getMessage());
            }
        }

        System.out.println("El factorial de " + maxValue + " es " + result);
    }
}