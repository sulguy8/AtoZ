package flow;

public class FlowEx_for_enhanced_1 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) 
			System.out.print(arr[i] + " ");
		System.out.println();
		
		for(int i :arr) { // 타입 변수명 : 배열 또는 컬렉션
			System.out.print(i + " ");
			sum += i;
		}
		
		System.out.println();
		System.out.println("sum=" + sum);
	}

}
