package Return;

public class constant {
public static final int TAXPERCENT=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double cost=20;
double result=addTax(cost);
System.out.println("addTax:"+ result);
	}

	public static double addTax(double cost) {
	double result=cost/100* TAXPERCENT;
	result=cost+result;
	return result;
	}
	
	
	
	
}//class end
