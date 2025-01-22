public class Reference {
    public static void main(String ... args) {
        int total = 10;
        int totalA = total;

        totalA = 11;

        System.out.println(total);
        System.out.println(totalA);

        //GO BACK TO DOC

        MyClass myclass1 = new MyClass();
        MyClass myclass2 = myclass1;
        MyClass myclass3 = new MyClass();

        myclass1.hello = "bye";

        System.out.println(myclass1.hello); //bye
        System.out.println(myclass2.hello); //bye
        System.out.println(myclass3.hello); //hello

        changeMyClass(myclass3);

        System.out.println(myclass3.hello);

        //GO BACK TO DOC

        // String reference = "hello";
        // int len = reference.length();
        // int len2 = len.length();

        // int myInt = null;
        // String myString = null;
    }

    public static void changeMyClass(MyClass myclass) {
        myclass.hello = "hola";
    }
}

class MyClass {
    String hello = "hello";

    void sayWhat() { }
}