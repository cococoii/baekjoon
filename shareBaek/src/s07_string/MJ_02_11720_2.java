package s07_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MJ_02_11720_2 {
	public static void main(String[] args) throws IOException {
		//getBytes()
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(br.readLine());
		br.readLine();
		
		int count = 0;
//		String S = br.readLine();
		
		//for-each
		for(byte value : br.readLine().getBytes()) {
			count += (value -'0');
		}
		br.close();
		System.out.println(count);
	}
}
