package my.work;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//====================================================		
		String s = "My Test String";
		
		String s1 = MyString.subString(s, 4, 5);
		
		System.out.println("SubString Output: " + s1);
		
		//====================================================
		
		String hex = MyString.toHex(347);
		
		System.out.println("ToHex: "+hex);
		
		//====================================================
		
		int dec = MyString.getDecimal("15B");
		
		System.out.println("To Decimal from Hex: "+dec);
		
		//====================================================
		
		MyString.permute("ABC", 0, 2);
		
		
		//====================================================
		//====================================================
		
//		System.out.println(s.substring(1,14));
//		System.out.println(s.length());

	}


}
