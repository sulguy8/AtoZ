package review.remind;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arr {
	public static void main(String[] args) {
		int[] arr = new int[30];
		Random rNum = new Random(); // 30개의 방을 만듬

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rNum.nextInt(45);
			for (int z = i - 1; z >= 0; z--) {
				if (arr[i] == arr[z]) {
					i--;
					break; // 방에 숫자들을 넣음. 중복제거
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmpNum = arr[i];
					arr[i] = arr[j];
					arr[j] = tmpNum; // 방에 있는 숫자를 내림차순으로 정렬함

				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); // 출력
		}
		
		List<Integer> lst = new ArrayList<Integer>();
		Random rd = new Random();

		for (int i = 0; i < 6; i++) {
			int rNum2 = rd.nextInt(45) + 1;
			if (lst.indexOf(rNum2) == -1) {
				lst.add(rNum2);
			} else {
				i--;
			}
		}
		
		System.out.println(lst); // List의 중복제거
		
		

	}
}
