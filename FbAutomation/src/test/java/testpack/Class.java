package testpack;

public class Class {
	void test() {
		throw  new NullPointerException();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hi");
		Thread.sleep(2000);
		System.out.println("world");
	}

}
