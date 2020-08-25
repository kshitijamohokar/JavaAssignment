public class Penguin extends Bird implements SwimBehavior {
	
	public void sound() {
		System.out.println("honking...");
	}
	
	public void fly() {
		System.out.println("Penguin cannot fly");
	}

}	