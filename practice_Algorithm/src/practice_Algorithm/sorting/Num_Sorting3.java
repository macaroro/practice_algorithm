package practice_Algorithm.sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Num_Sorting3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int max = 0;
		int[] array = new int[N];
		int[] result = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			array[i] = Integer.parseInt(br.readLine());
			max = Math.max(array[i], max); // 카운팅 배열의 크기 구하기
		}
		
		int[] counting_array = new int[max + 1];
		
		for(int i = 0 ; i < array.length ; i++) {
			counting_array[array[i]]++; //  카운팅 배열 카운트
		}
		
		for(int i = 1 ; i < counting_array.length ; i++) {
			counting_array[i] += counting_array[i-1]; // 누적합(결과가 나올 배열의 인덱스를 하는것 하지만
			                                          //1씩 더해진것이기 때문에 -1
		}
		
		for(int i = array.length - 1 ; i >= 0 ; i--) {
			result[--counting_array[array[i]]] = array[i]; // result 배열 만들기
		}
		
		for(int i = 0 ; i < N ; i++) {
			bw.write(String.valueOf(result[i]) + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
