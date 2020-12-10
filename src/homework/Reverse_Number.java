package homework;

public class Reverse_Number {

	public static void main(String[] args) {
	
   int number=12367897;
   int rev_num=0;
   
   while(number!=0) {
	   int reminder=number%10;//3
	   rev_num=rev_num*10+reminder;//3,32,321
	   number=number/10;	   	   
   }
   System.out.println(rev_num);
   
	}

}
