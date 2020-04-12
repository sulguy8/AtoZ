package Nov15;
import java.util.Scanner;

public class Nov15_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] points = new int[5];
		for(int i=1; i<=points.length; i++) {
			System.out.println(i + "번째 학생의 성적을 입력해주세요.");
			points[i-1] = Integer.parseInt(s.nextLine());
		}
		for(int i=0; i<points.length; i++) {
			for(int j=i+1; j<points.length; j++) {
				if(points[i] < points[j]) {
					int tmp = points[i];
					points[i] = points[j];
					points[j] = tmp;
				}
			}
		}
		for(int i=0; i<points.length; i++) {
			System.out.println(points[i]);
		}
	}
}
