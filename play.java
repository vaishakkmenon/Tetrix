
import java.util.Random;

public class play
{
    private static Random rand = new Random(); // Used to randomly select a shape.
    private static gameboard board;            // The actual gameboard.
    
    // Function for selecting and returning a shape.
    // Currently not operational as it is being used to test shapes.
    public static shapes randomShapes()
    {
        switch (rand.nextInt(7))
        {
            case 0:
                return new shapeL();
            case 1:
                return new shapeI();
            case 2:
                return new shapeZ();
            case 3:
                return new shape_S();
            case 4:
                return new shapeJ();
            case 5:
                return new shapeBlock();
            case 6:
                return new shapeT();
            default:
                return new shapeL();

                
        }
    }

    // Function that adds shape to the gameboard. 
    public static void addShape()
    {
        shapes testing = randomShapes();
        int middle = (int)Math.floor(board.length/2);
        int iterative = -1;
        for(int[] shapeArray: testing.shape)
        {
            iterative++;
            for(int i = 0; i<shapeArray.length;i++){
                if(shapeArray[i] != 0)
                {
                    board.boardMatrix[iterative][middle-1+i] = shapes.inUse; // Draws the initial shape on top of board.
                }
                
            }
                
        }
    }
    public static void main(String[] args)
    {
        board = new gameboard(5,10);
        // board.editPoint(19,5,3);
        addShape();
        board.printBoard();
    }
}