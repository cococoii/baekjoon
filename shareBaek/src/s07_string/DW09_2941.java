package s07_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DW09_2941{

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String str = br.readLine();
		int result = 0;
		
		for(int i=0; i<croatia.length; i++) {
			if(str.contains(croatia[i])) {
				str = str.replaceAll(croatia[i], "*");
			}	
		}
		
		result = str.length();
		
		System.out.println(result);
	}
}
