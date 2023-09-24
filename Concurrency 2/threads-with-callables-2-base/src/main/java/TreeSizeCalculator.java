import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    public Node root;
    public ExecutorService es;

    public TreeSizeCalculator(Node root, ExecutorService es){
        this.root = root;
        this.es = es;
    }

    @Override
    public Integer call() throws Exception {
        if(root == null) return 0;

        TreeSizeCalculator lst = new TreeSizeCalculator(root.left, es);
        TreeSizeCalculator rst = new TreeSizeCalculator(root.right, es);

        Future<Integer> lsts = es.submit(lst);
        Future<Integer> rsts = es.submit(rst);

        return lsts.get() + rsts.get() + 1;
    }
}
