public class KitchenSink {
    public int Depth = 0;

    public void test() {
        for(int c = 0; c < 10; c++) {
            int Depth = 0;
            Depth++;
            {
                int Depth = 10;
                Depth++;
            }
        }
    }

    public static void main(String[] args) {
        KitchenSink ks = new KitchenSink();
        ks.test();
        System.out.println(ks.Depth);
    }
}