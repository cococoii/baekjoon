package s07_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DW_s09_2941_if_croa_error_ {
	public static void main(String[] args)throws Exception {
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int dz_count = 0;
		int result = 0;
		
		String str = br.readLine();
		
		if(str.contains("c=")) count++;
		if(str.contains("c-")) count++;
		if(str.contains("d-")) count++;
		if(str.contains("lj")) count++;
		if(str.contains("nj")) count++;
		if(str.contains("s=")) count++;
		if(str.contains("z=")) count++;
		if(str.contains("dz=")) count++;
		
		result = (str.length()-(dz_count*3 + count*2)) + dz_count + count;
		
		System.out.println(result);
		System.out.println("======");
		System.out.println("count : " + count); 
	}
}
