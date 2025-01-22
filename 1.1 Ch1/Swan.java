public class Swan {
    public Swan() {
        System.out.println("constructor");
        System.out.println(age);
        age = 6;
        System.out.println(age);
    }

    int age = 5;

    //TODO after 1st try place this code block in line 2
    {
        System.out.println("instance initializer");
        System.out.println(age);
        age = 10;
        System.out.println(age);
    }

    public static void main(String ... args) {
        System.out.println("main");
        Swan s = new Swan();
        System.out.println(s.age);
        s.age = 3;
        System.out.println(s.age);
    }
}