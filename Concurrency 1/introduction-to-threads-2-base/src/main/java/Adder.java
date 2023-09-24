public class Adder implements Runnable{
    int n1;
    int n2;

    Adder(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public void run(){
        System.out.println(n1+n2);
    }
}