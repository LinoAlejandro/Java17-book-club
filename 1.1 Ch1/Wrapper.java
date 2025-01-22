public class Wrapper {
    public static void main(String args[]) {
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");
        Integer wrapper2 = Integer.valueOf(primitive);

        System.out.println(primitive);
        System.out.println(wrapper);
        System.out.println(wrapper2);

        //GO BACK TO DOC

        Double apple = Double.valueOf(129.99);
        System.out.println(apple.byteValue());
        System.out.println(apple.intValue());
        System.out.println(apple.doubleValue());
 
        Integer grape = Integer.valueOf(200);
        System.out.println(grape.doubleValue());
    }
}