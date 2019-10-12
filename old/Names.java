import java.util.Scanner;
/**
 * There's names I guess
 * 
 * @author Jacob(y)
 * @version 1.0
 */
public class Names
{
     public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         String[][] nameList;
         System.out.print("This program stores names and states those names and length.\n"
         + "How many names are you going to place?\n> ");
         nameList = new String[scan.nextInt()][3]; //states purpose and prompts user for amount
         for(int i = 0; i < nameList.length; i++)
         {
             System.out.print("\nPerson " + (i + 1) + "\'s name?\n> "); 
             nameList[i][0] = scan.next(); //prompt name
             System.out.print("\nMajor? " + "\n> ");
             nameList[i][1] = scan.next(); //prompt major
             System.out.print("\nMinor? " + "\n> ");
             nameList[i][2] = scan.next(); //prompt minor
         }  //Prompts user for names
         System.out.println("\nSo, here are the names, majors, and minors.\n" +
         "Name\t|\tMajor\t|\tMinor");
         for(int i = 0; i < nameList.length; i++) //for loop
         {
             for(int j = 0; j < nameList[i].length; j++)
             {
                 System.out.print(nameList[i][j] + "\t");
                 if(j < 2)
                    System.out.print("|\t");
                 else
                    System.out.println();
             }
         } //Displays names, major, and minor
     }
}
