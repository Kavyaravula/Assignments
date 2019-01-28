package MyAssignments;

public class SwappingNumbers {
	public static void main(String[] args){
		
		int a= 30;
		int b =50;
		System.out.println("Values Before Swapping are: a=" + a + ", b="+ b);
		
		 a = a+b;// 80
		 b= a-b; // 30;
		 a= a-b; //50
		
		 System.out.println("Values After Swapping are: a=" + a + ", b="+ b);
	}

}
