package study_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//좀더 볼 필요 있음
public class Backjoon_1253 {
	
	 static int N;//수의 개수
	 static long[] arr;//수를 담아놓을 배열

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        int goodNumCount = 0;
        for (int i = 0; i < N; i++) {
            if(isGoodNum(i))
                goodNumCount++;
        }
        System.out.println(goodNumCount);
        br.close();
    }

	//좋은 수를 찾기위한 함수
    public static boolean isGoodNum(int index) {
        long find = arr[index];
        int start = 0;
        int end = N-1;
        while (start < end) {
            long sum = arr[start] + arr[end];
            if (start == index) {
                start++;
                continue;
            }
            if (end == index) {
                end--;
                continue;
            }

            if (find == sum) {
                return true;
            } else if (find < sum) {
                end--;
            } else if (find > sum) {
                start++;
            }
        }
        return false;
    }

	}


