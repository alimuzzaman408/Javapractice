package day1;

public class CallbyValue {

	int x;

	public void add(int a) {

		x=a+5;
		//System.out.println(x);

	}



	public static void main(String[] args) {
		CallbyValue cv=new CallbyValue();
		cv.add(10);
		System.out.println(cv.x);

	}

}
