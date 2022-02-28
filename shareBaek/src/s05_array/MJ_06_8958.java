package s05_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;

public class MJ_06_8958 {

	public static void main(String[] args) throws IOException {
		//true반환 false반환하는거 응용?X
		//Hashset에서 중복되는 값이 없으면 저장되면서 true반환하고?X 0 reset
		//중복되서 저장되지 않으면 false반환한다. count++
		//N번 반복
		//O X 구별을 하고 들어가야하나? O
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine());

		//int array[] = new int[R];
		String array[] = new String[R]; //*

		for(int i=0;i<R;i++) {
			array[i]=br.readLine();
		}
		for(int i=0;i<R;i++) {

			int count=0;
			int sum=0;

			for(int j=0;j<array[i].length();j++) {
				if(array[i].charAt(j)=='O') { //*
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


