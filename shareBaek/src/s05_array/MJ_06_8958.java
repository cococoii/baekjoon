package s05_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MJ_06_8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//HashSet<Integer> hs = new HashSet<Integer>();
		int R = Integer.parseInt(br.readLine());
		
		//int array[] = new int[R];
		String array[] = new String[R]; //*
		
		for(int i=0;i<R;i++) {
			array[i]=br.readLine();
		}
		for(int i=0;i<R;i++) {
			
			int count=0;
			int sum=0;
			
			for(int j=0;j<array[i].length();j++) { //*
				if(array[i].charAt(j)=='O') {
					count++;
				}else {
					count=0;
				}
				sum+=count;
			}
			System.out.println(sum);
			
		}
	}
}


