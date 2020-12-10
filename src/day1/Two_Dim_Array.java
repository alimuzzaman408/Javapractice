package day1;

public class Two_Dim_Array {

	public static void main(String[] args) {
		int a[][]=new int[3][2];		
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		System.out.println(a.length);
		System.out.println(a[0].length);
		
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[0].length;j++) {
			
			System.out.print(a[i][j]+" ");
			
		}
		System.out.println();
		
	}
	
	System.out.println("*************************************");	

		for(int []x:a) {
			
			for(int i:x) {
				
				System.out.print(i+" ");
				
			}
			
			System.out.println();
		}
		
	}

}
