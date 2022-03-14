package s07_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MJ_07_2908 {
	public static void main(String[] args) throws IOException{
		//입력받고 A B로 변수지정해놓고
		//거꾸로수를 크기비교후 A,B 중 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
//		int A = (int) st.nextElement();
//		int B = (int) st.nextElement();
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		
		int a = (A/100)+(((A%100)/10)*10)+((A%100)%10)*100;		
		int b = (B/100)+(((B%100)/10)*10)+((B%100)%10)*100;	
		
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
	}
}
