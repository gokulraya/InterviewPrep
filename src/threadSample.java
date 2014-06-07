
public class threadSample extends Thread {

	/**
	 * @param args
	 */
	public void run()
	{
		System.out.println("Hello from thread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadSample t=new threadSample();
		t.start();
			
	}

}
