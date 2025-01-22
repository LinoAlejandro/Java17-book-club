public class Var {
    public void whatTypeAmI() {
        var name = "Hello";
        var size = 7;
    }

    String tricky = "Hello"; // Instance variable

    public void reassignment() {
        var number = 7;
        number = 4;
    }

    public void breakingDeclaration() {
        var silly
        = 1;
    }

    public void doesThisCompile(boolean check) {
       var question = 1;

       var answer = 1;

       System.out.println(answer);
    }

    public void twoTypes() {
       int a, b = 3; // DOESN'T COMPILE
       Object n = null;
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public void var() {
        var var = "var";
    }
    
    public void Var() {
        Var var = new Var();
    }
}