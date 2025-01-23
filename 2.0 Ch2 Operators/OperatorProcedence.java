public class OperatorProcedence {

    public static void main(String[] args) {

        //Example1
        int cookies = 4;
        double reward = 3 + 2 * --cookies;
        System.out.println("Zoo animal receives: " + reward + " reward points");
    

        int height = 2;
        int length = 6;

        //Example2
        var perimeter = 2 * height + 2 + length;
    
        System.out.println(perimeter);

        //Example3
        perimeter = ((2 * height) + (2 * length));

        System.out.println(perimeter);


       


    }
    
}
