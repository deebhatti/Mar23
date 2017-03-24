package inheritance;

public class HR extends Management{
	
	
	
	int bonus = 12000;
	
	public static void main(String[] args) {
		HR Tim = new HR();
		System.out.println("Bonus of Tim = $ " + Tim.bonus);
		System.out.println("Salary of Tim = $ " + Tim.Salary);
		
		Tim.message();
		
	}

}
