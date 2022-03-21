package thr;

public class TestThreads {
	public static void main (String[] args) {
		
	ThreadOne t1 = new ThreadOne();
	Thread one = new Thread(t1);
	one.start();
		
	}
}	