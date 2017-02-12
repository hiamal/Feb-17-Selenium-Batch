

public class TestClock {

	public static void main(String[] args) {
		Clock wallClock = new Clock();
		wallClock.color = "Red";
		wallClock.length = 20;
		wallClock.shape = "Round";
		
		wallClock.alarm();
		wallClock.showTime();
	}
}
