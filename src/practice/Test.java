package practice;

public class Test {
	public static void main(String[] args) {
		boolean isChecked = false;
		int arry[] = {1,3,5,7,8,9};
		int index = arry.length; //6
		while (index > 0 ) { //index가 0보다 크면
			if (arry[index-1] % 2 ==0) { 
				isChecked = true;
			}
			index--;
		}
		System.out.print(arry[index] + ", " + isChecked);
	}
}