import java.util.*;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        Adder ad = new Adder(n1, n2);
        ScalerThread st = new ScalerThread(ad);
        st.start();
    }
}