public class RunMovement implements Movement {

	@Override
	public void move(int distance) {
		int currentDistance = 0;
		
		while (currentDistance < distance) {
			currentDistance++;
			Stop.stop(150);
			
			System.out.println("Distância percorrida: " + currentDistance + "m");
		}
	}
}
