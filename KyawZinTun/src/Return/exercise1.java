package Return;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int result=Calculate(10);
System.out.println(result);
	}
	public static int Calculate(int x) {
	int total=0;
	for (int i=0;i<x;i++) {
		  total+=x;
		  return total;
	}
	return total;
	}

}//class end
