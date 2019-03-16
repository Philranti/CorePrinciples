package za.ac.cput.project;

public class Box extends Rectangle{
    private int height;

    public Box(int le, int br, int he){
        super( le, br);
        height = he;
    }

    public void setHeight(int he){
        height = he;
    }

    public int getHeight(){
        return height;
    }

    public int area( ){
        return 2*(height * getBreadth( ) ) + 2*(height * getLength( ) ) + 2*(getBreadth( ) * getLength( ) );
    }


}
