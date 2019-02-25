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
    /** 
     * Sets the output value of the calculator to zero.
     */
    public Calculator () 
    {
        total = 0;  // not needed - included for clarity
    }
    /**
     * Outputs the final value calculated. 
     */
    public int getTotal () 
    {
        return total;
    }
    /**
     * Adds an integer to the total.
     * @param value The integer to be added.
     */
    public void add (int value) 
    {
        total += value;
    }
    /**
     * Subtracts an integer from the total.
     * @param  value The value to be subtracted from the total.
     */
    public void subtract (int value) 
    {
        total -= value;
    }
    /**
     * Multiplies an integer by the total.
     * @param  value The value to be multiplied by the total.
     */
    public void multiply (int value) 
    {
        total *= value;
    }
    /**
     * Divides the total by an integer. If the parameter provided is a zero, the function 
     * instead sets the total to zero.
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
    }
    /**
     * Returns the series of mathematical operations performed up to this point in string
     * format.
     */
    public String getHistory () 
    {
        return "";
    }
}
