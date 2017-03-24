package methodOverloading;

public class Calculator {
	
	//fields eliminated
	//constructor eliminated
	
	public void add(int a, int b){
		System.out.println(a+b);
	}
	
	public double add(double a, double b){
		return (a+b);
		
	}
	
	
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		
		basicCal.add(50, 20);
		basicCal.add(3.5,5.6);
	}
	

}
