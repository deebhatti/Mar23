package demo;

public class Shapes {
	
	int length; //Variable declared at the class level is called as a Field.
	int breadth;
	
	public Shapes(){
		length = 3;
		breadth = 2;
	}
		
	public Shapes(int length, int breadth){
		this.length = length;
		this.breadth = breadth;		
	}
	
	public void area(){
		System.out.println("Area of rectangle = " + (length*breadth) + " cm.sq.");
	}
	
	
	public static void figureShape(){
		System.out.println("Shape of the figure = Rectangle" );
	}
	
	public static void main(String[] args) {
		Shapes rectangle1 = new Shapes();	
		rectangle1.area();
		figureShape();
		
//		Shapes rectangle2 = new Shapes(10,8);
//		rectangle2.area();
		
		
	}
	
	

}
