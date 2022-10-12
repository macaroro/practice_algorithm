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
			max = Math.max(array[i], max); // ī���� �迭�� ũ�� ���ϱ�
		}
		
		int[] counting_array = new int[max + 1];
		
		for(int i = 0 ; i < array.length ; i++) {
			counting_array[array[i]]++; //  ī���� �迭 ī��Ʈ
		}
		
		for(int i = 1 ; i < counting_array.length ; i++) {
			counting_array[i] += counting_array[i-1]; // ������(����� ���� �迭�� �ε����� �ϴ°� ������
			                                          //1�� ���������̱� ������ -1
		}
		
		for(int i = array.length - 1 ; i >= 0 ; i--) {
			result[--counting_array[array[i]]] = array[i]; // result �迭 �����
		}
		
		for(int i = 0 ; i < N ; i++) {
			bw.write(String.valueOf(result[i]) + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
