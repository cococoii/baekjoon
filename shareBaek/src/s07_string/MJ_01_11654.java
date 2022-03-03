package s07_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//소문자 대문자 숫자 구별??? X
public class MJ_01_11654 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int A = str.charAt(0);
//		int A = Integer.parseInt(br.readLine());
		
		System.out.println(A);
//		bw.write(A);

		br.close();
//		bw.flush();
//		bw.close();
	}
}
