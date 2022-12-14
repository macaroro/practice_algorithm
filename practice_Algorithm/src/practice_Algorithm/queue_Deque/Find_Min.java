package practice_Algorithm.queue_Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;



public class Find_Min {

	//11003
	//덱은  양쪽 끝에서 삽입과 삭제가 모두 가능한 자료 구조의 한 형태
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb  = new StringBuilder();
		
		int num = Integer.parseInt(st.nextToken());//숫자들의 개수
		int sliceSize = Integer.parseInt(st.nextToken());//슬라이싱 크기
		
		Deque<Node> de = new LinkedList<>();//덱 선언
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i =0;i<num;i++) {
			int now = Integer.parseInt(st.nextToken());//들어갈 숫자들을 비교
			
			//만약 덱이 비어 있지 않고 덱의 마지막 값이 지금 들어온것 보다 크다면 
			//덱에 마지막에 있는것을 지움
			while(!de.isEmpty()&&de.getLast().value>now) {
				de.removeLast();
			}
			
			de.addLast(new Node(now,i));//덱에 값과 인덱스 저장
			
			if(de.getFirst().index<=i-sliceSize) {
				de.removeFirst();
			}//만약 덱에 인덱스가 마지막에 있는 인덱스와 크기가 3초과라면 
			//앞에것을 없앰
			sb.append(de.getFirst().value).append(" ");
			//제일 앞에 있는 것이 최솟값 이므로 맨 앞의 값을 저장
		}
		
		System.out.println(sb);
		

	}
	
	static class Node{//deque에 저장될 형식 지정
		public int value;
		public int index;
		
		Node(int value, int index){
			this.index = index;
			this.value = value;
		}
		
	}

}
