package assingnment3;

public class Question8 {
	public static void main(String[] args) {
		String s = "Prasad./,32";
		System.out.println("Special Character Count is : " + specialCharCount(s));
	}

	private static int specialCharCount(String s) {
		int count = 0;
		String s1 = s.toLowerCase();
		for(int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				continue;
			}
			else if(ch >= '0' && ch <= '9') {
				continue;
			}
			else {
				count++;
			}
		}
		return count;
	}

}
