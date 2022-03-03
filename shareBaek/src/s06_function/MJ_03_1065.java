package s06_function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MJ_03_1065 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(math_sequence(Integer.parseInt(br.readLine())));
	}
	
	public static int math_sequence(int num) {
		int count = 0;
		
		
		if(num<100) 
			return num;
		else {
			count = 99; //한수의 최소 개수
			
			//최대 입력값 : 1000 (예외처리)
			if(num == 1000) {
				num = 999;
			}
			
			for(int i=100;i<=num;i++) {
				int baek = i/100; //백의 자릿수
				int sib = (i/10)%10; //십의 자릿수
				int ill = i%10;//일의 자릿수
				
				if((baek-sib) == (sib-ill)) {
					count++;
				}
			}
		}
			
		return count;
		
	}
	
/*
 * 
 * 1  31
 * 1 2 	19 38	
 */
}


