import java.util.Scanner;
/**
 * Write a description of class JapanesePractice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JapanesePractice
{
    public static void main(String[] args)
    {
        String in;
        boolean more = true;
        Scanner scan = new Scanner(System.in);
        Hiragana prat = new Hiragana();
        System.out.print("1:Hiragana!\n2:Katakana!\n> ");
        if (scan.nextInt() == 2)
            prat = new Katakana(); //polymorphic, different object
        while(true)
        {
            while (more)
            {
                System.out.println();
                FS.sop(prat.info()); //dynamic(late) binding, called at runtime
                System.out.print("> ");
                int num = scan.nextInt();
                scan.nextLine();
                if (num == -1)
                    prat.isFirst(true);
                else
                {
                    prat.hira(num);
                    System.out.print("All good? Y/N\n> ");
                    in = scan.nextLine().toUpperCase();
                    if(in.equals("Y"))
                    {
                        more = false;
                        break;
                    }
                }
            }
            System.out.println();
            System.out.print("Generate? [Any key]/N or \"Add\" to add.\n> ");
            in = scan.nextLine().toUpperCase();
            if(in.equals("N"))
                break;
            else if(in.equals("ADD"))
                more = true;
            else
                System.out.print(prat.hiragana() + "\n");
        }
        System.out.print(prat.toring());
        System.out.print("\nSa Yo u Na Ra");
    }
}
