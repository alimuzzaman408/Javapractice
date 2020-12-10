package day1;
//Inserting values in the variable


public class Student {
	
	String name;
	int id;
	int age;
	char grade;
	
	/*Student(String name,int id,int age,char grade){
		this.name=name;
		this.id=id;
		this.age=age;
		this.grade=grade;		
	}*/
	public void getvalue(String name,int id,int age,char grade) {
		this.name=name;
		this.id=id;
		this.age=age;
		this.grade=grade;
		
		System.out.println(name+"  "+id+"  "+age+"  "+grade);
	}
	
	void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
		System.out.println(grade);
		//System.out.println(name+" "+id+" "+age+" "+grade);
		
	}
	

	public static void main(String[] args) {
		//Student stu =new Student("Ali",101,25,'A');
		/*stu.name="Ali";
		stu.id=1012;
		stu.age=20;
		stu.grade='A';*/
		Student stu =new Student();
		stu.getvalue("Ali",101, 25,'A');
		System.out.println("**********");
		stu.display();
		
	}

}
