public class LVariables {
    public int notValid() {
       int y = 10;
       int x = 5;
       int reply = x + y; // DOESN'T COMPILE
       return reply;
    }

    public int valid() {
        int y = 10;
        int x;
        x = 3;
        int z;
        int reply = x + y;
        return reply;
    }

    public void branching(boolean check) {
        int answer;
        int otherAnswer;
        int onlyOneBranch;

        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            onlyOneBranch = 2;
            answer = 2;
        }

        System.out.println(answer); // compiles
        System.out.println(onlyOneBranch); // doesn't compile
    }

    //GO BACK TO DOC

    public void findAnswer(boolean check) {}

    public void checkAnswer() {
        boolean value = true;
        findAnswer(value); // DOESN'T COMPILE
    }
}