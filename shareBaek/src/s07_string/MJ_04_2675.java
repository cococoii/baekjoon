package s07_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MJ_04_2675 {
	public static void main(String[] args) throws IOException {
		//T = 케이스반복횟수
		//R = 문자반복횟수
		//공백
		//S 문자열
		//배열에넣고R번씩 출력하기? x
		//그작업을 T번 반복?
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()); 
//		int i = 0;
		
//		while(i<T) {
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();

			for(int k=0;k<S.length();k++) {
				for(int j=0;j<R;j++) {
					System.out.print(S.charAt(k));
				}
			}
//			i++;
			System.out.println();			
		}
	}
}

