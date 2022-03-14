package s07_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MJ_08_5622 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		int count = 0;
		
		for(int i=0;i<S.length();i++) {
			int x  = S.charAt(i);
			if(x<65)  count += 2;//다이얼1
			else if(x<=67) count += 3;//다이얼2
			else if(x<=70) count += 4;//다이얼3
			else if(x<=73) count += 5;//다이얼4
			else if(x<=76) count += 6;//다이얼5
			else if(x<=79) count += 7;//다이얼6
			else if(x<=83) count += 8;//다이얼7
			else if(x<=86) count += 9;//다이얼8
			else if(x<=90) count += 10;//다이얼9
			else count += 11;//다이얼0일때는...?
		}
		System.out.println(count);
	}

}
