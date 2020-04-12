package review.remind;

import java.util.Scanner;

public class Calculator {
	
		String a;
		String b;	

		void add(String a, String b) {
			int numA = Integer.parseInt(a);
			int numB = Integer.parseInt(b);
			System.out.println(numA+numB);			
		}
		void minus(String a, String b) {
			int numA = Integer.parseInt(a);
			int numB = Integer.parseInt(b);
			System.out.println(numA-numB);
		}		
		void multiple(String a, String b) {
			int numA = Integer.parseInt(a);
			int numB = Integer.parseInt(b);
			System.out.println(numA*numB);
		}		
		void division(String a, String b) {
			int numA = Integer.parseInt(a);
			int numB = Integer.parseInt(b);
			System.out.println(numA/numB);
		}
	
	public static void main(String[] args) {
		Calculator cC = new Calculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.곱하기");
		System.out.println("4.나누기");
	
		String select = scan.nextLine();
		
		if(select == null) {
			System.out.println("null값은 대입될 수 없습니다.");
		}else if("1".equals(select)) {
			System.out.println("첫번째 값");
			String a = scan.nextLine();
			System.out.println("두번째 값");
			String b = scan.nextLine();
			cC.add(a, b);
		}else if("2".equals(select)) {
			System.out.println("첫번째 값");
			String a = scan.nextLine();
			System.out.println("두번째 값");
			String b = scan.nextLine();
			cC.minus(a, b);
		}else if("3".equals(select)) {
			System.out.println("첫번째 값");
			String a = scan.nextLine();
			System.out.println("두번째 값");
			String b = scan.nextLine();
			cC.multiple(a, b);
		}else if("4".equals(select)) {
			System.out.println("첫번째 값");
			String a = scan.nextLine();
			System.out.println("두번째 값");
			String b = scan.nextLine();
			cC.division(a, b);
		}		
	}
}
