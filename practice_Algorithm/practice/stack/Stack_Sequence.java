package practice_Algorithm.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
 
//1847
public class Stack_Sequence {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();	// 출력할 결과물 저장
		
		Stack<Integer> stack = new Stack<>();
		
		int n = Integer.parseInt(br.readLine());
		int[] list = new int[n];//입력된 수를 저장
		boolean b = true;
		int start = 1;
		
		for(int i=0;i<n;i++) {
			list[i] = Integer.parseInt(br.readLine());//list에 저장
		}
		
		for(int i=0;i<list.length;i++) {
			int num = list[i];//배열에 들어온 수랑 비교
			if(num>=start) {//만약 list에 들어온 수와 1부터 시작하는 start와 비교하여 
				            //num이 start보다 크거나 같아면
				while(num>=start) {//배열에 있는 수만큼 start를 ++시켜 스택에 저장
					stack.push(start++);
					sb.append("+").append("\n");
				}
				stack.pop();//그리고 num이 나올수 있도록 pop함
				sb.append("-").append("\n");
				
			}else {//만약 num이 start보다 적다면
				int end = stack.pop();//그 수를 제거하고 end에 저장
				if(end<num) {//하지만 만약 방금 뽑은 수가 들어오는 수 보다 적다면  no 출력(들어왔던 수가 들어올 수는 없으므로)
					System.out.println("NO");
					b = false;
					break;
				}else {
					sb.append("-").append("\n");
				}
				
				
			}
		}
		
		if(b) {
			System.out.println(sb);
		}
		
		
		
	/*	while(N -- > 0) {
			
			int value = Integer.parseInt(br.readLine());
			
			if(value > start) {
				// start + 1부터 입력받은 value 까지 push를 한다.
				for(int i = start + 1; i <= value; i++) {
					stack.push(i);
					sb.append('+').append('\n');	// + 를 저장한다. 
				}
				start = value; 	// 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화 
			}
			
			// top에 있는 원소가 입력받은 값과 같이 않은 경우  
			//peek:Stack의 맨 위에서 개체를 제거하지 않고 반환합니다
			else if(stack.peek() != value) {
				System.out.println("NO");
				return;		// 또는 System.exit(0); 으로 대체해도 됨. 
			}
			
			stack.pop();
			sb.append('-').append('\n');
			
		}
		
		System.out.println(sb);*/
	}
}