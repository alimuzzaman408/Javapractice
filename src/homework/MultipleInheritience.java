package homework;

interface M{
	int a=10;
	int b=20;
	void add();
}
interface N{
	int x=100;
	int y=200;
	void mul();
}
class Calculation implements M,N{
	public void add() {      
		System.out.println(a+b);
	}
	public void mul() {
		System.out.println(a*b);
	}
}
public class MultipleInheritience {
	public static void main(String[] args) {
		Calculation cal=new Calculation();
		cal.add();
		cal.mul();
	}
}
