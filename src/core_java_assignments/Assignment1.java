package core_java_assignments;

public class Assignment1 {
	public static void main(String[] args) {
		System.out.println("Question 1)");
		System.out.println("INEURON");
		System.out.println();
		int n = 4;
		System.out.println("Question 2)");
		System.out.println();
		questionSecond(n);
		System.out.println();
		
		n = 13;
		System.out.println("Question 3)");
		System.out.println();
		questionThird(n);
		System.out.println();
		
		n = 7;
		System.out.println("Question 4)");
		System.out.println();
		questionFourth(n);
		System.out.println();
		
		n = 9;
		System.out.println("Question 5)");
		System.out.println();
		questionFifth(n);
		System.out.println();
	}
	public static void questionSecond(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static void questionThird(int n) {
		int spaceCount = 0;
		if(n % 2 == 0) {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					if(i == 1) {
						System.out.print("*");
					}
					else if(i > 1 && i <= n/2) {
						if(j <= (n/2)-spaceCount) {
							System.out.print("*");
						}
						else if(j > (n/2)+spaceCount-1) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					else if(i < n && i > n/2){
						if(j==1 || j==n) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					else {
						System.out.print("*");
					}
				}
				spaceCount+=1;
				System.out.println();
			}
		}
		else {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					if(i == 1) {
						System.out.print("*");
					}
					else if(i > 1 && i <= n/2) {
						if(j <= (n/2)-spaceCount+1) {
							System.out.print("*");
						}
						else if(j > (n/2)+spaceCount) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					else if(i < n && i > n/2){
						if(j==1 || j==n) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
					else {
						System.out.print("*");
					}
				}
				spaceCount+=1;
				System.out.println();
			}
		}
	}
	public static void questionFourth(int num) {
		int n = num;
		if(num % 2 == 0) {
			n = num - 1;
		}
		int spaceCount = (n*2)-3;
		for(int i = 1; i <= n; i++) {
			int j = 1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			while(j > i && j <= (i+spaceCount)) {
				System.out.print(" ");
				j++;
			}
			while(j > (i+spaceCount) && j < (n*2)) {
				System.out.print("*");
				j++;
			}
			spaceCount-=2;
			System.out.println();
		}
		if(num % 2 == 0) {
			for(int i = 1; i < num*2-2; i++) {
				System.out.print("*");
			}
		}
	}
	public static void questionFifth(int n) {
		if(n % 2 == 0) {
			n+=1;
		}
		int beforeSpace1 = n/2;
		int beforeSpace2 = 2;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == 1 || i == n) {
					System.out.print("*");
				}
				else if(i > 1 && i <= (n/2)+1) {
					if(j <= beforeSpace1) {
						System.out.print("*");
					}
				}
				else if(i > (n/2)+1) {
					if(j <= beforeSpace2) {
						System.out.print("*");
					}
				}
			}
			if(i > 1 && i <= (n/2)+1) {
				beforeSpace1--;
			}
			else {
				beforeSpace2++;
			}
			System.out.println();
		}
	}
}