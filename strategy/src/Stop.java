public class Stop {
    public static void stop(int stop) {
        try {
            Thread.sleep(stop);
        } catch (InterruptedException e) {
        }
    }
}
