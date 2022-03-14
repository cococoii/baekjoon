package s07_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MJ_05_1157_2 {
	public static void main(String[] args) throws IOException{
		//알파벳 26개
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();
		S = S.toUpperCase();
		int[] arr = new int[26];
		
		for(int i=0;i<S.length();i++) {
			if('a'<=S.charAt(i) && S.charAt(i) <= 'z') {
				arr[S.charAt(i)-97]++;
//				arr[S.charAt(i)-'a']++;
			}else {
				arr[S.charAt(i)-65]++;
//				arr[S.charAt(i)-'A']++;
			}
			//대문자아스키코드: 65~90 / 소문자아스키코드: 97~122
			//대문자A(65)를 입력받으면 arr의 인덱스값0는 65-x = 0, x=65
			//대문자C(67)를 입력받으면 arr의 인덱스값2는 67-x = 2, x=65
			//x값 65를 빼주면 arr의 인덱스값을 알 수 있어서 해당인덱스값을 1++해서 카운트가능
		}
		
		//S의 값을 모두 검사 후 카운트 했고
		//가장 큰값의 인덱스의 문자 출력(큰값이 여러개면 ?출력)
		int max=-1; //보통 관행상 음수로 표기
		char ch='?';
		
		for(int i=0;i<26;i++) {
			//배열의 값이 max보다 크면 그값이 max
			if(arr[i]>max) {
				max=arr[i];
				ch = (char)(i+65); //값-65해서 인덱스를 구했으니 역으로 인덱스+65
			}else if(arr[i]==max) {
				ch='?';
			}
		}
		
		System.out.println(ch);
	}
}
