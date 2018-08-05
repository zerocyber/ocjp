package practice;

public class Calc {
	
	//0부터 10까지 차례로 넣어서 합 구하기
	static int sum(int a) {
		if(a == 10) {
			return 10;
		}
		return a+ sum(a+1);
	}
	
	//10부터 1까지 차례로 넣어서 합 구하기
	static int sum2(int b) {
		if(b == 1) {
			return 1;
		}
		return b + sum2(b-1);
	}

	public static void main(String[] args) {
		System.out.println(sum(0));
		System.out.println(sum2(10));
	}
}
