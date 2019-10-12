/**
 * Maze methods here
 * 
 * @author Jacob(y)
 * @version Mzze_Methology 1.0 - 12 August 2016
 */
public class Maze_Methology
{
    private int yUser, xUser, rXit, cXit;
    private String[][] maze, mazeCopy;
    /**
     * We need a Constructor right here
     * @input: Determines move space(walls not included)
     * @output: It's not a method, it's a constructor
     */
    public Maze_Methology(int size)
    {
        buildWall(size);
        brExit();
        //saltmore();
        startLoc();
        setVis();
        mazeCopy = maze;
    }
    /**
     * Creates the borders, trumping users
     * @input: Moveable area w/o walls
     * @output: Nothing really, void for set up
     */
    private void buildWall(int size)
    {
        maze = new String[size+2][size+2]; //+2 for borders
        for(int i = 0; i < maze.length; i++)
        {
            for(int j = 0; j < maze[0].length; j++)
            {
                if((i == 0 && (j == maze[0].length - 1 || j == 0)) || (i == maze.length - 1 && (j == 0 || j == maze[0].length - 1)))
                {   //if first or last row, and corner
                    maze[i][j] = "+";
                }
                else if(i == 0 || i == maze.length - 1)
                {   //if first or last row, and not corner
                    maze[i][j] = "-";
                }
                else if(j == 0 || j == maze[0].length - 1)
                {   //if first or last column, and not corner
                    maze[i][j] = "|";
                }
                else
                {   //blank spaces, everything else
                    maze[i][j] = " ";
                }
            }
        }
    }
    /**
     * Create exit, dropping the economic value of a nation
     */
    private void brExit()
    {
        int path = FS.atRoll(4); //binary choosing
        if(path == 1)
        {   //exit top or bottom
            rXit = 0;
            cXit = FS.atRoll(maze.length - 3);
        }
        else if(path == 2)
        {   //exit left or right
            cXit = 0;
            rXit = FS.atRoll(maze[0].length - 3);
        }
        else if(path == 3)
        {
            rXit = maze.length - 1;
            cXit = FS.atRoll(maze.length - 3);
        }
        else
        {
            cXit = maze[0].length - 1;
            rXit = FS.atRoll(maze[0].length - 3);
        }
        maze[rXit][cXit] = " ";
    }
    /**
     * Recursive salt mining
     * Start @ exit, work way up/left/right/down
     * else default end
     */
    private void saltMore()
    {
        /**
         * 1a - Create it so that walls have to be connected to something
         *  no more than 2 connections
         *  
         * 1b - do Both 1c and 1d
         * 
         * 1c - ReCursive 1a
         * 
         * 1d - RanDomize 1a
         * 
         * Mathematical relationship between size & 
         * 
         * 2a - Have this build a path instead
         * actually that might be easier
         * 
         */
    }
    /**
     * Demonstrates full maze
     */
    public void demoIllusion()
    {
        for(int i = 0; i < mazeCopy.length; i++)
        {
            for(int j = 0; j < mazeCopy[0].length; j++)
            {
                System.out.print(mazeCopy[i][j] + " ");
                if(j == mazeCopy.length - 1)
                {
                    System.out.println();
                }
            }
        }
    }
    /**
     * Creates maze with visibility reduced
     */
    public void setVis()
    {
        mazeCopy = new String[3][3];
        for(int i = -1; i < 2; i++)
        {
            for(int j = -1; j < 2; j++)
            {
                mazeCopy[i+1][j+1] = maze[yUser+i][xUser+j];
            }
        }
        mazeCopy[1][1] = "X";
    }
    /**
     * Restores mazeCopy to original
     */
    private void restore()
    {
        mazeCopy = maze;
    }
    /**
     * Checks if player has exited
     */
    public boolean exit()
    {
        boolean chk = (yUser == rXit && xUser == cXit);
        if (chk)
            restore();
        return chk;
    }
    /**
     * Randomizes starting location
     */
    private void startLoc()
    {
        //chk to make sure wall doesn't exist
        yUser = FS.atRoll(maze.length - 3);
        xUser = FS.atRoll(maze.length - 3);
    }
    /**
     * Moves user
     */
    public void move(String move)
    {   // chek for walls
        int tempY = yUser, tempX = xUser;
        move = move.toUpperCase();
        if(move.equals("U"))
            tempY--;
        else if(move.equals("L"))
            tempX--;
        else if(move.equals("R"))
            tempX++;
        else if(move.equals("D"))
            tempY++;
        if(maze[tempY][tempX].equals(" "))
        {
            yUser = tempY;
            xUser = tempX;
        }
        else
            System.out.print(FS.naniSore());
    }
}
