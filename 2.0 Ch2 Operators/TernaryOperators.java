public class TernaryOperators {

    
    public static void main(String args[]) {

    }
    

    public static void example() {

    int owl = 5;
    int food;
    if(owl < 2) {
	    food = 3;
    } else {
	    food = 4;
    }
    System.out.println(food); //4

    int owl2 = 5;
    int food2 = owl2 < 2 ? 3 : 4;
    System.out.println(food2);


    //equivalentExmpressions
    int food1 = owl < 4 ? owl> 2 ? 3 : 4 : 5;
    int food3 = (owl < 4 ? ((owl> 2) ? 3 : 4) : 5);

    }

    public static void tests() {

        int stripes  = 7;
        System.out.println((stripes > 5) ? 21 : "Zebra");
      //  int animal = (stripes < 9 ) ? 3 : "Horse"; // DOES NOT COMPILE
    
        int sheep = 1;
        int zzz = 1;
        int sleep = zzz<10 ? sheep++ : zzz++;
        System.out.println(sheep + "," + zzz); //2,1
        
    }


}
