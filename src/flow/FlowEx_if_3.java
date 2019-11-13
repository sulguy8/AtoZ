package flow;

import java.util.Scanner;

public class FlowEx_if_3 {
	public static void main(String[] args) {
		System.out.println("숫자 하나를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		if(input==0) 
			System.out.println("입력하신 숫자는 0입니다");
		else 
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		
		
		
	}
}
