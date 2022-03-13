package s07_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DW_s10_1316_그룹단어체커 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		
		
		//정상 출력은 되지만, 틀린문제 ㅠ
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int count = 0;
		boolean check = true;

		for(int b=0; b<input; b++) {	//입력받은 단어의 개수만큼 for루프
			String str = br.readLine();	//단어 입력받기

			//(1)단어의 길이가 1이거나 2일때 
			if(str.length()==1 || str.length()==2) {	
				count++;}		// 그룹단어체커 수 +1
				
			//(2)단어의 길이가 3일 때	
			else if(str.length()==3){					
				if(!(str.charAt(0)==str.charAt(2)&&str.charAt(0)!=str.charAt(1))) {		
					count++;	//	index(0)과 index(2)가 동일하고, index(0)과 index(1)이 다르면 그룸단어아님
								//	이외의 경우에는 모두 conunt++
				}
				
			//(3)단어의 길이가 4이상일 때	
			}else {	
				for(int i=0; i<str.length(); i++) {		//비교하는 index 주체=i
					for(int j=i+2; j<str.length(); j++) {	//비교대상 index = j

						if(str.charAt(i)==str.charAt(j)) {
							check=false;	//index+2한 문자와 동일하다면 ->그룸단어아님 (false)
						}	
					}
				}if(check==true) count++;
			}
		}
		System.out.println(count);
	}
}
