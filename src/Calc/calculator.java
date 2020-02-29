package Calc;

public class calculator {
	
	 public double add(double x,double y) {
			double result=0.0;
			result =x+y;
			return result;
		 }

	public static void main(String[] args) {
		System.out.println(new calculator().add(2, 2));

	}

}
