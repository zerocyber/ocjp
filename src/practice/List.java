package practice;

public class List {

	private Object e_data[] = new Object[100];
	
	private int size = 0;
	
	public boolean add_last(Object e) {
		e_data[size] = e;
		size++;
		
		return true;
	}
	
	public boolean add(int index, Object e) {
		for(int i = size -1; i>=index; i--) {
			e_data[i+1] = e_data[i];
		}
		e_data[index] = e;
		size++;
		
		return true;
	}
	
	
}
