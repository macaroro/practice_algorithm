package practice_Algorithm.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Mod {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> list = new ArrayList<>();
		
		List<Integer> list2 = new ArrayList<>();
		
		for (int i = 1; i <=10; i++) {
			int num = Integer.parseInt(br.readLine());
			list.add(num%42);
		}
		
		for(int item : list){
            if(!list2.contains(item))
                list2.add(item);
        }

		System.out.println(list2.size());
	}

}
