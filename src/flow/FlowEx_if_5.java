package flow;

import java.util.Scanner;

public class FlowEx_if_5 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.println("점수를 입력해주세요");
		
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		
		System.out.printf("당신의 점수는 %d 입니다.", score);
		
		if (score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}
		} else if (score >= 80) {
			grade = 'B';
		} if (score >= 8) {
			opt = '-';
		} else {
			grade = 'c';
		}
		
		System.out.printf("당신의 학점은 %c%c 입니다.", grade, opt);
	}

}
