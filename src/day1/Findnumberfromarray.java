package day1;

public class Findnumberfromarray {

	public static void main(String[] args) {
		String a[]= {"java","Python","Selenium"};
		String name="csharp";
		boolean flag=false;
		for(String i:a) {
			if(i.equals("javaa")) {
				System.out.println("Element is present");
				flag=true;
				break;

			}


		}
		if(flag==false) {
			System.out.println("Element is not present");
	}
	}
}
