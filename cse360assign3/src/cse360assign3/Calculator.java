package cse360assign3;

public class Calculator {
private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return 0;
	}
	
	public void add (int value) {
		int sum = value + total;
	}
	
	public void subtract (int value) {
		int sub = value - total;
	}
	
	public void multiply (int value) {
		
		int multi = value * total;
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
