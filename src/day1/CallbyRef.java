package day1;

public class CallbyRef {


	int x;

	public void add(CallbyRef a) {

		x=a.x+5;
		System.out.println(x);

	}

	public static void main(String[] args) {

		CallbyRef cr=new CallbyRef();
		cr.x=10;
		cr.add(cr);
	}

}
