package s11_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SY01_2798 {
	//5 21
	//5 6 7 8 9
	public static StringBuilder sb = new StringBuilder();

	public static void pick(ArrayList<Integer> array, ArrayList<Integer> picked, int toPick,int m){
		//array : 받는 array -> ex . 5,6,7,8,9
		//picked: 지금까지 고른 원소들 집합
		//toPick: 더 고를 원소의 수 일 때, 앞으로 toPick개의 원소를 고르는
		//모든 방법을 출력
		//m: m을 넘지 않으면서 m에 최대한 가까운 카드 3장 출력
		int sum =0;

		if(toPick ==0){
			for(int i=0;i<3;i++){
				sum += picked.get(i);
			}
			//System.out.println(sum);

			if(sum==m){
				sb.append(sum +" "); //sb에 sum에 값 저장해서
			}else if(sum<m){
				sb.append(sum +" ");
			}
			return; //함수 종료
		}

		//고를 수 있는 가장 작은 번호
		int index = picked.isEmpty()? 0: array.indexOf(picked.get(picked.size()-1))+1;//마지막 요소 +1
		//System.out.println("index:"+index);

		for(int i=index;i<array.size();i++){ //5
			//System.out.println("루프 시작");
			picked.add(array.get(i));

			//System.out.println("뽑아야할 toPick"+(toPick-1));
			/*for (int j=0;j<picked.size();j++){
            System.out.println("picked "+j+": "+picked.get(j));
        }*/
			pick(array,picked,toPick-1,m);
			//System.out.println("삭제");
			picked.remove(picked.size() -1);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine()," ");

		ArrayList<Integer> array = new ArrayList<>();
		for(int i=0;i<N;i++){
			int number = Integer.parseInt(st.nextToken());
			array.add(number);
		}
		ArrayList<Integer> picked = new ArrayList<>();
		pick(array,picked,3,M);

		st = new StringTokenizer(sb.toString()," "); //저장된 sb를 " "로 받아들이기
		int sum =0;
		int min = M;//min은 M-sum을 뺀 값 중 가장 작은 값 저장
		while (st.hasMoreTokens()){
			int num = Integer.parseInt(st.nextToken());
			if(num==M){
				sum = num;
				break;
			}else if(num<M && min>M-num){//절대값이 최소값보다 작을 경우 변경 && M을 넘지 않는 수라고 하였으므로
				min = M-num;
				sum =num;
			}
		}
		System.out.println(sum);
	}

}
