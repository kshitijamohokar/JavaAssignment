public class Parrot extends Bird {
	
	//Override
	public void eat() {
        System.out.println("Parrot eating");
        System.out.println("eating...sleeping...");
	}
	
	
	//overloaded method
	public void eat() {
        System.out.println("Parrot is eating");
    }
			
	public void eat(String item) {
        System.out.println("Parrot is eating "+ item);
    }

}
