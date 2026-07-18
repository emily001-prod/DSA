package moduleone.learnthebasics.hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestOccuringElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,2,3,4,1,2,2,5,6,7,1};
		func(a);
	}
	
	public static void func(int a[]) {
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i:a) {
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		
		int maxFreq=0;
		int ele=0;
		
		for(Map.Entry<Integer,Integer>entry:hm.entrySet()) {
			int element=entry.getKey();
			int count=entry.getValue();
			
			if(count>maxFreq) {
				maxFreq=count;
				ele=element;
			}
			
		}
		
		System.out.println("Highest occurring element = " + ele);
        System.out.println("Frequency = " + maxFreq);
		
	}

}
