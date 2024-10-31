package par1;

import java.util.Scanner;

public class Tong3So {

	public static int sumThreeNumbers(int value_1, int value_2, int value_3) {
		return value_1 + value_2 + value_3;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Declare
		int a, b, c;

		// Input
		System.out.println("Nhap gia trị a: ");
		a = scanner.nextInt();
		System.out.println("Nhap gia trị b: ");
		b = scanner.nextInt();
		System.out.println("Nhap gia trị c: ");
		c = scanner.nextInt();

		// Output
		System.out.println("Tong gia tri của 3 so: " + sumThreeNumbers(a, b, c));
	}
}
