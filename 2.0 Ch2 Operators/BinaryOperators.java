import java.io.File;

public class BinaryOperators {

    
    public static void main(String args[]) {

        System.out.println(Long.MAX_VALUE);


    }


    /**
     * ARITHMENTIC OPERATORS
     */
    public static void workingWithParenthesis() {
        int price = 2 * 5 + 3 * 4 - 8;
        System.out.println(price);
        int price2 = 2 * ((5 + 3) * 4 - 8);
        System.out.println(price2);
    }

/* 
    long pigeon = 1 + ((3 * 5) / 3; //DOES NOT COMPILE
    int blueJay = (9 + 2) + 3) / (2 *4; //DOES NOT COMPILE
    short robin = 3 + [(4 * 2) + 4]; //DOES NOT COMPILE
    }

    */

    public static void divisionAndModulusOperator(){
        System.out.println(9 / 3); //3
        System.out.println(9 % 3); //0
        
        System.out.println(10 / 3); //3
        System.out.println(10 % 3); //1
    }

    public static void modulusWithNegativeNumbers() {
        System.out.println( 2 % 5); //2
        System.out.println( 7 % 5); //2
        System.out.println( 2 % -5); //2
        System.out.println( 7 % -5); //2
    }
        public static void modulusWithNegativeDivisor() {
            System.out.println( -2 % 5); //-2
            System.out.println( -7 % 5); //-2
            System.out.println( -2 % -5); //-2
            System.out.println( -7 % -2); //-2
    }
    

    /**
     * ASIGNING OPERATOR
     */

     public static void casting() {
        int fur = (int)5;
        int hair = (short)2;
        String type = (String)"Bird";

        short a = 4;
        short b = 10;
        short tail = (short)(a + b);
       // long feathers = 10(long); //DOES NOT COMPILE

      //Why it doesnt compile?

      /* 
      
      double egg = 2.0 / 9;  //1
      int tadpole = (int)5 * 2L;
      short frog = 3 - 2.0;
      
      int fish = 1.0;
      short bird = 1921222;
      int mammal = 9f;
      long reptile = 192_301_398_193_810_323;
 
      */
     }

     public static void overFlowExample() {
        System.out.print(2147483647 + 1); // -2147483648
     }

     public static void otherExamples() {

        short mouse = 10;
        short hamster = 3;
       // short capybara = mouse * hamster; //DOES NOT COMPILE
       // short capybara2 = (short)mouse * hamster; //DOES NOT COMPILE
       // short capybara3 = 1 + (short)(mouse * hamster); //DOES NOT COMPILE

       byte hat = 1;
       byte gloves = 7 * 10;
       short scarf = 5;
       short boots = 2 + 1;
   
      // short boots = 2 + hat; //DOES NOT COMPILE
      // byte gloves = 7 * 100; //DOES NOT COMPILE

     }

     public static void returnValueOfAssignmentOperator() {
        long wolf = 5;
        long coyote = (wolf = 3);
        System.out.println(wolf); //3
        System.out.println(coyote); //3
     }

     public static void trickyExample() {
        boolean healthy = false;
        if(healthy = true)
            System.out.print("Good!");
    
     }

     /**
      * Bitwise operators
      */

      public static void bitwiseOperators() {
        int number = 70;
        System.out.println(number); //70
        System.out.println(number & number); //70
        System.out.println(number | number); //70

        //bitwiseOperatorsWithNegation

        int negated = ~number;
        System.out.println(negated); //-71
        
        System.out.println(number & negated); //0
        System.out.println(number | negated); //-1
        System.out.println(number ^ number); // 0
        System.out.println(number ^ negated); //-1
      }

      /**
       * Compound Assignment Operators
       */

      public static void examples() {
        int camel = 2, giraffe = 3;
        camel = camel * giraffe; //simple assignment operator
        camel *= giraffe; // compound assignment operator   
        
        long goat = 10;
        int sheep = 5;
       // sheep = sheep * goat; //DOES NOT COMPILE
    
        long goat2 = 10;
        int sheep2 = 5;
        sheep2 *= goat2; 

      }

      /**
       * Conditional operators
       */

       public static void examples2() {

        int hour = 10;
        boolean zooOpen = true || (hour < 4);
        System.out.println(zooOpen); //true

       }

       public static void conditionalVsLogical(Duck duck) {
        
        if(duck != null & duck.getAge() < 5) { 
            //Could throw a nullPointerException
                //Do something
            }
        
        
            if(duck != null && duck.getAge() < 5) { 
                //Do something
            }
        
        
        
            int rabbit = 6;
            boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
            System.out.println(rabbit);
       }

       /**
        * Equality operators
        */

        public static void exampleEquality() {
           /* 
            boolean monkey = true ==3; //DOES NOT COMPILE
            boolean ape = false != "Grape"; //DOES NOT COMPILE
            boolean gorilla = 10.2 == "Koko"; //DOES NOT COMPILE

        */

            boolean bear = false;
        boolean polar = (bear = true);
        System.out.println(polar); //


        var monday = new File("schedule.txt");
        var tuesday = new File("schedule.txt");
        var wednesday = tuesday;
        System.out.println(monday == tuesday); //
        System.out.println(tuesday == wednesday); //

        System.out.println(null == null); // true

        }

        /**
         * Logical operators
         */

         public static void exampleLogical() {
            boolean eyesClosed = true;
            boolean breathingSlowly = true;
            boolean resting = eyesClosed | breathingSlowly;
            boolean asleep = eyesClosed & breathingSlowly;
            boolean awake = eyesClosed ^ breathingSlowly;
            System.out.println(resting); //true
            System.out.println(asleep); //true
            System.out.println(awake); //false
         }

         public static void numericPromotionRules() {
            int x = 1;
            long y = 33;
            var z = x * y;
        
            double x2 = 39.21;
            float y2 = 2.1f;
            var x22 = x2 + y2;
        
            short x3 = 10;
            short y3 = 3;
            var z3 = x3 * y3;
        
            short w4 = 14;
            float x4 = 13;
            double y4 = 30;
            var z4 = w4 * x4 / y4;

          
         }

         /**
          * Relational operators
          */

          public static void relationalExamples() {

            int gibbonNumFeet = 2, wolfNumFeet = 4, ostrichNumFeet = 2;
            System.out.println(gibbonNumFeet < wolfNumFeet); // true
            System.out.println(gibbonNumFeet <= wolfNumFeet); // true
            System.out.println(gibbonNumFeet >= ostrichNumFeet); // true
            System.out.println(gibbonNumFeet > ostrichNumFeet); // false
          }

          public static void instanceOf() {
            Integer zooTime = Integer.valueOf(9);
            Number num = zooTime;
            Object obj = zooTime;
          }

          public void openZoo(Number time) {
            if(time instanceof Integer)
                System.out.print((Integer)time + "O'clock" );
            else 
                System.out.println(time);

                
        }

        public void openZoo2(Number time) {
          //  if(time instanceof String) //DOES NOT COMPILE
                System.out.println(time);
        }

        public static void moreExamples() {

            System.out.println(null instanceof Object); // false
            String noObjectHere = null;
            System.out.println(noObjectHere instanceof String); // false

           // System.out.println(null instanceof null); // DOES NOT COMPILE
        }
    
}

class Duck {
    private Integer age;

    public Integer getAge() {
        return age;
    }
}
