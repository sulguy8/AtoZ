package flow;

import java.util.Scanner;

public class FlowEx_whiledo_1 {
	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() *100)+1;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("1과 100사이의 정수를 입력해 주세요");
			input = scan.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도하세요.");
			} else if(input < answer) {
				System.out.println("더 큰 수로 시도하세요.");
			}	
			
		} while (input!=answer);
			
		
		System.out.println("정답입니다.");
			
	}
}
