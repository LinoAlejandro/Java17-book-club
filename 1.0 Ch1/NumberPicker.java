import java.util.Random;

public class NumberPicker {
   public static void main(String[] args) {
      Random r = new Random(); // DOES NOT COMPILE
      System.out.println(r.nextInt(10));
   }
}