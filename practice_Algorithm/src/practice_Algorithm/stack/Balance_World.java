package practice_Algorithm.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Balance_World {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			String str = br.readLine();
			if (str.equals(".")) {
				break;
			}

			sb.append(solve(str)).append('\n');

			

		}
		System.out.println(sb);

	}

	public static String solve(String s) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			// 여는 괄호일 경우 스택에 넣는다.
			if (c == '(' || c == '[') {
				stack.push(c);
			}
			// 닫는 소괄호 일 경우
			else if (c == ')') {

				// 스택이 비어있거나 pop할 원소가 소괄호랑 매칭이 안되는 경우(혼자노니 균형x)
				if (stack.empty() || stack.peek() != '(') {
					return "no";
				} else {
					stack.pop();
				}
			}

			else if (c == ']') {

				// 스택이 비어있거나 pop할 원소가 대괄호랑 매칭이 안되는 경우
				if (stack.empty() || stack.peek() != '[') {
					return "no";
				} else {
					stack.pop();
				}
			}

			// 그 외의 경우에는 불필요한 문자들이기에 skip한다.
		}

		if (stack.empty()) {
			return "yes";
		} else {
			return "no";
		}
	}
}
