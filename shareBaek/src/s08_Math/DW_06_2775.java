package s08_Math;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DW_06_2775 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());

		for(int t=0; t<test_case; t++) {
			int K = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());

			int array[] = new int[N];	

			for(int i=0; i<N; i++) {
				array[i]=i+1;
			}

			for(int j=0; j<K; j++) {		
				for(int i=1; i<N; i++) {	
					array[i] = array[i-1]+array[i];
				}
			}
			System.out.println(array[N-1]);
		}
	}
}
