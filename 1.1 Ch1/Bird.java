// How many code blocks? 1
// How many instance initializers? 1

public class Bird {
    public static void main(String args[]) {
        System.out.println("block main");

        {
            System.out.println("block inside main");
        }
    }

    {
        System.out.println("code block Bird");
    }
}