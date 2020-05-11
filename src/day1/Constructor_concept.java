package day1;

public class Constructor_concept {
	int x;
	int  y;

	Constructor_concept(int a,int b){

		x=a;
		y=b;



	}
	void display() {

		System.out.println("sum is: "+(x+y));  

	}


	public static void main(String[] args) {
		Constructor_concept co=new Constructor_concept(10,20);
		co.display();

	}

}
