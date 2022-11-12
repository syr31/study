package important_2;

import java.util.Scanner;

public class quiz_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int inp = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < 6; i++) {
			inp = sc.nextInt();

			max = max > inp ? max : inp;
			min = min < inp ? min : inp;

			System.out.printf("max : %d min : %d", max, min);
		}

	}

}
