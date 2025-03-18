package Return;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10;
int result=Calculate(10);
System.out.println(result);
	}
	public static int Calculate(int x) {
	int total=0;
	for (int i=0;i<x;i++) {
		  total+=x;
		 
	}
	return total;
	}

}//class end
