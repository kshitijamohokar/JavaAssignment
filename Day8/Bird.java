public abstract class Bird {
	int age;
	int height;
	int weight;
	String species;

	// Abstract method
	public abstract void sound();
	
	public abstract void fly();
	
	// Non abstract method
	public void eat() {
		System.out.println("eating...");
	}
	
	public void sleep() {
		System.out.println("sleeping...");
	}
}
	
