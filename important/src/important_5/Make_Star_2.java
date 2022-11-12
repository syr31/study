package important_5;

public class Make_Star_2 {

	public static void main(String[] args) {
			// 0부터 5까지 다섯줄을 만듬
		for (int i = 0; i < 5; i++) {
			// 0부터 j가 i(0)보다 클때까지 공백을 찍어줌
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// j를 5로 초기화 , 5인 j를 i(o)보다 작아질때 까지 j 감소
			// 처음 별 5개를 찍고 j감소 다음 4개 찍고 감소
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			//개행문자 줄바꿈
			System.out.println();
		}

	}

}
