public class Ostrich extends Bird {
	
	//Override
	public void eat() {
	System.out.println("Ostrich eating");
	System.out.println("eating...sleeping");
	}
	
	//overloaded method
	public void eat() {
        System.out.println("Ostrich is eating");
	}
		
    	public void eat(String item) {
        System.out.println("Ostrich is eating "+ item);
    }

}
