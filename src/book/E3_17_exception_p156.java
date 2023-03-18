package book;

import java.util.Scanner;

public class E3_17_exception_p156 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum = 0, n = 0;
		for (int i=0; i<3; i++) {
			System.out.println(i+">>");
			try {
				n = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scanner.nextLine();
				i--;
				continue;
			}
			sum += n;
		}
		System.out.println("합은 " + sum);
	}
}
