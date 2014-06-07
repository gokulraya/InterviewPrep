import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;


public class linkedhashmap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Character,Integer> lh=new LinkedHashMap<Character,Integer>();
		lh.put('G', 1);
		lh.put('o', 2);
		lh.put('k', 3);
		lh.put('u', 4);
		lh.put('l', 5);
		System.out.println(lh);
		
		HashMap<Character,Integer> lh1=new HashMap<Character,Integer>();
		lh1.put('G', 1);
		lh1.put('o', 2);
		lh1.put('k', 3);
		lh1.put('u', 4);
		lh1.put('l', 5);
		System.out.println(lh1);

	}

}
