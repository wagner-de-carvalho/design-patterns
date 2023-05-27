public class WalkMovement implements Movement {

    @Override
    public void move(int distance) {
        int currentDistance = 0;

        while (currentDistance < distance) {
            currentDistance++;
            Stop.stop(300);

            if (currentDistance % 20 == 0) {
                Stop.stop(300);

                System.out.println("Parada para descanso");
            }

            System.out.println("Distância percorrida: " + currentDistance + "m");
        }
    }

}
