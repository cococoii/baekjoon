package s07_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MJ_06_1152 {
	public static void main(String[] args) throws IOException{
		//그냥 공백으로 구분해서 count
		//Stringtokenizer로 단어 없을 때까지 출력하는 메서드? 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int count = 0;
		
		while(st.hasMoreTokens()) {
			st.nextToken(); 
			count++;
		}
		System.out.println(count);
		
		br.close();
	}

}
//st.countTokens());도 있다
