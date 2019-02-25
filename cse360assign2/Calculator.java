/*Name: Kevin McAllister
 *Class: CSE 360
 *Assignment #: 2
 */
/**This program acts as a functional calculator to perform mathematical operations on inputs.
 */
package cse360assign2;

public class Calculator 
{

    private int total;
    private String history;
    /** 
     * Sets the output value of the calculator to zero and initializes history string.
     */
    public Calculator () 
    {
        total = 0;  // not needed - included for clarity
        history = total + " ";
    }
    /**
     * Outputs the final value calculated. 
     * @return The calculated value.
     */
    public int getTotal () 
    {
        return total;
    }
    /**
     * Adds an integer to the total. 
     * Also updates the history string with a "+" and the integer.
     * @param value The integer to be added.
     */
    public void add (int value) 
    {
        total += value;
        history += "+ " + value + " ";
    }
    /**
     * Subtracts an integer from the total. 
     * Also updates the history string with a "-" and the integer.
     * @param  value The value to be subtracted from the total.
     */
    public void subtract (int value) 
    {
        total -= value;
        history += "- " + value + " ";
    }
    /**
     * Multiplies an integer by the total. 
     * Also updates the history string with a "*" and the integer.
     * @param  value The value to be multiplied by the total.
     */
    public void multiply (int value) 
    {
        total *= value;
        history += "* " + value + " ";
    }
    /**
     * Divides the total by an integer. If the parameter provided is a zero, the function 
     * instead sets the total to zero. 
     * Also updates the history string with a "/" and the integer.
       * @param  value The value the total is to be divided by.
     */
    public void divide (int value) 
    {
        if(value == 0)
        {
            total = 0;
        }
        else
        {
            total /= value;
        }
        history += "/ " + value + " ";
    }
    /**
     * Outputs the series of mathematical operations performed up to this point as a string.
     * @return The full equation in String format.
     */
    public String getHistory () 
    {
        return history;
    }
}
