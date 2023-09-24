public class Client {
    public static void main(String[] args) {
        System.out.println("I am the main class");

        Adder ad = new Adder();
        ScalerThread st1 = new ScalerThread(ad);
        st1.start();

        Subtractor sb = new Subtractor();
        ScalerThread st2 = new ScalerThread(sb);
        st2.start();
    }
}