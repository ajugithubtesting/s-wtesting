package testpack;

public class repoex {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("1"); 
		 System.out.println("2"); 
		 System.out.println("3"); 
		 System.out.println("4"); 
		 Thread.sleep(5000); /// InterruptedException
		 try { 
		 System.out.println(100/0); // risky code line
		 } 
		 catch (Exception messge) { 
		 System.out.println("here is the risk and exception is coming " + 
		messge.getMessage() ); 
		 
	}
}
