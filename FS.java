import java.util.Random;
/**
 * Things just for fun, but also useful?
 * All methods are static
 * FS.method() to use :)
 * 
 * @author Jacob(y)
 * @version 12 August 2016
 */
public class FS
{
    private static Random generator = new Random();
    /**
     * Roll for the galaxy!
     * Generates a pseudorandom number from 1 to input 
     * Input: range - int to determine range
     * Output:a pseudorandom number inclusive of the max
     * If you want it from 0 to your range just - 1 from the output
     */
    public static int atRoll(int range)
    {
        return generator.nextInt(range) + 1;
    }
    /**
     * Overloading atRoll
     */
    public static int atRoll(char range)
    {
        int rage = range;
        System.out.println(rage);
        return atRoll(rage);
    }
    /**
     * Clever retorts... What's up with that?
     * Input:  null
     * Output: a pseudorandom phrase from a selection
     */
    public static String naniSore()
    {
        String retort = "\n";
        switch(atRoll(7))
        {
            case 1: retort += "It's not like I thought that was" +
            " funny you dummy!";
                break;
            case 2: retort += "I've fallen and I can't even.";
                break;
            case 3: retort += "I don't really care.";
                break;
            case 4: retort += "Fu fu fu... Ahum.";
                break;
            case 5: retort += "*smiles smugly*";
                break;
            case 6: retort += "Heh. Hehehe. HAhaha... HAHAHAHAHA";
                break;
            case 7: retort += "Jeez, big brother, stop being useless.";
                break;
        }
        return retort += "\n";
    }
    /**
     * System.out.print shortcut
     * Input:  String to be printed
     * Output: null
     */
    public static void sop(String str)
    {
        System.out.print(str);
    }
    /**
     * System.out.println shortcut
     * Input:  String to be printed
     * Output: null
     */
    public static void sopln(String str)
    {
        System.out.println(str);
    }
    /**
     * Method cannot be overridden
     */
    public final static void unchange()
    {
        System.out.println("Get Rekt");
    }
    /**
     * Visibility type is not part of signature
     *
    protected final static void unchange()
    {
        System.out.println("Nope");
    }
    */
    /**
     * Sigma Linear
     */
    public static int sigmaL(int sig)
    {
        int total = 0;
        for(int i = sig; i > 0; i--)
        {
            total += i;
        }
        return total;
    }
    /**
     * Sigma Recursive
     */
    public static int sigmaR(int sig)
    {
        if (sig > 1)
            return sig + sigmaR(sig - 1);
        else
            return 1;
    }
    /**
     * Recursive Factorial
     * n > 0 to work
     * else -1 return for error
     */
    public static int factorial(int n)
    {
        if(n == 0)
            return -1;
        else if (n < 0)
        {
            System.out.println("You've gone too large.");
            return -1;
        }
        else if (n == 1)
            return n;
        else 
            return n * factorial(n-1);
    }
}
