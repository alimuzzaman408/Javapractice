package day1;

public class Call_By_Ref {
	int x;
	public void addition(Call_By_Ref a) {		
		x=a.x+5;	
	}	
	public static void main(String[] args) {
		Call_By_Ref cr=new Call_By_Ref();
		cr.x=10;
		cr.addition(cr);
		System.out.println(cr.x);

	}

}
