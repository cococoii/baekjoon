package s08_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MJ_02_2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//실패
		int N = Integer.parseInt(br.readLine()); 
		
			int sum = 1;
			int i  =1; //점수
			int max =7; //범위 중 제일큰수
		while(true) {
			if(N==1) {
				break;
			}
			else if(N<=max) {
				break;
			}else {
				sum=6*i;
				max+=sum;
				i++;
			}
			
		}
		System.out.println(i);
		
		}
	/*
	 * 1	 :1점(i)
	 * 2~7	 :2점
	 * 8~19	 :3점
	 * 20~37 :4점	 
	 * 38~61 :5점
	 */
}