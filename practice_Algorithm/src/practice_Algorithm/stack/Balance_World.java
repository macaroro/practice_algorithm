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

			// ���� ��ȣ�� ��� ���ÿ� �ִ´�.
			if (c == '(' || c == '[') {
				stack.push(c);
			}
			// �ݴ� �Ұ�ȣ �� ���
			else if (c == ')') {

				// ������ ����ְų� pop�� ���Ұ� �Ұ�ȣ�� ��Ī�� �ȵǴ� ���(ȥ�ڳ�� ����x)
				if (stack.empty() || stack.peek() != '(') {
					return "no";
				} else {
					stack.pop();
				}
			}

			else if (c == ']') {

				// ������ ����ְų� pop�� ���Ұ� ���ȣ�� ��Ī�� �ȵǴ� ���
				if (stack.empty() || stack.peek() != '[') {
					return "no";
				} else {
					stack.pop();
				}
			}

			// �� ���� ��쿡�� ���ʿ��� ���ڵ��̱⿡ skip�Ѵ�.
		}

		if (stack.empty()) {
			return "yes";
		} else {
			return "no";
		}
	}
}
