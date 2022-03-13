package s08_Math_dw;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DW10_1316_그룹단어체커 {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int count = 0 ; // 그룹단어 개수
		
		for(int i=0; i<input; i++) {
			String str = br.readLine();			//단어 입력
			boolean arr[] = new boolean[26];	//알파벳 사용내역 확인배열 (boolean타입의 배열은 default="false")
			boolean check = true;				//그룹단어이면 check=true
			
			for(int j=0; j<str.length(); j++) {
				int index = str.charAt(j)-'a';	//비교주체문자의 배열index = index
				
				//이전에 사용한적이 있는 문자라면
				if(arr[index]) {	//=true : str에 해당 index의 알파벳이 존재한다면
					if(str.charAt(j)!=str.charAt(j-1)) {	//이전 문자와 연속되지 않는다면
						check=false;						//그룹단어가 아님
						break;
					}
					
				//이전에 사용한적 없는 문자라면	
				}else {	
					arr[index]=true;	//문자사용 체크	
										//check는 건드리지 않았음(기본default가 true로 설정되어있음)
				}		
			}
			if(check) count++;
		}
		System.out.println(count);
	}
}