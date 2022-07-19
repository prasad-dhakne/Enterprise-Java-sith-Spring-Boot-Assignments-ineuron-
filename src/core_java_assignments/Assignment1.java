package core_java_assignments;

public class Assignment1 {
	public static void main(String[] args) {
		System.out.println("Pattern 1: ");
		int num = 5;
		rightUpperTriangle(num);
		System.out.println();
		System.out.println("Pattern 2: ");
		int row = 6;
		int col = 3;
		rectangle(row, col);
	}
	public static void rectangle(int row, int col) {
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= col; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void rightUpperTriangle(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
