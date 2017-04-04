package facebook;

import java.util.HashSet;
import java.util.Random;

public class ThreadTest {
	static boolean isTerminated;
	static Thread thread;
	
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		Random r = new Random();
		for (int i = 0 ; i < 10; i ++) {
			int v = r.nextInt(10);
			if (set.contains(v)) {
				i--;
				continue;
			}
			set.add(v);
			System.out.println(v);
		}
	
	}
	
	class Test implements Runnable {

		@Override
		public void run() {
			for (int i = 1; i <=10; i++) System.out.println(i);
		}
		
	}
}
