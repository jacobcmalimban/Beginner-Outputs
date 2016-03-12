import java.util.Scanner;
/**
 * Jacob designs a maze!
 * Matrix visuals I guess
 * 
 * @author Jacob(y)
 * @version Amazing 1.0 - 12 August 2016
 */
public class Amazing
{
    public static void main(String[] args)
    {
        Maze_Methology newMaze = new Maze_Methology(2); //Maze
        Scanner scan = new Scanner(System.in);          //Reads input
        int choice = 0;                                 //Moves user along
        String next;                                    //Needed to make sure #s are input
        System.out.print("Hello, this is Jacob's maze program.\nIt does stuff. "); //Greetings
        while(true)
        {
            while(choice >= 0)
            {
                System.out.print("Do you wish to play?\n1:No\n2:Yes\n> ");
                next = scan.next();
                try
                {
                    choice = Integer.parseInt(next);
                    if(choice == 1 || choice == 2)
                    {
                        break;                          //Exit if good input
                    }
                }
                catch (NumberFormatException e)
                {
                    System.out.print(FS.naniSore());    //What are you doing user
                }
            }
            if(choice == 1)
                break;                                  //Exit
            do
            {
                System.out.print("\nHow large would you like your maze?\nIt has to be greater than 1.\n> ");
                next = scan.next();                     //Same thing as above
                try 
                {
                    choice = Integer.parseInt(next);
                    if(choice > 1)
                    {
                        newMaze = new Maze_Methology(choice);
                        break;                          //Maze created
                    }
                    else
                    {
                        choice = 2;                     //User what are you doing
                        System.out.print(FS.naniSore());
                    }
                }
                catch(NumberFormatException e)
                {
                    System.out.print(FS.naniSore());
                }
            }while(choice < 2);
            while(true)
            {
                newMaze.setVis();
                newMaze.demoIllusion();
                System.out.print("U(p), D(own), L(eft), R(ight)?\n> ");
                next = scan.next();
                newMaze.move(next);
				System.out.println();
                if(newMaze.exit())
                {
                    System.out.print("Congratulations, you won!\n");
                    newMaze.demoIllusion();
                    choice = 0;
                    break;
                }
            }
        }
        System.out.println("Take care then.");
    }
}