package s08_Math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DW_s05_10250_ACM {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int input = Integer.parseInt(br.readLine());
		
		for(int i=0; i<input; i++) {
			st = new StringTokenizer(br.readLine());
			
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int count = 1;
			String end = "";
			
			while(N>H) {
				N = N-H;
				count++;	
			}
			
			if(count<=9) {
				end = "0"+Integer.toString(count);
			}else {
				end = Integer.toString(count);
			}
			bw.append(Integer.toString(N)+end+'\n');
		}
		bw.flush();
	}
}
