package day1;
@FunctionalInterface
interface car{
	public int m1(int a,int b);
}
public class Test {

	public static void main(String[] args) {
		car c=(a,b)->{
			int res=a+b;			
			return (res);};		
			System.out.println("Addition of two number is ::"+c.m1(10,15));
	}

}
