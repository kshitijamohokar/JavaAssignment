import java.util.*;
public class RestaurantBill 
{
    public static void main(String[] args) 
    {
    	float price1 = 15;
    	float price2 = 20;
    	float price3 = 35;
    	float taxper = 10;
    	float finalSum = price1 + price2 + price3;
    	float finalAmount = (taxper/100)*finalSum;
    	System.out.println("final Amount"+ finalAmount);
    }
}
