package assingnment3;

import java.util.Arrays;

public class Question6 {
	public static void main(String[] args) {
		String s = "iNeron";
		System.out.println(sortString(s));
	}

	private static String sortString(String s) {
		char[] chArr = s.toLowerCase().toCharArray();
		Arrays.sort(chArr);
		StringBuilder ans = new StringBuilder();
		for(char x : chArr) {
			ans.append(x);
		}
		return ans.toString();
	}
}
