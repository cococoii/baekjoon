package s07_string;

import java.io.IOException;
import java.util.Scanner;

public class MJ_07_2908_2 {
	public static void main(String[] args) throws IOException{
		
	Scanner in = new Scanner(System.in);
        
		int A = in.nextInt();
		int B = in.nextInt();
        
        in.close();
        
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.print(A > B ? A : B);
	}
}
