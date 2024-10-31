package par1;

import java.util.Scanner;

public class KiemTraChanLe {

	public static boolean checkOddEven(int value) {
		if (value % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Declare, Input
		System.out.println("Nhap gia tri can kiem: ");
		int a = scanner.nextInt();

		if (checkOddEven(a) == true) {
			System.out.println(a + " la so chan.");
		} else {
			System.out.println(a + " la so le");
		}
	}
}
