import java.util.Scanner;
public class String1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			String s1 = sc.next();
			String s2 = sc.next();
			int length1 =  s1.length();
			int length2 =  s2.length();
			String last2for2 = s2.substring(length2-2, length2);
			String last2for1 = s1.substring(length1-2, length1);
			String first2for2 = s2.substring(0,2);
			String first2for1 = s1.substring(0,2);
			String result1 = last2for2 + s1.substring(2, length1-2) + first2for2;
			String result2 = last2for1 + s2.substring(2, length1-2) + first2for1;
			System.out.println(result1);
			System.out.println(result2);
		}
}
