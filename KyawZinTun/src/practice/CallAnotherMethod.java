package practice;

public class CallAnotherMethod {
	
	public static void printsquare (int num) {
		
	 int result = E4.square(num);
		System.out.println(result);
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      printsquare (7);
	}

}
//. Method Calling Another Method
//Write a method called printSquare that calls another method square
//(from problem 4) and prints the result.