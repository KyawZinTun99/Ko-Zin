 package Jwd;
enum Trafficlight {YELLOW,GREEN,RED}

public class Enum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Trafficlight light=Trafficlight.RED;

switch(light) {
case RED:
	System.out.println("Stop!");
	break;
case YELLOW:
	System.out.println("Slow Down !");
	break;
case GREEN:
    System.out.println("Go!");
    break;	
    //System.out.println("Go!");
}//switch end

}// p end
}//class end