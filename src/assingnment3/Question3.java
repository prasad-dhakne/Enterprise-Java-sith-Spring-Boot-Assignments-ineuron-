package assingnment3;

import java.util.Arrays;

public class Question3 {
	public static void main(String[] args) {
		String s1 = "secure";
		String s2 = "rescue";
		System.out.println(isAnagram(s1, s2));
	}
	public static boolean isAnagram(String s1, String s2) {
		char[] chArr1 = s1.toCharArray();
		char[] chArr2 = s2.toCharArray();
		Arrays.sort(chArr1);
		Arrays.sort(chArr2);
		if(Arrays.toString(chArr1).equals(Arrays.toString(chArr2))) {
			return true;
		}
		return false;
	}
}
