package s07_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//첫(i)번째 인덱스값이랑 두(i+1)번째 인덱스 값을 비교해서 
/* #2 메서드생성
 * 0.26개의 알파벳넣을 불린형 배열생성,기본이false임 //*
 * 0.연속되는지 아닌지 판별하는 변수 생성 //*
 * 0.일단 i번째 문자를 변수에 저장 //*
 * 1. 같을 때=>계속반복문실행 2.같지않을 떄=>조건체크
 * 2-1.그 문자가 처음나오는 건지=>다음턴 
 * 2-2.이미나온적이 있는건지=>그룹단어탈락
 * #1 메인실행(반복문)
 */
public class MJ_10_1316 {
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
//	#1.메인실행
	public static void main(String[] args)throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			if(check()==true) {
				count++;
			}
		}
		System.out.println(count);
	}
//	#2.불린메서드실행
	public static boolean check() throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] check = new boolean[26]; //기본값false
		int side = 0;
		String S = br.readLine();
		
		for(int i=0;i<S.length();i++) {
			int now = S.charAt(i); //i번째의 문자
			//1)i번째 문자와 side문자가 같지않으면?
			if(now!=side) {
				//1)-1.근데 그문자가 처음나온것이라면 
				if(check[now-'a'] == false) {
					//true로 바꿔준다.다음에 구분해야하니까
					check[now-'a'] = true;
					side=now; //다음 순서를위해 side를 바꾼다.side가 계속 기준이 되는것임
				//1)-2.근데 그문자가 처음나온게 아니라면
				}else {
					return false; //함수종료 그룹단어아님
				}
				
			//2)i번째 문자와 side문자가 같으면?	
			}else {
				continue;//계속 루프실행
			}
		}
		
		return true;
	}
	
	
}
