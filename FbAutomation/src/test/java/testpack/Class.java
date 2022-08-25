package testpack;

public class Class {
	void test() {
		throw  new NullPointerException();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hello");
		Thread.sleep(2000);
		System.out.println("world");
	}

}
