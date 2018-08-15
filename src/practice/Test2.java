package practice;

public class Test2 {
	public static void main(String[] args) {
		int ax = 10, az = 30;
		int aw = 1, ay = 1;
		try {
			aw = ax % 2;
			System.out.println("aw : " + aw);
			ay = az / aw;
			System.out.println("ay : " + ay);
		} catch (ArithmeticException e1) {
			System.out.println("Invalid Divisor");
		} catch (Exception e2) {
			aw = 1;
			System.out.println("Divisor Changed");
		}
		System.out.println("ay, az, aw : " + ay + "," + az+ "," + aw);
		ay = az / aw; // Line 14
		System.out.println("Succesful Division " + ay);
	}
}

/* Result : Invalid Divisor
Exception in thread "main" java.lang.ArithmeticException: / by zero
at practice.Test2.main(Test2.java:16)*/

