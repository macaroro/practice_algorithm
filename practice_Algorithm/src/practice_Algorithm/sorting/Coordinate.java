package practice_Algorithm.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import java.util.StringTokenizer;

public class Coordinate {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		 
		int test_case = Integer.parseInt(br.readLine());
		
		int[][] list = new int[test_case][2];
		for(int i = 0;i<test_case;i++) {
			st = new StringTokenizer(br.readLine()," ");
		    list[i][0] = Integer.parseInt(st.nextToken());
		    list[i][1] = Integer.parseInt(st.nextToken());
			
		}
		
		Arrays.sort(list, (o1, o2) -> {
            if(o1[0] == o2[0]){ //�迭�� ù��° ��Ұ� ���ٸ�
                return Integer.compare(o1[1], o2[1]); //�ι�° ��ҵ��� ���ؼ� ������������ ����
            }
            else {
                return Integer.compare(o1[0],o2[0]); //��ҿ��� ù��° ��Ҹ� �������� �������� ����
            }
        });
	
		for(int i = 0 ; i< test_case ; i++) {
			System.out.println(list[i][0] + " " + list[i][1]);
		}
		
		
		
		

	}

}
