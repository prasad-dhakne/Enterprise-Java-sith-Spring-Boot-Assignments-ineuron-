package assingnment3;

public class Question2 {
	public static void main(String[] args) {
		String  s = "Think Twice";
		System.out.println(reverseWordsOfString(s));
	}
	public static String reverseWordsOfString(String s) {
		String[] strArr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < strArr.length; i++) {
			sb.append(reverseString(strArr[i]));
			sb.append(" ");
		}
		return sb.toString().trim();
	}
	public static String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = s.length()-1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}
