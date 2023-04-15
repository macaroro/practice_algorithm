package practice_Algorithm.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//17298
public class Okunsoo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		int[] list = new int[num];//숫자들을 넣을 배열
		int[] an = new int[num];//정답을 넣을 배열
		Stack<Integer> stack = new Stack<>();//인덱스를 저장
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<num;i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		stack.push(0);//스택이 비어있으므로 일단 0을 넣어줌(배열 인덱스 0)		
		for(int i=1;i<num;i++) {
			while(!stack.isEmpty()&&list[stack.peek()]<list[i]) {//스택이 비어 있지 않고 숫자를 넣은 배열에서 스택에 가장 위에 있는 숫자와 그 다음 인덱스의 값을 비교하여 
				                                                 //작다면 정답을 넣는 배열에 list[i]값을 넣어줌
				an[stack.pop()]=list[i];
			}
			stack.push(i);//while문이 끝나면 i를 넣어줌
		}
		
		while(!stack.empty()) {//위에 for문이 끝나고 아직 스택에 값이 남아있다면 다 빼고
			                   //뺀 그 값을 인덱스로 정답 배열에 -1을 저장
			an[stack.pop()]=-1;
		}
		
		for(int n: an) {//정답배열을 출력
			sb.append(n).append(" ");
		}
		System.out.println(sb);
		

	}

}
