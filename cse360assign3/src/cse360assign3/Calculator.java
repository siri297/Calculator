package cse360assign3;

public class Calculator {
private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total+= value;
	}
	
	public void subtract (int value) {
		total -= value;
	}
	
	public void multiply (int value) {
		
		total *= value ;
	}
	
	public void divide (int value) {
		
		int div = total/value;
		if(value==0)
			total=0;
	}
	
	public String getHistory () {
		return "";
	}

}
