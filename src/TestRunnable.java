
public class TestRunnable implements Runnable {

	public void run() {
		char symbole;
		for(int i=0;i<10;i++) {
			symbole=(char)(i+33);
			System.out.print(symbole);
			for(int y=0;y<i+1;y++) {
				System.out.print("*");
			}
			System.out.println(symbole);
		}
	}
	public static void main(String[] args) {
		Thread thread = new Thread(new TestRunnable());
		thread.start();

	}

}
