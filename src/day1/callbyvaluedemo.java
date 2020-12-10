package day1;

public class callbyvaluedemo {
	/*int x;

	void m1(int a) {

		x=a+5;

	}

	public static void main(String[] args) {

		callbyvaluedemo cv=new callbyvaluedemo();

		cv.m1(10);
		System.out.println(cv.x);


	}*/



	int x;

	void m1(callbyvaluedemo a) {

		x=a.x+5;

	}

	public static void main(String[] args) {

		callbyvaluedemo cr=new callbyvaluedemo();

		cr.x=10;
		cr.m1(cr);
		
		System.out.println(cr.x);


	}
}
