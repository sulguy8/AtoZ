package flow;

import java.util.Scanner;

public class FlowEx_while_5 {
	public static void main(String[] args) {
		int num;
		int sum =0;
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		
		while(flag) {
			System.out.println(">>");
			
			String tmp = scan.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num!=0) {
				sum += num;
			} else {
				flag = false;
			}
		}
		
		System.out.println("합계:" + sum);
	}
}
