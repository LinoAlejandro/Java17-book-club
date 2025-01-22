 public class TextBlock {
    /*
     * "Java Study Guide"
     *  by Scott & Jeanne
     *
     */
    public static void main(String ... args) {
        //Scape characters
        String scapeCharacters = "\"Java Study Guide\"\n by Scott & Jeanne";

        //Text Blocks
        String textBlock = """
        "Java Study Guide"
         by Scott & Jeanne""";

        System.out.println(scapeCharacters);
        System.out.println(textBlock);

        String pyramid = """
          *
         * *
        * * *
        """;
        System.out.print(pyramid);

        //GO BACK TO DOC

        // String block = """doe""";

        // String block = """
        // doe \
        // deer""";

        // String block = """
        // doe \n
        // deer
        // """;

        String block = """
         "doe\"\"\"
         \"deer\"""
        """;

        System.out.println(block);
        System.out.println("*"+ block + "*");
    }
}