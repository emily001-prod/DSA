package moduleone.learnthebasics.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,2,3,4,5};
		func(a);
		
	}
	public static void func(int a[]) {
	    HashMap<Integer, Integer> hm = new HashMap<>();

	    for (int i : a) {
	        hm.put(i, hm.getOrDefault(i, 0) + 1);
	    }
	    
	    for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

	}

}
