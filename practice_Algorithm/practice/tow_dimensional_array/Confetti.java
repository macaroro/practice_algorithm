package practice_Algorithm.tow_dimensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Confetti {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int area = 0;  //검은 영역의 넓이 즉 boolean 배열의 true의 개수
        
        
        int confetti = Integer.parseInt(br.readLine());  //색종이 개수
        boolean[][] arr = new boolean[101][101];  //도화지
        
        
        for (int i = 0; i < confetti; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());//색종이 위치 좌표
            int y = Integer.parseInt(st.nextToken());
            //(x,y)부터 (x+9, y+9)까지의 영역을 하나씩 체크한 후 총 넓이에 더해준다
            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    if (!arr[j][k]) {//그 영역에 true가 아닐 경우 true로 바꿔주고 area++
                        arr[j][k] = true;
                        area++;
                    }
                }
            }
        }
        System.out.print(area);
    }

}
