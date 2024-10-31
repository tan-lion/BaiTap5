package par1;

import java.util.Scanner;

public class CongTruNhanChia {

	public static void plus(int value_1, int value_2) {
		System.out.println("Tong hai so: " + (value_1 + value_2));
	}

	public static void minus(int value_1, int value_2) {
		System.out.println("Hieu hai so: " + (value_1 - value_2));
	}

	public static void multipli(int value_1, int value_2) {
		System.out.println("Tich hai so: " + (value_1 * value_2));
	}

	public static void divide(int value_1, int value_2) {
		System.out.println("Thuong hai so: " + (value_1 / value_2));
	}

	public static void divideRemainder(int value_1, int value_2) {
		System.out.println("Thuong hai so (du): " + (value_1 % value_2));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Declare
		int a, b, option;

		// Input
		System.out.println("Nhap gia tri a: ");
		a = scanner.nextInt();
		System.out.println("Nhap gia tri b: ");
		b = scanner.nextInt();
		System.out.println("Nhap phep tinh ban muon chon: ");
		option = scanner.nextInt();

		try {
			switch (option) {
			case 1:
				plus(a, b);
				break;
			case 2:
				minus(a, b);
				break;
			case 3:
				multipli(a, b);
				break;
			case 4:
				divide(a, b);
				break;
			case 5:
				divideRemainder(a, b);
				break;

			default:
				break;
			}
		} catch (Exception e) {
			System.out.println("Phep tinh khong the thuc hien!");
		}

	}
}
