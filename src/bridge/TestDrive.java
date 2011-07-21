package bridge;

public class TestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Button button = new Button(10,10);
		button.operation();
		button.setOperatingSystem(Factory.getInstance().createOperatingSystem("Ubuntu"));
		button.operation();		 
	}

}
