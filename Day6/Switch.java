public class Switch {

int state;
int amps;
String color;
String purpose;
String appliance;

public void state(int a) {
if(a == 0) System.out.println("OFF state");
if(a > 0) System.out.println("ON state");
}
public void work() {
System.out.println("working condition");
}
public void damage() {
System.out.println("damaged , You have to replace it.");
}

public void use() {
System.out.println("The switch is used for the controlling of " + appliance);
}
public void explain() {
System.out.println("The Switch is a "+ amps + " Ampere " + color + " Colour Switch.");
}
}
