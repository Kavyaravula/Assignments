package AssignmentDay2;

public class Array2DPrint {
	
	public static void main(String[] args){
		
		int [][]a = {{1,2,3},{4,5,6}};
		
		int rowLength= a.length;
		int colLength= a[0].length;
		
		
		System.out.println(rowLength);
		System.out.println(colLength);
		
		for (int i=0;i<rowLength; i++){
			for (int j=0; j<colLength; j++){
				
				System.out.print(a[i][j]);
				
			}
			System.out.println();
		}
	}

}
