package assingnment3;

public class Question1 {
	public static void main(String[] args) {
		String  s = "iNeuron";
		System.out.println(reverseString(s));
	}
	public static String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = s.length()-1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}

