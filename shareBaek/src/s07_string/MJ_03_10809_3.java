package s07_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MJ_03_10809_3 { 
	public static void main(String[] args) throws IOException{
	//String S = 소문자	
	//총 알파벳 수 = 26개
	//알파벳 오름차순으로 되는지?
	//S.length만큼 루프돌면서 equals로 비교
	//아스키코드는 1씩 증가하니까 아스키코드->문자로 변환해서 비교?
	//A=65, a=97 ~ 122 
	//포함되어있는지 검색하는 메서드 있던거같은데 => S.indexOf(검색할문자) 못찾으면-1반환
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();

		for(int i='a';i<='z';i++) {
			System.out.print(S.indexOf(i)+" ");
		}
	}
}
