package day1;

public class Studentdetails {
	int sid;
	String sname;
	
	Studentdetails(int id,String name)
	{
		sid=id;
		sname=name;
		
		
	}
	void display() {
		
		System.out.println(sid);
		System.out.println(sname);
		
	}
	/*void getValue(int id,String name) {
		
		sname=name;
		sid=id;
	}*/
	
	public static void main(String arg[]) {
		
		Studentdetails sd=new Studentdetails(101,"Badal");
		//sd.sid=123;
		//sd.sname="Alam";
		//sd.getValue(101, "Ali");
		sd.display();
		
		
	}
		

		
	
	

}
