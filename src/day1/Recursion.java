package day1;

public class Recursion {

	public static void main(String[] args) {
		//sayhi(5);
		reduceByOne(10);

	}

	
	public static void sayhi(int n) {
		if(n==0) {
		System.out.println("done");
		}else {
			System.out.println("hi");
			n--;
			sayhi(n-1) ;
		}
		
		
		
		
	}
	
	public static void reduceByOne(int n) {
		if(n>=0) {
		reduceByOne(n-1);
		}
		System.out.println(n);
	}
	
	
	
	
	
	
}
