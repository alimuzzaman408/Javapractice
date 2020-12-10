package homework;


interface A{	
	int a=10;	
	void sum(int c);	
}
class B implements A{	
	public void sum(int c) {
		int total=c+10;
		System.out.println(total);		
	}		
}
public class DemostrateInterface {
	public static void main(String[] args) {	
    B objb=new B();   
    objb.sum(15);
    System.out.println(objb.a);
	}

}
