package practice_Algorithm.queue_Deque;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
//queue는 먼저 들어온것이 먼저 나감
public class Queue2 {
 
	static int[] queue = new int[2000000];	// 명령의 수는 2,000,000을 안넘음 
	
	static int size = 0;	
	static int front = 0;
	static int back = 0;
	
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st;
		int test_Case = Integer.parseInt(br.readLine());
		
 
		while(test_Case-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()){
			case "push": push(Integer.parseInt(st.nextToken())); break;
			case "pop" : pop(); break;
			case "size" : size(); break;
			case "empty" : empty(); break;
			case "front" : front(); break;
			case "back" : back(); break;
			
			}
		}
		System.out.println(sb);
	}
	
	static void push(int n) {
		queue[back] = n;//back은 맨 마지막에 들어온 수를 나타냄
		back++;
		size++;
	}
	
	static void pop() {
		if(size == 0) {
			sb.append(-1).append('\n');
		}
		else {
			sb.append(queue[front]).append('\n');	// 맨 앞의 원소를 출력 
			size--;
			front++;	// front가 가리키는 위치 1 증가 (앞부분이 나가니 다음 나갈건 그 다음)
		}
	}
	
	static void size() {
		sb.append(size).append('\n');
	}
	
	static void empty() {
		if(size == 0) {
			sb.append(1).append('\n');
		}
		else sb.append(0).append('\n');
	}
	
	static void front() {
		if(size == 0) { 
			sb.append(-1).append('\n');
		}
		else {
			sb.append(queue[front]).append('\n');	 // 맨 앞의 원소 출력 
		}
	}
	
	static void back() {
		if(size == 0) {
			sb.append(-1).append('\n');
		}
		else {
			sb.append(queue[back - 1]).append('\n');	// 맨 뒤의 원소 출력 
		}
	}
 
}
