package MyAssignments;

public class StringVerify {
	
	final  String str1= "Kavya";
	static String str2="Satish";
	String str3="Kumar";

	public static void main(String[] args) {
		String str4= "Test";
		StringVerify s= new StringVerify();
		System.out.println(s.str1);
		System.out.println(s.str2);
		System.out.println(s.str3);
	str2 = "QTP";
	s.str3="hi";
	//s.str1="update";
	System.out.println(s.str1);
	System.out.println(str2);
	System.out.println(s.str3);

	}

}
