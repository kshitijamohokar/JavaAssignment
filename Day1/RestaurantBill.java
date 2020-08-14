import java.util.*;
public class RestaurantBill 
{
    public static void main(String[] args) 
    {
    	float prod1 = 12;
    	float prod2 = 13;
    	float prod3 = 15;
    	float taxper = 10;
    	float finalSum = prod1 + prod2 + prod3;
    	float finalAmount = (taxper/100)*finalSum;
    	System.out.println("final Amount"+ finalAmount);
    }
}
