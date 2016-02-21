/** URL: **/
/** Name: Bhavana Chinta **/
/** Pin-216**/
/**Assignment-3**/

package cse360assign3;

public class Calculator {
private int total;
private String 	number;
private String sign; 
private String concatinate= "0";

	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total+= value;
		number = Integer.toString (value);
		sign="+";
		concatinate= concatinate+" "+sign+" "+number;
	}
	
	public void subtract (int value) {
		total -= value;
		number = Integer.toString (value);
	    sign="–";
	    concatinate= concatinate+" "+sign+" "+number;
	}
	
	public void multiply (int value) {
		
		total *= value ;
		number = Integer.toString (value);
	    sign="*";
	    concatinate= concatinate+" "+sign+" "+number;
	}
	
	public void divide (int value) {
		
		if(value==0)
		{	total=0; }
		else
		{
			int div = total/value;
		}
		number = Integer.toString (value);
	    sign="/";
	    concatinate= concatinate+" "+sign+" "+number;
	}
	
	public String getHistory () {
		
		/**concatinate= concatinate+" "+sign+" "+number;**/
		return concatinate;
	}

}
