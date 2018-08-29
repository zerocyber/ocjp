package practice;

import java.util.ArrayList;

public class ColorTest2 {

	List colors = new ArrayList();
	colors.add("green");
	colors.add("red");
	colors.add("blue");
	colors.add("yellow");
	colors.remove(2);
	colors.add(3,"cyan");
	System.out.print(colors);
	
	
	//코드 잘못됨 오류뜸
}
