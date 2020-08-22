public class SwitchConstructor {

int state;
int amps;
String color;
String purpose;
String appliance;

public SwitchConstructor(int s,int a,String c) {
state = s;
amps = a;
color = c;
}

public void explain() {
System.out.println("The Switch is a "+ amps + " Ampere " + color + " Colour Switch.");
}

public void wstate(int a) {
if(a == 0) System.out.println("The Switch is in the OFF state");
if(a > 0) System.out.println("The Switch is in the ON state");
}

public static void main(String[] args) {
SwitchConstructor switch1 = new SwitchConstructor(0 , 5 ,"White");
switch1.explain();
switch1.wstate(switch1.state);
}

}
