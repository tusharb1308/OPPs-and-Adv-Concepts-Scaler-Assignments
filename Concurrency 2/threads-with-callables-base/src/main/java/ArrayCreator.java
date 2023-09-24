import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<ArrayList<Integer>> {
    private int n;

    public ArrayCreator(int n){
        this.n = n;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            list.add(i);
        }

        return list;
    }
}
