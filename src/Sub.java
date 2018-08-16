package practice;

class Base {
	public static void main(String[] args) {
		System.out.println("Base " + args[2]);
	}
}

public class Sub extends Base {
	public static void main(String[] args) {
		System.out.println("Overriden " + args[1]);
	}
}

/*And the commands:
javac Sub.java
java Sub 10 20 30
What is the result? => Overriden 20 */