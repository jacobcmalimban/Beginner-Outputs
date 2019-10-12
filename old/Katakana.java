import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
/**
 * Write a description of class Katakana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Katakana extends Hiragana
{
    protected final String[] e3 = {"she", "che", "je"},
    $w = {"wi", "we", "wo"},
    ts = {"tsa", "tsi", "tse", "tso"},
    ti = {"ti"},
    f = {"fa", "fi", "fyu", "fe", "fo"},
    d = {"di", "dyu"},
    v = {"va", "vi", "vu", "ve", "vo"};
    public Katakana()
    {
    }
    /**
     * Info
     */
    public String info()
    {
        String temp = super.info();
        return temp + "12:e3\n13:$w\n14:ts\n15:ti\n16:f\n17:d\n18:v\n";
    }
    protected void hira(int intPut)
    {
        super.hira(intPut);
        na = true;
        if(intPut == 0)
            na = false;
        switch(intPut)
        {
            case 0:
            case 12:
                gana("e3");
                if(na)
                    break;
            case 13:
                gana("$w");
                if(na)
                    break;
            case 14:
                gana("ts");
                if(na)
                    break;
            case 15:
                gana("ti");
                if(na)
                    break;
            case 16:
                gana("f");
                if(na)
                    break;
            case 17:
                gana("d");
                if(na)
                    break;
            case 18:
                gana("v");
                if(na)
                    break;
        }
    }
    /**
     * save me
     */
    protected void gana(String arr)
    {
        super.gana(arr);
        String[] temp = hira;
        int combine;
        String[] reference = {""};
        switch(arr)
        {
            case "e3":
                reference = e3;
                break;
            case "$w":
                reference = w;
                break;
            case "ts":
                reference = ts;
                break;
            case "ti":
                reference = ti;
                break;    
            case "f":
                reference = f;
                break;
            case "d":
                reference = d;
                break;
            case "v":
                reference = v;
                break;
        }
        while(true)
        {
            if(isFirst)
            {
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
        stat = new int[hira.length];
    }
}
