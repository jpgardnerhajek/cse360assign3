/*The Calculator class exists to act as a calculator for simple
 * mathematical equations. It also exists as an introduction to
 * the use of Github.
 *@author	James Gardner-Hajek
 */

package cse360assign3;
/* public class Calculator
 * the core class of the program at hand.
 */
public class Calculator {

	private int total;
	private String history;
	
	/*public Calculator()
	 * The constructor for the Calculator class
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	/*public int getTotal
	 * This method is used to get the current total stored in the calculator
	 */
	public int getTotal () {
		return total;
	}
	/*public void add
	 * this method is used to add a value to the total stored value
	 * @param value			Value to be added
	 */
	public void add (int value) {
		total=total+value;
		history=history+" + "+value;
	}
	/*public void subtract
	 * this method is used to subtract a value from the total stored value
	 * @param value			Value to be subtracted
	 */
	public void subtract (int value) {
		total=total-value;
		history=history+" - "+value;
	}
	/* public void multiply
	 * this method is used to multiply the current total by a value
	 * @param value			value for total to be multiplied by
	 */
	public void multiply (int value) {
		total=total*value;
		history=history+" * "+value;
	}
	/*public void divide
	 * this method is used to divide the current total by a value
	 * @param value			value to be divided by
	 */
	public void divide (int value) {
		if(value==0)
		{
			total=0; 
			history=history+" / "+value;
			return;
		}	
		total=total/value;
		history=history+" / "+value;
	}
	/*public String getHistory
	 * this method is used to get the history of operations used to
	 * obtain the current value
	 */
	public String getHistory () {
		return history;
	}
}