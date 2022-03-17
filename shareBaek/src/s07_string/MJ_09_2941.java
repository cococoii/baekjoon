package s07_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MJ_09_2941 {
	public static void main(String[] args) throws IOException { //실패
		//배열에 크로아티아 변경인거 하나씩 넣어놓고(6개)
		//입력받는 스트링 검사하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		//ljes=njak
		String[] arr = new String[8];
			arr[0] = "c=";
			arr[1] = "c-";
			arr[2] = "dz=";
			arr[3] = "d-";
			arr[4] = "lj";
			arr[5] = "nj";
			arr[6] = "s=";
			arr[7] = "z=";
			
		String T = br.readLine();
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != null) {
				if(T.indexOf(arr[i]) != -1){ //값이 없을 떄 -1반환
					arr[i]=" ";
					count++;
				}
			}
		}
			System.out.println(count);
			
		}
	}
