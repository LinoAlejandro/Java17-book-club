public class Chick {
    String name;
    int numberEggs = 3;
    String lastName = "Chacha";
    String fullData = lastName + " " + numberEggs + " eggs";

    //No return type
    //Matches the name of the Class
    public Chick() {
        System.out.println("Creating a chick");

        //The general purpose of a constructor is to initialize variables
        name = "Chicky";
    }

    public void Chick() {
        System.out.println("Not a constructor");
    }

    public static void main(String[] args) {
        //c is the the place java store the reference to the object
        Chick c = new Chick();

        c.numberEggs = 1; //set variable
        System.out.println(c.numberEggs); //read variable
        System.out.println(c.name); //read variable
        System.out.println(c.fullData); //read variable
    }
}