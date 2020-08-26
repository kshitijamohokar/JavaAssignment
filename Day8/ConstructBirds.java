public class ConstructBirds {
	
	public static void main(String[] args) {
		Bird birdobj1 = new Parrot();
		birdobj1.eat();
		birdobj1.eat("insect");
		
		Bird birdobj2 = new Ostrich();
		birdobj2.eat();
		birdobj2.eat("grasses");
		
		Bird birdobj3 = new Penguin();
		birdobj3.eat();
		birdobj3.eat("fishes");
		
		
	}
}