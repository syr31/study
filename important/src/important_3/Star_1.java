package important_3;

import java.util.Scanner;

public class Star_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();

		for (int line = 0; line < N; line++) {
			for (int Star = 0; Star <= line; Star++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}

// 