package Assigments3;

public class CarTest {
	
	public void refuel(){
		System.out.println("CarTest --> Refuel");
	}
	
	public static void main(String[] args){
		
		CarParent cp1= new CarParent();
		CarParent cp2= new ChildBMW();
	cp2.start();
		//cp1.start();
		
	}

}
