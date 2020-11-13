import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		int i=0;
		for ( i = 0; i < 20; i++) {
			System.out.println(i);
		}
		return (i+1);
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		TestCallable t=new TestCallable();
		FutureTask<Integer> task=new FutureTask<Integer>(t);
		new Thread(task).start();
		System.out.println(task.get());


	}
}