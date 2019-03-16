package za.ac.cput.project;

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(){

    }

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public void setLength(int l){
        length = l;

    }

    public void setBreadth(int b){
        breadth = b;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

        public int area(){
            return length * breadth;
        }

    }

