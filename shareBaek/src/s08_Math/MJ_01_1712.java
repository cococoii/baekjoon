package s08_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MJ_01_1712 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		br.close();

		int n=1;
		while( (A+(B*n)) >= (C*n) ) {

			n++;
		}
		if(n>2100000001)
			System.out.println(-1);
		else{
			System.out.println(n);
		}

	}
}
/*
 문제를 보시면 다음과 같은 조건이 있습니다.
A, B, C는 21억 이하의 자연수이다.
즉, C*i 혹은 B*i + A 연산 과정중에 overflow가 발생할 수 있습니다. 
long형으로 변수를 바꾸셔야 하는데, 워낙 큰 수다보니 반복문으로는 통과가 안될겁니다 :)
 */
