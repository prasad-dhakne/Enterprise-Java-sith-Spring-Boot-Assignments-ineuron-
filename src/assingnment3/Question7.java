package assingnment3;

public class Question7 {
	public static void main(String[] args) {
		String s = "Prasad./,";
		int[] ansArr = vowelAndConsoCount(s);
		System.out.println("Vowels Count is : " + ansArr[0]);
		System.out.println("Consonants Count is : " + ansArr[1]);

	}
	public static int[] vowelAndConsoCount(String s) {
		int[] ans = new int[2];
		String s1 = s.toLowerCase();
		for(int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					ans[0]++;
				}
				else {
					ans[1]++;
				}
			}
		}
		return ans;
	}
}
