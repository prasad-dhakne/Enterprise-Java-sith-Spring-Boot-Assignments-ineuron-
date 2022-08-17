package assingnment3;

import java.util.*;

public class Question5 {
	public static void main(String[] args) {
		String s = "Ahmemmmmednagar";
		System.out.println(repeatedChars(s));
	}

	private static ArrayList<Character> repeatedChars(String s) {
		ArrayList<Character> ans = new ArrayList<>();
		char[] chArr = s.toCharArray();
		Arrays.sort(chArr);
		char initialChar = chArr[0];
		for(int i = 1; i < chArr.length; i++) {
			if(chArr[i] == initialChar) {
				if(!ans.contains(initialChar)) {	
					ans.add(initialChar);
				}
			}
			else if(chArr[i] > initialChar) {
				initialChar = chArr[i];
			}
		}

		return ans;
	}
}
