package book;

import java.util.Scanner;

public class E3_17_exception_p156 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3���� �Է��ϼ���");
		int sum = 0, n = 0;
		for (int i=0; i<3; i++) {
			System.out.println(i+">>");
			try {
				n = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				scanner.nextLine();
				i--;
				continue;
			}
			sum += n;
		}
		System.out.println("���� " + sum);
	}
}
