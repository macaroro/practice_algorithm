package practice_Algorithm.queue_dex;

import java.util.*;
import java.io.*;
public class Router {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        
        int size = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) break;//입력의 끝
            
            if (num == 0) {
            	queue.remove();
            } else if (size > queue.size()) {
            	queue.add(num);
            }
        }
        if (queue.isEmpty()) {
            System.out.print("empty");
        } else {
            for (int i : queue) {
                sb.append(i + " ");
            }
            System.out.print(sb);
        }
    }
}
