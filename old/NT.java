import java.text.DecimalFormat;
import java.util.Arrays;
/**
 * Programming stuff I did not know or forgot.
 * New Things, in other words.
 * 
 * @author Jacob(y)
 * @version 1.0
 */
public class NT extends FS
{
    /**
     * Finds average of some integers
     * @input: an indetermined amount of integers
     * @output: the average of them all
     * 
     * NOTE: type ... var can only be used once, at the end of inputs
     */
    public static int avg(int ... num)
    {
        int sum = 0;
        for(int one : num)
            sum += one;
        return sum / num.length;
    }
    /**
     * Demonstration of Ternary operators
     * (condition) ? (return if condition true) : (else);
     * @input: a - an integer
     *         b - another one
     * @output: the smaller one 
     * 
     * NOTE: best use is simple if-else assignment
     */
    public static int ternarySml(int a, int b)
    {
        return (a < b) ? a:b;
    }
    /**
     * Formats a double to have forced places.
     * Also rounds up to the forced place so that's nice
     * @input: forced - the number of decimal places
     *         dub    - number to be formatted
     * @output: formatted String         
     */
    public static String format(int forced, Double dub)
    {
        String place = ".";
        for(int i = 0; i < forced; i++)
        {
            place += "0";
        }
        DecimalFormat fmt = new DecimalFormat(place);
        return fmt.format(dub);
    }
    /**
     * Concantination, because why not
     */
    public static String concat(int choice, String ... str)
    {
        String temp = "";
        if(choice == 0)
        {
            for(String one: str)
            {
                temp = temp.concat(one);
            }
        }
        else
        {
            for(String one: str)
            {
                temp += one;
            }
        }
        return temp;
    }
    /**
     * Prints an array
     */
    public static void arrPrt(int ... num)
    {
        System.out.print(Arrays.toString(num));
    }
    /**
     * Prints a 2D array, syntactically
     * different but semantically the same
     */
    public static void arrPrt(int nums[][])
    {
        System.out.println(Arrays.deepToString(nums));
    }
    /**
     * Parses string to int
     */
    public static int toInt(String num)
    {
        return Integer.parseInt(num);
    }
    /**
     * Shows protection.
     * Usable only by the parent and its children
     */
    protected static void hi()
    {
        System.out.println("hi");       
    }
    /**
     * Incremental Difference
     */
    public static int inc(boolean yes, int put)
    {
        int tup;
        if(yes)
            tup = put++;
        else
            tup = ++put;
        return (put - tup);
    }
    /**
     * Prefix to Infix conversion, recursively
     * Prefix : + 3 4
     * Infix (3 + 4)
     * P : / + 5 4 8
     * I : ((5 + 4) / 8)
     */
    public static String p2f(String str)
    {
        String infix = "";
        if (str.length() > 0)
        {
            char test = str.charAt(0);
            switch(test)
            {
                case '/':
                case '*':
                case '-':
                case '+':
                case '%':
                    //is a symbol
                    infix += "(";
                    infix += p2f(str.substring(1, str.length() - 1));
                    infix += test;
                    infix += str.charAt(str.length()-1);
                    infix += ")";
                    break;
                default:
                    infix += test;
                    //not a symbol
                    break;
            }
            return infix;
        }
        return "";
    }
}
