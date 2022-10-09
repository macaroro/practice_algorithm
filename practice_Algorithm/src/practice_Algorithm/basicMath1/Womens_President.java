package practice_Algorithm.basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Womens_President {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        int[][] arr = new int[15][15];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 14; i++) {
            arr[0][i] = i;  //0층 i호에는 무조건 i명이 산다
        }

        
        for (int i = 1; i <= 14; i++) {
            for (int j = 1; j <= 14; j++) {
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
        }
        for (int i = 0; i < test_case; i++) {
            int floor = Integer.parseInt(br.readLine());
            int ho = Integer.parseInt(br.readLine());
            sb.append(arr[floor ][ho] + "\n");  //k층 n호에 있는 사람 수 출력
        } 
        System.out.print(sb);

}
	}

