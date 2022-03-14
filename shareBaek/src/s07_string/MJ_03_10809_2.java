package s07_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MJ_03_10809_2 { //구글 답지 28라인 이해 못함
	public static void main(String[] args) throws IOException{
	//String S = 소문자	
	//총 알파벳 수 = 26개
	//알파벳 오름차순으로 구하는법?
	//S.length만큼 루프돌면서 equals로 비교
	//아스키코드는 1씩 증가하니까 아스키코드->문자로 변환해서 비교?
	//A=65, a=97 ~ 122 
	//포함되어있는지 검색하는 메서드 있던거같은데 => S.indexOf(검색할문자) 못찾으면-1반환
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int [26];//* 먼저 int 형 배열을 하나 생성하여 모두 -1 로 초기화 시킨다
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		String S = br.readLine();
		
		for(int i=0;i<S.length();i++) {
			char ch = S.charAt(i);
			
			if(arr[ch-'a']==-1) {
				arr[ch-'a']=i;
			}
		}
		
		for(int val: arr) {
			System.out.print(val+" ");
		}
		
	}
}
