package important_5;

public class Make_Star_2 {

	public static void main(String[] args) {
			// 0���� 5���� �ټ����� ����
		for (int i = 0; i < 5; i++) {
			// 0���� j�� i(0)���� Ŭ������ ������ �����
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// j�� 5�� �ʱ�ȭ , 5�� j�� i(o)���� �۾����� ���� j ����
			// ó�� �� 5���� ��� j���� ���� 4�� ��� ����
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			//���๮�� �ٹٲ�
			System.out.println();
		}

	}

}
