class MyThread extends Thread {
	public void run() {
		System.out.println("Thread Created");
	}
	
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
	}
}