package assingnment3;

import java.util.Arrays;

public class Question4 {
	public static void main(String[] args) {
		String s = "A quick brown fox jumps over the lazy.?/#$245 dog";
		System.out.println(isPangram(s));
	}
	public static boolean isPangram(String s) {
		StringBuilder sb = new StringBuilder();
		sb.append(s.replace(" ", "").toLowerCase());
		char[] chArr = sb.toString().toCharArray();
		Arrays.sort(chArr);
		//System.out.println(Arrays.toString(chArr));
		char initialChar = 'a';
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] == initialChar) {
				initialChar+=1;
			}
			else if(chArr[i] > initialChar) {
				return false;
			}
		}
		if(--initialChar == 'z') {
			return true;
		}
		return false;
	}
}
