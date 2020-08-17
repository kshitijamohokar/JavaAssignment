import java.util.Scanner;
public class Convertor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the height feet part");
		int feet = scan.nextInt();
		System.out.println("Enter the height inch part");
		int inch = scan.nextInt();
		float result = heightConvertor(feet, inch);
		System.out.println("Result height in cm" +result);
		int weightInKg = 60;
		float resultw = weightConverter(weightInKg);
		System.out.println("Result weight in pounds" +resultw);
		
	}
	static float heightConvertor(int heightFeetPart, int heightInchPart) {
		double finalHeight = heightFeetPart*12*2.54 + heightInchPart*2.54;
		return (float) finalHeight;
}
static float weightConvertor(int weight) {
	float result = (float)(weight*2.2);
	return result;
}
}