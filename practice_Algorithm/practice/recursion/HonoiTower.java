package practice_Algorithm.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HonoiTower {
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int num = Integer.parseInt(br.readLine());
		sb.append((int) (Math.pow(2, num) - 1)).append('\n');

		Hanoi(num, 1, 2, 3);
		System.out.println(sb);

	}
	
	/*
	N : 원판의 개수 
	start : 출발지 
	mid : 옮기기 위해 이동해야 장소 
	to : 목적지
 */

public static void Hanoi(int num, int start, int mid, int to) {
	// 이동할 원반의 수가 1개라면==>맨 끝인 3번으로 감
	if (num == 1) {
		sb.append(start + " " + to + "\n");
		return;
	}

	// A -> C로 옮긴다고 가정할 떄,
	// STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
	Hanoi(num - 1, start, to, mid);

	// STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
	sb.append(start + " " + to + "\n");

	// STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
	Hanoi(num - 1, mid, start, to);

}

}
