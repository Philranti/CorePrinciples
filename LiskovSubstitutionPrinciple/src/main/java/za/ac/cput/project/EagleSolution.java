package za.ac.cput.project;

public class EagleSolution extends  Animal{
    private String name;

    public EagleSolution(String nm){
       super(nm);
       name = nm;
    }

    public String getName(){
        return name;
    }


    @Override
    public void fly() {
        super.fly();
    }
  public String toString(){
        return "Name of the Animal is a "+getName();
  }
}
