public class shapes 
{
    final static int inUse = 2;
    int[][] shape;
    public shapes()
    {

    }

    public void displayShape()
    {
        for (int[] array: this.shape)
        {
            for (int num: array)
            {
                System.out.print(num);
            }
            System.out.println();
            
        }
    }

    public void setShape(int[][] shape)
    {
        this.shape = shape;
    }
    
}
class shapeI extends shapes
{
    //We can use the numbers in the array to determine whether that piece
    //is the current piece
    //0 means empty slot, 1 means occupied by previously placed blocks, inUse means currently movable (will be changed into 1 when placed.)
    int[][] shape = {{inUse},
                     {inUse},
                     {inUse},
                     {inUse}};

    public void displayShape()
    {
        super.displayShape();
    }

    public shapeI()
    {
        super.setShape(this.shape);
    }
}

class shapeT extends shapes
{
    //We can use the numbers in the array to determine whether that piece
    //is the current piece
    //0 means empty slot, 1 means occupied by previously placed blocks, inUse means currently movable (will be changed into 1 when placed.)
    int[][] shape = {{0,inUse,0},
                 {inUse,inUse,inUse}};

    public void displayShape()
    {
        super.displayShape();
    }

    public shapeT()
    {
        super.setShape(this.shape);
    }
}

class shapeZ extends shapes
{
    //We can use the numbers in the array to determine whether that piece
    //is the current piece
    //0 means empty slot, 1 means occupied by previously placed blocks, inUse means currently movable (will be changed into 1 when placed.)
    int[][] shape = {{inUse,inUse,0},
                         {0,inUse,inUse}};

    public void displayShape()
    {
        super.displayShape();
    }

    public shapeZ()
    {
        super.setShape(this.shape);
    }
}

class shape_S extends shapes
{
    //We can use the numbers in the array to determine whether that piece
    //is the current piece
    //0 means empty slot, 1 means occupied by previously placed blocks, inUse means currently movable (will be changed into 1 when placed.)
    int[][] shape = {{0,inUse,inUse},
                 {inUse,inUse,0}};

    public void displayShape()
    {
        super.displayShape();
    }

    public shape_S()
    {
        super.setShape(this.shape);
    }
}

class shapeL extends shapes
{
    //We can use the numbers in the array to determine whether that piece
    //is the current piece
    //0 means empty slot, 1 means occupied by previously placed blocks, inUse means currently movable (will be changed into 1 when placed.)
    int[][] shape = {{inUse,0,0},
                     {inUse,0,0},
                     {inUse,inUse,inUse}};

    public void displayShape()
    {
        super.displayShape();
    }

    public shapeL()
    {
        super.setShape(this.shape);
    }
}

class shapeJ extends shapes
{
    //We can use the numbers in the array to determine whether that piece
    //is the current piece
    //0 means empty slot, 1 means occupied by previously placed blocks, inUse means currently movable (will be changed into 1 when placed.)
    int[][] shape = {{0,0,inUse},
                     {0,0,inUse},
             {inUse,inUse,inUse}};

    public void displayShape()
    {
        super.displayShape();
    }

    public shapeJ()
    {
        super.setShape(this.shape);
    }
}

class shapeBlock extends shapes
{
    //We can use the numbers in the array to determine whether that piece
    //is the current piece
    //0 means empty slot, 1 means occupied by previously placed blocks, inUse means currently movable (will be changed into 1 when placed.)
    int[][] shape = {{inUse,inUse},
                     {inUse,inUse}};

    public void displayShape()
    {
        super.displayShape();
    }

    public shapeBlock()
    {
        super.setShape(this.shape);
    }
}