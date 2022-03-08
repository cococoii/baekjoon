package s07_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MJ_02_11720 {
	public static void main(String[] args) throws IOException {
		//charAt()
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		String S = br.readLine();
		
		for(int i=0;i<N;i++) {
			count += S.charAt(i)-48;
		}
		br.close();
		System.out.println(count);
	}
}
