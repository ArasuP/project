package org.agrichain.com;

import java.util.HashSet;
import java.util.Set;

public class Program1 {

	public static void main(String[] args) {
		String s1="abcabcbb";
		String s2="bbbbb";
		for(String s:new String[]{s1,s2}) {
			Set<Character> set=new HashSet<>();
			int max=0;
			int j=0;
			int i=0;
			while(i<s.length()) {
				if(!set.contains(s.charAt(i))) {
					set.add(s.charAt(i++));
					max=Math.max(max, i-j);
				}
				else {
					set.remove(s.charAt(j++));
				}
			}
			
			System.out.println("Input:" + s +  "Length:" + max );
		}
	}
}

