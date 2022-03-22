package s08_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MJ_01_1712_2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		br.close();

		if (C <= B) {
			System.out.println("-1");
		} 
		else {
			System.out.println((A/(C-B))+1);
		}

	}
}
/*
같아지는 지점
Cn = A+Bn
여기서 n을 구하려면
Cn-Bn =A
(C-B)n = A
n= A/C-B

n+1이 이익이 나는 지점 -> 이익이 발생하는 판매갯수

음수가되면 이익없으므로 분자A는 불변값이므로 분모C-B가 <=0 이면 -1
(*0이게 되는것도 n 또한 무한대로 손익분기점이 발생하지 않게 된다.*)
--> C-B<=0 --> C<=B


 */

