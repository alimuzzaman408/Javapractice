package day1;

public class Studentdetails {
	int id;
	String name;
	
	/*Studentdetails(int id,String name)
	{
		this.id=id;
		this.name=name;
		
		
	}*/
	void display() {
		
		System.out.println(id+" "+name);
		
		
	}
	void getValue(int id,String name) {
		
		this.name=name;
		this.id=id;
	}
	
	public static void main(String arg[]) {
		
		//Studentdetails sd=new Studentdetails(101,"Badal");
		//sd.sid=123;
		//sd.sname="Alam";
		//sd.getValue(101, "Ali");
		Studentdetails sd=new Studentdetails();
		sd.getValue(101, "Ali");
		sd.display();
		
		
	}
		

		
	
	

}
