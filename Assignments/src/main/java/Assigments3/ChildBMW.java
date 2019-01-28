package Assigments3;

public class ChildBMW extends CarParent{
	
	public void start(){
		System.out.println("BMW--> Start");
	}
	
	public void stop(){
		System.out.println("BMW--> Stop");
	}
	
	public void theftSaftey(){
		System.out.println("BMW--> TheftSaftey");
	}

	public static void main(String[] args){
		
		ChildBMW cbmw= new ChildBMW();
		CarParent cp = new CarParent();
		cp.start();
		cp.stop();
		cbmw.start();
		cbmw.stop();
		cbmw.theftSaftey();
		
		
	}
}
