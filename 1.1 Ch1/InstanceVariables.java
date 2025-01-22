public class InstanceVariables {
    public int age; // INSTANCE VARIABLE
    public static int name; // CLASS INSTANCE

    public static void main(String ... args) {
        InstanceVariables iv = new InstanceVariables();

        System.out.println(iv.age);
        System.out.println(iv.name);
    }
}