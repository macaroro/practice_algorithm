package practice_Algorithm.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taxicap_Geometry {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		double r =Integer.parseInt(br.readLine());
		
		System.out.println(r*r*Math.PI);//��Ŭ���� ���������� ���ϴ� ���� ����
		System.out.println(r*r*2);//�ý� ���������� ���ϴ� ���� ����


	}

}
