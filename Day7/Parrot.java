public class Parrot extends Bird implements FlyBehavior {
	
	public void sound() {
		System.out.println("squawk...");
	}
	
	public void fly() {
		System.out.println("Parrot can fly");
	}

}
