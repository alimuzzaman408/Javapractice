package day1;

public class Constructor_concept {
	int a;
	int b;
	Constructor_concept(int a,int b){
		this.a=a;
		this.b=b;
	}
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println("sum is: "+(a+b));  
	}
	public static void main(String[] args) {
		Constructor_concept co=new Constructor_concept(40,60);
		co.display();
	}
}
