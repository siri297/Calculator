/** URL: https://github.com/siri297/Calculator/blob/master/cse360assign3/src/cse360assign3/Calculator.java **/
/** Name: Bhavana Chinta **/
/** Pin-216**/
/**Assignment-3**/

package cse360assign3;

public class Calculator {
private int total;
/** Two string global variables are declared and these variables used to store the integer value and also assign the symbols "+,-,/,*" **/
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
		total+= value; /** the value plugged in is added to the total and the total holds added value **/
		number = Integer.toString (value); /** storing the integer**/
		sign="+";        /** assigned the symbol of addition to sign **/
		concatinate= concatinate+" "+sign+" "+number; 
	}
	
	public void subtract (int value) {
		total -= value;         /** the value plugged in is subtracted to the total and the total holds subtracted value **/
		number = Integer.toString (value);  /** storing the integer**/
	    sign="–";               /** assigned the symbol of subtraction to sign **/
	    concatinate= concatinate+" "+sign+" "+number;
	}
	
	public void multiply (int value) {
		
		total *= value ; /** the value plugged in is multiplied to the total and the total holds multiplied value **/
		number = Integer.toString (value);     /** storing the integer**/
	    sign="*";                /** assigned the symbol of multiplication to sign **/
	    concatinate= concatinate+" "+sign+" "+number;
	}
	
	public void divide (int value) {
		/** if the value inserted is 0 then it goes in to the if condition and sets the total to 0 or it goes to else**/
		if(value==0)
		{	total=0; } /** this is what it happens in the test case called divide_by_zero**/ 
		else
		{
			total = total/value;     /** now the value is divided and stored it in total**/
		}
		number = Integer.toString (value);      /** storing the integer**/
	    sign="/";           /** assigned the symbol of division to sign **/
	    concatinate= concatinate+" "+sign+" "+number;
	}
	
	public String getHistory () {
		
		return concatinate; /** the concatinate contains the concatinate value plus the sign plus the number so, thats what the getHistory() test case is expected **/
	}

}
