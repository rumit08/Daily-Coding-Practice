package daily.coding.practice;

import java.util.regex.Pattern;

public class Apr_24 {
	public static void main(String arg[]){
		String s="#HackerRank";
		int n=s.length();
		int count=0;
        if(Pattern.matches("[^a-z]+", s)) count++;
        if(Pattern.matches("[^A-Z]+", s)) count++;
        if(Pattern.matches("[^0-9]+", s)) count++;
        if(Pattern.matches("[^!@#$%^&*()+-]+", s)) count++;
        if(n>=6)
        	System.out.println(count);
        else{
            int tmp=6-(n+count);
            if(tmp>0) System.out.println(count+tmp);
            else System.out.println(count); 
        }
		
	}
}
