package practice_Algorithm.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taxicap_Geometry {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		double r =Integer.parseInt(br.readLine());
		
		System.out.println(r*r*Math.PI);//유클리드 기하학으로 구하는 원의 넓이
		System.out.println(r*r*2);//택시 기하학으로 구하는 원의 넓이


	}

}
