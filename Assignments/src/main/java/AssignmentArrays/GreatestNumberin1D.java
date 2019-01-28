package AssignmentDay2;

public class GreatestNumberin1D {
	
	
	public static void main(String[] args){
		
		int[] ar1= {10,20,100,600,700,50};
		int len = ar1.length;
		int num=0;
		System.out.println(len);
		
		for(int i=0; i<len; i++){
		
			if 	(ar1[i] >num){
				
				num=ar1[i];
				}
			}
		
		System.out.println(num);
	}

}
