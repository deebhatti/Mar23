package demo;

public class Calculator {
	
	public Calculator(){
		
	}

	public int add(int a, int b) {  //Formal arguments or parameters
		return(a+b);
	}

	public void subtract(int a, int b) {
		System.out.println(a - b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void divide(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		Calculator basicCal = new Calculator();

		
		
		System.out.println(basicCal.add(10, 20));
		
		
		
		
		
		
		//Actual Arguments/Parameters
		basicCal.subtract(80, 40);
		basicCal.multiply(80, 70);
		basicCal.divide(500, 5);

	}

}
