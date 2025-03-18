package practice;

    class Transport{
	void move() {
	System.out.println(" is moving ");
	}
}
    class Train extends Transport{
	void move() {
	System.out.println("Train is moving on the road.");
	}
}
    class Bicycle extends Transport{
	void move () {
	System.out.println("Bicycle is moving on two wheels.");
	}
}

public class Overriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Transport train =new Train();
Transport bicycle=new Bicycle();
bicycle.move();
train.move();
	}

}
