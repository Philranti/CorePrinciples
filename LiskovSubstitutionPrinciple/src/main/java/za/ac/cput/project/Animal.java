package za.ac.cput.project;

public class Animal {
    private String name;

    public Animal(){

    }
    public Animal(String nm){
        name = nm;
    }

    public String getName() {
       return name;

    }

    void run(){
    System.out.println("This Animal can Run");
    }

    public void fly(){
        System.out.println("This Animal can Fly");
    }

}

