package za.ac.cput.project;

public class CheetahSolution extends Animal {
    private String name;

    public CheetahSolution(String nm){
        super(nm);
        name = nm;

    }

    public String getName(){
        return name;
    }


    @Override
    void run() {
        super.run();
    }

    public String toString() {
        return "Name of the Animal is a " + getName();
    }
}
