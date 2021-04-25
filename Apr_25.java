package daily.coding.practice;

import java.util.HashMap;
import java.util.Map;

public class Apr_25 {
	public static void main(String arg[]){
		String s="We promptly judged antique ivory buckles for the next prize";
		String tmp=s.toLowerCase();
		System.out.println(tmp);
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<tmp.length();i++){
			if(tmp.charAt(i)!=' ' && !map.containsKey(tmp.charAt(i))){
				map.put(tmp.charAt(i),1);;
			}
		}
		System.out.println(map.size());
	}
}
