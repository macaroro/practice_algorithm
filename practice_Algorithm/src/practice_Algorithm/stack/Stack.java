package practice_Algorithm.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack {

	//stack은 나중에 들어간게 먼저 나옴
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		
		int test_Case = Integer.parseInt(br.readLine());
		
		int[] stack = new int[test_Case];
		int size = 0;
		
		for(int i=0;i<test_Case;i++) {
			st = new StringTokenizer(br.readLine()," ");
			String command = st.nextToken();
			
			if(command.equals("push")) {
				stack[size] = Integer.parseInt(st.nextToken());
				size++;
			}
			if(command.equals("pop")) {
				
				if(size==0) {
					sb.append(-1).append("\n");
				}else {
					int res = stack[size - 1];
					stack[size - 1] = 0;
					size--;
					sb.append(res).append("\n");
				}
				
				
			}
			if(command.equals("size")) {
				sb.append(size).append("\n");
			}
			if(command.equals("empty")) {
				if(size==0) {
					sb.append(1).append("\n");
				}else {
					sb.append(0).append("\n");
				}
			}
			if(command.equals("top")) {
				if(size==0) {
					sb.append(-1).append("\n");
				}else{sb.append(stack[size-1]).append("\n");
				
				}
			}
			
			
		}
		
		System.out.println(sb);

	}

}
