package at.mschuster.tools;

public class TestRandom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//RandomGenerator placeNumber = new RandomGenerator();
		
		while (true) {
			int number = RandomGenerator.getInt(1, 7);
			System.out.println(number);
			Thread.sleep(1000);
		}
		
		
	}

}
