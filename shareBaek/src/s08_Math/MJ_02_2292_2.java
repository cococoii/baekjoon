package s08_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MJ_02_2292_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//출력초과
		int N = Integer.parseInt(br.readLine()); 
		int count  = 1; //점수 //count
		int sum = 2;//range** / 범위 (최솟값 기준) ????
		//int max =7; //범위 중 제일큰수
		br.close();
		if(N==1) {
			System.out.print(1);
		}
		else{
			while(sum <= N) {
				sum = sum+(6*count);
				count++;
			}
			System.out.print(count);
		}
	}
}
/*
 * 1	 :1점(i)
 * 2~7	 :2점
 * 8~19	 :3점
 * 20~37 :4점	 
 * 38~61 :5점
 */