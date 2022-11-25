package practice_Algorithm.queue_Deque;

import java.io.*;
import java.util.*;

public class Rolling_Queue {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		LinkedList<Integer> deque = new LinkedList<Integer>();

		int count = 0; // 2, 3번 연산 횟수 누적 합 변수

		st = new StringTokenizer(br.readLine(), " ");
		int size = Integer.parseInt(st.nextToken()); // 큐의 크기(1 ~ N)
		int num = Integer.parseInt(st.nextToken()); // 뽑으려는 숫자의 개수

		// 덱에 담아줌(1부터)
		for (int i = 1; i <= size; i++) {
			deque.offer(i);
		}

		int[] seq = new int[num]; // 뽑고자 하는 수를 담은 배열

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < num; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<num;i++) {
			int target = deque.indexOf(seq[i]);//뽑고 싶은 수의 위치 찾기
			int half;//내가 원하는 숫자가 어느쪽을 회전하면 좋을까를 결정(가까운곳 에서 회전)
			
			if(deque.size()%2==0) {
				half = deque.size()/2-1;//만약 사이즈가 짝수면 그 인덱스는 몫보다 하나 적은 위치
			}else {
				half = deque.size()/2;
			}
			
			if(target<=half) {//만약 target이 중간보다 앞에 있으면 2번 연산(첫번째 수를 맨뒤로)
				for(int j=0;j<target;j++) {
					int temp = deque.pollFirst();
					deque.offerLast(temp);
					count++;
				}
			}else {//중간보다 뒤라면 3번째 연산 (맨뒤를 맨 앞으로)
				for(int j=0;j<deque.size()-target;j++) {
					int temp = deque.pollLast();
					deque.offerFirst(temp);
					count++;
				}
			}
			
			deque.pollFirst();	// 연산이 끝나면 맨 앞 원소를 삭제
		}
		
		
		System.out.println(count);

	}

}
