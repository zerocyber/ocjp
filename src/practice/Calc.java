package practice;

public class Calc {
	
	//0���� 10���� ���ʷ� �־ �� ���ϱ�
	static int sum(int a) {
		if(a == 10) {
			return 10;
		}
		return a+ sum(a+1);
	}
	
	//10���� 1���� ���ʷ� �־ �� ���ϱ�
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
