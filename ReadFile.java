package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scan = new Scanner(new File("input.txt"));
		while(scan.hasNextLine())
		{
			System.out.println(scan.nextLine());
		}
	}

}
