public class WalkMovement implements Movement {

    @Override
    public void move(int distance) {
        int currentDistance = 0;

        while (currentDistance < distance) {
            currentDistance++;
            stop(300);

            if (currentDistance % 20 == 0) {
                stop(300);

                System.out.println("Parada para descanso");
            }

            System.out.println("Dist�ncia percorrida: " + currentDistance + "m");
        }
    }

    private void stop(int stop) {
        try {
            Thread.sleep(stop);
        } catch (InterruptedException e) {
        }
    }
}
