//입력받은 6개 정수를 저장하고 최대값부터 최소값까지 출력하는 프로그램을 만들어라
package important_1;

import java.util.Scanner;

public class quiz_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < 6; i++) {
			inp = sc.nextInt();
			max = max > inp ? max : inp;
			min = min < inp ? min : inp;
		}
		sc.close();

		System.out.printf("max : %d, min : %d", max, min);
	}

}