package par1;

import java.util.Scanner;

public class TimMaxTrong3So {

	public static int maxValueInThreeNumbers(int value_1, int value_2, int value_3) {
		int max = value_1;

		if (value_2 > max && value_2 > value_3) {
			max = value_2;
		}
		if (value_3 > max && value_3 > value_2) {
			max = value_3;
		}

		return max;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declare
		int a, b, c;

		// Input
		System.out.println("Nhap gia tri a: ");
		a = sc.nextInt();
		System.out.println("Nhap gia tri b: ");
		b = sc.nextInt();
		System.out.println("Nhap gia tri c: ");
		c = sc.nextInt();

		// Output
		System.out.println("Gia tri lon nhat trong ba so: " + maxValueInThreeNumbers(a, b, c));
	}
}
