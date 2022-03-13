package s08_Math_dw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s01_1712_손익분기점 {

	/* A : 고정비용
	 * B : 가변비용
	 * C : 노트북가격 
	 * 
	 ** 총비용과 총수입이 같아지는 지점
	 * (n*노트북 가격) = 고정비용 + (n*가변비용)
	 * => n = 고정비용/노트북가격-가변비용
	 * => n = (A / C-B)
	 * 
	 ** 수익이 발생하는 지점 = n+1
	 * 
	 * 이익이 발생하지 않는 지점 : C-B<=0
	 * */
	
	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		StringTokenizer st = new StringTokenizer(br.readLine());
 
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
 
		if (C <= B) {
			System.out.println("-1");
		} 
		else {
			System.out.println((A/(C-B))+1);
		}		
	}
	
}
