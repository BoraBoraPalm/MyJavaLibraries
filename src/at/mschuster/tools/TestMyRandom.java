package at.mschuster.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMyRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(RandomGenerator.getInt(0, 10));
		//System.out.println("asdas");
		
		List<Integer> list = new ArrayList<Integer>();
		
//		for(int i = 0; i < 10; i++) {
//			int a = RandomGenerator.getInt(1, 10, false);
//			list.add(a);
//		}
		Collections.sort(list);
		System.out.println("READ NOW");
		for(int number : list) {
			System.out.println(number);
		}


	}

}
