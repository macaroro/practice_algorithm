package practice_Algorithm.queue_Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class AC {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		StringTokenizer st;

		int test_Case = Integer.parseInt(br.readLine());

		ArrayDeque<Integer> deque;
		while (test_Case-- > 0) {

			String command = br.readLine(); // �������� p�� �ش��ϴ� ��ɾ�
			int n = Integer.parseInt(br.readLine());

			st = new StringTokenizer(br.readLine(), "[],");

			deque = new ArrayDeque<Integer>();

			// ���� �迭 ���Ҹ� �־��ش�.
			for (int i = 0; i < n; i++) {
				deque.add(Integer.parseInt(st.nextToken()));
			}

			AC(command, deque);
		}

		System.out.println(sb);

	}

	public static void AC(String command, ArrayDeque<Integer> deque) {

		boolean isRight = true;

		for (char cmd : command.toCharArray()) {

			if (cmd == 'R') {
				isRight = !isRight; // ������ �ٲ��ش�.
				continue;
			}

			// �Ʒ��� D�� ���

			// D �Լ��̸鼭 isRight�� true �� ���
			if (isRight) {

				// ���� ��ȯ �� ���Ұ� ���� ��� error�� ����ϵ��� �ϰ� �Լ� ����
				if (deque.pollFirst() == null) {
					sb.append("error\n");
					return;
				}

			} else {
				// ���� ��ȯ �� ���Ұ� ���� ��� error�� ����ϵ��� �ϰ� �Լ� ����
				if (deque.pollLast() == null) {
					sb.append("error\n");
					return;
				}
			}
		}

		// ��� �Լ����� ���������� �۵��ߴٸ� ���� ���� ��ҵ��� ��¹����� ������ش�.
		makePrintString(deque, isRight);

	}

	public static void makePrintString(ArrayDeque<Integer> deque, boolean isRight) {

		sb.append('['); // ���� ���ȣ ���� StringBuilder�� ����

		if (deque.size() > 0) { // ���� ��� �� ���Ұ� �� �� �̻��� ���

			if (isRight) { // �������ϰ��

				sb.append(deque.pollFirst()); // ���� ù ��° ���Ҹ� �Ѱ��ش�.

				// �� ���� ���Һ��� ������ ���� �Ѱ��� �� ���� ���Ҹ� �ϳ��� �̾� �ѱ��.
				while (!deque.isEmpty()) {
					sb.append(',').append(deque.pollFirst());
				}
			} else { // �������ϰ��
				sb.append(deque.pollLast()); // ���� �ڿ������� ù ��° ���Ҹ� �Ѱ��ش�.

				// �� ���� ���Һ��� ������ ���� �Ѱ��� �� ���� ���Ҹ� �ڿ������� �ϳ��� �̾� �ѱ��.
				while (!deque.isEmpty()) {
					sb.append(',').append(deque.pollLast());
				}
			}
		}

		sb.append(']').append('\n'); // �ݴ� ���ȣ �� �������� ������
	}

}
