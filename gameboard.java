public class gameboard 
{
    //Default length and height of the gameboard.
    int length, height; 
    int[][] boardMatrix;
    /* May be unneeded at this time. (Probably definitely unneeded.)
        //Overwrites the current length of the gameboard.
        public void setLength(int length){
            this.length = length;
        }

        //Overwrites the height of the gameboard.
        public void setHeight(int height){
            this.height = height;
        }
    */

    //Returns the length of the gameboard.
    public int getLength()
    {
        return this.length;
    }

    //Returns the height of the gameboard.
    public int getHeight()
    {
        return this.height;
    }

    //Creates gameboard object.
    public gameboard()
    {
        this.length = 10;
        this.height = 20;
        
        this.boardMatrix = new int[this.height][this.length];
    }

    public gameboard(int length, int height)
    {
        this.length = length;
        this.height = height;

        this.boardMatrix = new int[length][height];
    }

    // In case you want to edit a specific point of the board, I don't know why you would want to.
    public void editPoint(int row, int column, int value)
    {
        try{
        this.boardMatrix[row][column] = value;
        }catch(ArrayIndexOutOfBoundsException outOfBounds){
            System.out.println("[WARN]: You attempted to edit a point that is not on the board.");
        }
    }

    //Prints the array (or line) that is currently passed through as an argument.
    //Currently only being used in printBoard() as a (subjectively) prettier solution.
    public void printLine(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //Prints the array implementation of the gameboard line by line, we will have to implement threads for constant updating.
    public void printBoard()
    {
        int count = 0;
        
        for (int[] array: this.boardMatrix)
        {
            printLine(array);
            System.out.println("-------------------");
            for(int i= 0; i < array.length; i++)
            {
                count++;
                // System.out.println(insideArray);
            }
        }
        System.out.println(count + " total spots.");
    }
    
    public static void main(String[] args)
    {
        
    }    
}
