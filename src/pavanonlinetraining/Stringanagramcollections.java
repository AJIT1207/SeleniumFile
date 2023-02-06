package pavanonlinetraining;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Stringanagramcollections {

	public static void main(String[] args) {
		String str1 = "BAT";
		String str2 = "TAB";
		
		str1  = str1.replaceAll("\\s", "").toLowerCase();
		str2  = str2.replaceAll("\\s", "").toLowerCase();
		
		if(anagram(str1,str2))
		{
			System.out.println("both strings " + str1 + " and " + str2 + " are equals");
		}
		else
		{
			System.out.println("both strings are not equals");
		}
	}

	public static boolean anagram(String str1, String str2) {
		
		Map<Character, Integer> map1  = new HashMap<Character, Integer>();
		Map<Character, Integer> map2  = new HashMap<Character, Integer>();
		
		Character ch;
		
		for(int i = 0;i<str1.length();i++)
		{
			ch = str1.charAt(i);
			if(map1.get(ch)==null)
			{
				map1.put(ch, 1);
			}
			else
			{
				map1.put(ch, map1.get(ch)+1);
			}
		}
		
		for(int i = 0;i<str2.length();i++)
		{
			ch = str2.charAt(i);
			if(map2.get(ch)==null)
			{
				map2.put(ch, 1);
			}
			else
			{
				map2.put(ch, map2.get(ch)+1);
			}
		}
		 
		
		return map1.equals(map2);
	}

}
