package inheritance;

public class Security extends Management{
	
	
	
	int bonus = 5000;
	
	public void message(){
		System.out.println("All the employees will get 2 WFHs from next month onwards");
	}
	
	public static void main(String[] args) {
		Security Bob = new Security();
		Bob.message();
	}

}
