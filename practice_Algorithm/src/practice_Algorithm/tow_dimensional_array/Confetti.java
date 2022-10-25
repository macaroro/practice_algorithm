package practice_Algorithm.tow_dimensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Confetti {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int area = 0;  //���� ������ ���� �� boolean �迭�� true�� ����
        
        
        int confetti = Integer.parseInt(br.readLine());  //������ ����
        boolean[][] arr = new boolean[101][101];  //��ȭ��
        
        
        for (int i = 0; i < confetti; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());//������ ��ġ ��ǥ
            int y = Integer.parseInt(st.nextToken());
            //(x,y)���� (x+9, y+9)������ ������ �ϳ��� üũ�� �� �� ���̿� �����ش�
            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    if (!arr[j][k]) {//�� ������ true�� �ƴ� ��� true�� �ٲ��ְ� area++
                        arr[j][k] = true;
                        area++;
                    }
                }
            }
        }
        System.out.print(area);
    }

}
