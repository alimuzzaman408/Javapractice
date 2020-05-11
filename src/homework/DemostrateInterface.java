package homework;


interface A{
	
	//int a=10;
	//int b=20;
	void sum(int c);

	
}
class B implements A{
	
	public void sum(int c) {
		//System.out.println(a);
		//System.out.println(b);
		int total=c+10;
		System.out.println(total);
		
	}	
	
}


public class DemostrateInterface {

	public static void main(String[] args) {
		
    B objb=new B();
    
    objb.sum(15);
	}

}
