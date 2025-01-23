public class UnaryOperators {

    public static void main(String args[]) {
        incrementAndDecrementOperators();
    }

    public static void logicalComplementOperator() {


        boolean isAnimalAsleep = false;
        System.out.print(isAnimalAsleep); //false
        isAnimalAsleep = !isAnimalAsleep;
        System.out.print(isAnimalAsleep); //true
        }
    
        public static void bitwiseNegationOperator() {
    
        int number = 70; // Binary: 00000000 00000000 00000000 1000110
        int negated = ~number; //Binary: 11111111 11111111 11111111 0111001
        System.out.println(negated); // -71
        System.out.println(~negated); // 70
        }
    
        public static void negationOperator() {
    
            double zooTemperature = 1.21;
            System.out.println(zooTemperature); //1.21
            zooTemperature = -zooTemperature;
            System.out.println(zooTemperature); //-1.21
            zooTemperature = -(-zooTemperature);
            System.out.println(zooTemperature); //-1.21
    
            /* 
            int pelican = !5; //DOES NOT COMPILE
            boolean penguin = -true; //DOES NOT COMPILE
            boolean parrot = ~true; //DOES NOT COMPILE
            boolean peacock = !0; //DOES NOT COMPILE
    
            */
        }
    
        public static void incrementAndDecrementOperators() {
            int parkAttendance = 0;
            System.out.println(parkAttendance); // 0
            System.out.println(++parkAttendance); // 1
            System.out.println(parkAttendance); // 1
            System.out.println(parkAttendance--); // 1
            System.out.println(parkAttendance); // 0
        }
    
}
