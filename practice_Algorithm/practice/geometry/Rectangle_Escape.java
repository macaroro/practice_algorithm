package practice_Algorithm.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Rectangle_Escape {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		//x축은 가로, y축은 세로
		
		int x = Integer.parseInt(st.nextToken());//가로
		int y = Integer.parseInt(st.nextToken());//세로
		
		int w = Integer.parseInt(st.nextToken());//직사각형의 가로의 길이
		int h = Integer.parseInt(st.nextToken());//직사각형의 세로의 길이
		
		int min1 = Math.min(x, w-x);
		int min2=Math.min(y, h-y);
		
		int min3=Math.min(min1, min2);
		System.out.println(min3);
		
	}

}
