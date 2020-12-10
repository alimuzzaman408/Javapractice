package day1;

import java.util.ArrayList;
import java.util.Arrays;


public class Arrayconcept {

	public static void main(String[] args) {


		ArrayList <Integer>arr=new ArrayList<Integer>() ;
		arr.add(12);
		arr.add(16);
		arr.add(18);
		System.out.println(arr);


		int [] ar=new int[5];
		ar[0]=16;
		ar[1]=26;
		ar[2]=36;
		ar[3]=46;
		ar[4]=66;
		System.out.println(ar.length);

		for(int x:ar) {

			System.out.print(x+" ");

		}
		
		
		
		/*int [][] ar1=new int[2][2];
		ar[0][0]=16;
		ar[0][1]=26;
		ar[1][0]=36;
		ar[1][1]=46;

		System.out.println(ar1.length);
		System.out.println(ar1[0].length);

		for(int []x:ar1) {
			for(int i:x) {
				System.out.print(i+"    ");

			}
			System.out.println();

		}





		/*int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println("Size of the array:"+ " "+a.length);
		for(int i=0;i<a.length;i++) {

			System.out.println(a[i]);
		}
		System.out.println("*********");
		for(int i:a) {
			System.out.println(i);


		}
		System.out.println("*********");
		int a1[]= {10,20,30,40};
		System.out.println(a1.length);
		System.out.println(a1[0]);
		for(int i:a1) {

		System.out.println(i);	
		}*/




	}

}
