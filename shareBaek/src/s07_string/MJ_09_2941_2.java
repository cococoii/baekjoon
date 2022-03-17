package s07_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MJ_09_2941_2 {
	public static void main(String[] args) throws IOException {
		//배열에 크로아티아 변경인거 하나씩 넣어놓고(6개)
		//입력받는 스트링 검사하기
		//"크로아티아 알파벳을 확인 후 공백을 추가해서 문자 구분" 요게 포인트
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

		String str = br.readLine();
		StringBuffer sb = new StringBuffer();	// 버퍼 사용(원하는 위치의 문자를 변환하기 위함)!!!!
		sb.append(str);//입력받은 문장 넣고
		br.close();

		int count = 0; // 크로아티아 문자의 갯수 세는 int변수선언

		for(int i=0; i<arr.length; i++) {
			int idx = sb.indexOf(arr[i]);  // 크파벳이 포함된 문자열 시작 위치

			while(idx != -1) {  // 크파벳이 존재하는 동안 /존재안하면 -1반환하니까
				count++;	// 문자 갯수 count
				int idx2 = idx + arr[i].length();  // 사용된 크파벳의 끝 위치
				sb.replace(idx, idx2, "0");  // 크파벳을 임의의 문자 "0"으로 변환 //*시작위치부터 끝 위치를 0으로 변환
				//StringBuffer에서 replace는!
				/*
				 * StringBuffer 클래스의 replace 멤버 메서드는 특정 구간의 내용을 원하는 내용으로 대체할 때 사용합니다. 
				 * 그리고 내용의 순서를 뒤집을 때 reverse 멤버 메서드를 사용합니다.
				 * 대박신기
				 */

				idx = sb.indexOf(arr[i]);  // 같은 크파벳이 사용된 위치가 있는지 다시검색
			}
		}

		for(int i=0; i<sb.length(); i++) {
			if(sb.charAt(i) != '0')
				count++;	// 문자 갯수 count
		}

		System.out.println(count);
	}
}
