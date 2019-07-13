package my.work;

public class MyString {
	
	static String subString(String str,int s, int e) {
		StringBuilder str1 = new StringBuilder();
		
		
		//ALT 1
//		str1.delete(e, str1.length());
//		str1.delete(0, s);
//		System.out.println(str1);
		
		//ALT 2
		for(int i=s;i<e;i++) {
			str1.append(str.charAt(i));
		}
		
		
		return str1.toString();
	}
	
	public static String toHex(int decimal){    
	     int rem;  
	     String hex="";   
	     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
	    while(decimal>0)  
	     {  
	       rem=decimal%16;   
	       hex=hexchars[rem]+hex;   
	       decimal=decimal/16;  
	     }  
	    return hex;  
	}    
	
	public static int getDecimal(String hex){  
	    String digits = "0123456789ABCDEF";  
	             hex = hex.toUpperCase();  
	             int val = 0;  
	             for (int i = 0; i < hex.length(); i++)  
	             {  
	                 char c = hex.charAt(i);  
	                 int d = digits.indexOf(c);  
	                 val = 16*val + d;  
	             }  
	             return val;  
	}  
	
    public static void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
    
    private static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
