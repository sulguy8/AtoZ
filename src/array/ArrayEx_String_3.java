package array;

public class ArrayEx_String_3 {
	
	public static void main(String[] args) {
			String src = "ABCDE";
			
			for(int i=0; i<src.length(); i++) {
				char ch = src.charAt(i);
				System.out.println("src.charAt("+i+"):"+ch);
			}
			char[] chArr = src.toCharArray();
			
			System.out.println(chArr);
			
		System.out.println(src.charAt(1));
		System.out.println(src.substring(1,3));
		System.out.println(src.equals("ABCDE"));
	}
}
