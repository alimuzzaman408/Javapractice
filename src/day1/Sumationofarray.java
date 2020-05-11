package day1;

public class Sumationofarray {

	public static void main(String[] args) {

		int a[]= {12,14,15,17};
		int sum=0;

		for(int i:a) {
			System.out.print(i+" ");
			sum=sum+i;

		}

		System.out.println();
		System.out.println();
		System.out.println(sum);
	}

}
