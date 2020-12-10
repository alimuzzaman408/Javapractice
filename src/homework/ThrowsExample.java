package homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

	public static void main(String[] args) throws IOException, InterruptedException  {
		FileReader fr=null;
		 fr=new FileReader("C:\\Users\\shapan\\Desktop\\Automation\\Textfile.txt");

		BufferedReader br=new BufferedReader(fr);
		System.out.println(br.readLine());		
		Thread.sleep(5000);
		br.close();
		
	}

}
