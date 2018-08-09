package practice;

public class Question9 {

	public static void main(String[] args) {
		for (int ii = 0; ii < 3; ii++) {
			int count = 0;
			System.out.println("ii의 값: " + ii);
			for (int jj = 3; jj > 0; jj--) {
				System.out.println("jj의 값 : " + jj);
				if (ii == jj) {
					++count;
					System.out.println("count 늘어남");
					break;
				}
			}
			System.out.println("count의 값 : " + count);
			continue;
		}
	}
}