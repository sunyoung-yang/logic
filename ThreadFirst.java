class ThreadWidthClass extends Thread{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName());
			try {
				Thread.sleep(10);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}
class ThreadWithRunnable implements Runnable {
	@Override
	public void run() {
		   for (int i = 0; i < 5; i++) {

	            System.out.println(Thread.currentThread().getName()); 
	            try {
	            	Thread.sleep(10);
	            }catch(InterruptedException e) {
	            e.printStackTrace();
	            }
		   	}
	  }
}
public class ThreadFirst {
	public static void main(String[] args) {
		ThreadWidthClass thread1 = new ThreadWidthClass();
		Thread thread2 = new Thread( new ThreadWidthClass());
		
		thread1.start();
		thread2.start();
	}
}
