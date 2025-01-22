public class Literals {
    public static void main(String ... args) {
        //long max = 3123456789;  // DOES NOT COMPILE
        long max = 3123456789L;  // Now Java knows it is a long
        //long max = 3123456789l;

        //GO BACK TO DOC 

        System.out.println(010);
        System.out.println(0xA);
        System.out.println(0b10);

        //GO BACK TO DOC 

        int million1 = 1000000;
        int million2 = 1_000_000;

        //double atStart = _1000.00;
        //double atEnd = 1000.00_;
        //double byDecimal = 1000._00;
        double ugly = 1_00_0.0_0;
        double reallyUgly = 1__________2;
    }
}