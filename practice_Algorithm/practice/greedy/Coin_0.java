package practice_Algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin_0 {

	//�׸��� �˰���:������ �������� ���� ���տ� ���̴� ������ ��Ȳ���� �Ѿ� �������� �ش信 �����ϴ� ����̴�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int coin = Integer.parseInt(st.nextToken());
		int price = Integer.parseInt(st.nextToken());
		
		int[] list = new int[coin];
		for(int i=0;i<coin;i++) {
			list[i]= Integer.parseInt(br.readLine());
		}


		int count=0;
		//�迭�� 0���� �����ϴ� i�� coin-1
		for(int i=coin-1;i>=0;i--) {
			if(list[i]<=price) {//������ ���ݺ��� �Ʒ��� ������ ������
				count +=(price/list[i]);//������ ������ ������������ �ǹǷ� �� �ڿ��� ���� ������ ŭ
				                        //�ڿ��� ���� ���� ó���� �ɸ� ���� ���� ŭ
				                        //���� ū �������� ���� ���� Ƚ���� �ְ� �� �������� �ٽ� price��
				price=price%list[i];
			}
		}
		

		System.out.println(count);
		
	}

}
