
public class TestThread extends Thread{

	public TestThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
public void run () {
	for(int i=0 ; i < 20 ; i++) {
		System.out.println();
	}
}
	public static void main(String[] args) {
		TestThread t1 = new TestThread("1-");
		TestThread t2 = new TestThread("2--");
		TestThread t3 = new TestThread("3---");
		TestThread t4 = new TestThread("4----");
		TestThread t5 = new TestThread("5-----");

	}

}
