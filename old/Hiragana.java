import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
/**
 * Random Hirigana character generator
 * 
 * @author Jacob(y)
 * @version Hiragana 1.0 - 27 August 2016
 */
public class Hiragana
{
    protected boolean isFirst = true, na;
    protected int[] stat;
    protected final String[] vow = {"a", "i", "u", "e", "o"},
    k = {"ka", "ki", "ku", "ke", "ko"},
    s = {"sa", "shi", "su", "se", "so"},
    t = {"ta", "chi", "tsu", "te", "to"},
    n = {"na", "ni", "nu", "ne", "no"},
    h = {"ha", "hi", "fu", "he", "ho"},
    m = {"ma", "mi", "mu", "me", "mo"},
    y = {"ya", "yu", "yo"},
    r = {"ra", "ri", "ru", "re", "ro"},
    w = {"wa", "wo"},
    $n = {"n"};
    protected String[] hira;
    public Hiragana()
    {
        
    }
    /**
     * Info dump
     */
    public String info()
    {
        return "Input number to add\n-1:Reset\n0:All\n1:Vowels\n2:k" +
        "\n3:s\n4:t\n5:n\n6:h\n7:m\n8:y\n9:r\n10:w\n11:n\n";
    }
    /**
     * Set isFirst
     */
    public void isFirst(boolean b)
    {
        isFirst = b;
    }
    /**
     * Returns a random hiragana from a selection
     */
    public String hiragana()
    {
        int roll = FS.atRoll(hira.length) - 1;
        stat[roll]++;
        return hira[roll];
    }
    /**
     * Sets hiragana pool
     * You know, references exist for a reason
     * T_T
     */
    protected void hira(int intPut)
    {
        na = true;
        if(intPut == 0)
            na = false;
        switch(intPut)
        {
            case 0:
            case 1:
                gana("vow");
                if(na)
                    break;
            case 2:
                gana("k");
                if(na)
                    break;
            case 3:
                gana("s");
                if(na)
                    break;
            case 4:
                gana("t");
                if(na)
                    break;
            case 5:
                gana("n");
                if(na)
                    break;
            case 6:
                gana("h");
                if(na)
                    break;
            case 7:
                gana("m");
                if(na)
                    break;
            case 8:
                gana("y");
                if(na)
                    break;
            case 9:
                gana("r");
                if(na)
                    break;
            case 10:
                gana("w");
                if(na)
                    break;
            case 11:
                gana("$n");
                if(na)
                    break;
        }
    }
    /**
     * save me
     */
    protected void gana(String arr)
    {    
        String[] temp = hira;
        int combine;
        String[] reference = {""};
        switch(arr)
        {
            case "vow":
                reference = vow;
                break;
            case "k":
                reference = k;
                break;
            case "s":
                reference = s;
                break;
            case "t":
                reference = t;
                break;    
            case "n":
                reference = n;
                break;
            case "h":
                reference = h;
                break;
            case "m":
                reference = m;
                break;
            case "y":
                reference = y;
                break;
            case "r":
                reference = r;
                break;
            case "w":
                reference = w;
                break;
            case "$n":
                reference = $n;
                break;
        }
        while(true)
        {
            if(isFirst)
            {
               if (reference[0] == "")
                    break;
               hira = reference;
               isFirst = false;       
               break;
            }
            combine = hira.length + reference.length;
            temp = new String[combine];
            for(int i = 0; i < combine; i++)
            {
                if(i < hira.length)
                    temp[i] = hira[i];
                else
                    temp[i] = reference[i-hira.length];
            }
            hira = temp;
            break;
        }
        //tempFix();
        if(reference[0] != "")
            stat = new int[hira.length];
    }
    /**
     * Stats
     */
    protected String toring()
    {
        String format = "";
        for(int i = 0; i < hira.length; i++)
        {
            format += "\n" + hira[i] + "\t\t-\t\t" + stat[i];
        }
        return format;
    }
    /**
     * tempfix for 0 never rolling for some reason
     *
    protected static void tempFix()
    {
        String[] temp = hira;
        for(int i = 0; i < hira.length; 
    }
    */
}
