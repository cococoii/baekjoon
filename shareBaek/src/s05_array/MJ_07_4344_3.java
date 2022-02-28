package s05_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MJ_07_4344_3 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array;
		int C = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=0;i<C;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken());
			array = new int[N];

			double sum = 0;//*
			
			for(int j=0;j<N;j++) {
				int su = Integer.parseInt(st.nextToken());
				array[j]=su;
				sum += su;
			}
			double avg = (sum/N);//*
			double count = 0;//*

			//*평균넘는 학생찾기
			for(int j=0;j<N;j++) {
				if(array[j]>avg) {
					count++; //*
				}
			}

			System.out.printf("%.3f%%\n",(count/N)*100);//*
		}
	}
}
