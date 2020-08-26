public class Penguin extends Bird {
	
	//Override
	public void eat() {
	System.out.println("Penguin eating");
	System.out.println("eating...sleeping");
	}
	
	//overloaded method
	public void eat() {
	System.out.println("Penguin is eating");
        }
			
    	public void eat(String item) {
        System.out.println("Penguin is eating "+ item);
    }

}	
