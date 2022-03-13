package s06_function;

public class MJ_02_4673 {
	public static void main(String[] args) {
		//1~10000 중 생성자 없는 숫자를 출력
		//*boolean배열
		//그냥 10000짜리 배열 하나 생성해서 각 숫자에 대한 셀프넘버를 구하며 일치하는 인덱스를 체크하고
		//마지막엔 다시 반복문을 돌려 배열에 체크가 안된 인덱스만 골라 출력해주면 끝.

		//* boolean type의 기본값은 false이기 때문에 
		//셀프 넘버가 아닌 항목을 true로 체크하고, 체크되지 않은(false) 항목을 출력.
		
		boolean [] array = new boolean[10001];
		
		for(int i=1;i<10001;i++) {
			int n = self(i);
			
			if(n<10001) {
				array[n] = true; // boolean type의 기본값은 false
			}
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<10001;i++) {
			if(array[i]==false) {
//				System.out.println(i);
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
		
	}
	public static int self(int n) {
		int sum = n;
		
		while(n!=0) {
			sum = sum+(n%10);//첫째자리수
			n = n/10;//10을 나눠서 첫째자리수 날린다.
			//123%10 => 1.2.(3)
			//123/10 => 12(3)
			//0이 될 때까지 반복
		}
		
		return sum; //생성자가 있는 수 
	}
	
}
