package Lab6_1;

import java.util.Scanner;

public class Lab6_1 {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Lab6_1 lab = new Lab6_1(); // Ŭ���� �̾��ִ� ����

		DanceRobot DANCE = new DanceRobot(); // ���ߴ� �κ�

		DrawRobot DRAW = new DrawRobot(); // �׸��׸��� �κ�

		SingRobot SING = new SingRobot(); // �뷡 �θ��� �κ�

		System.out.println("==============" 
							+ "\n�й�: 201804014"
							+ "\n�̸�: �ڼҿ�"
							+ "\n==============");

		String Menu;
		do {
			System.out.println("���Ÿ� ���ϴ� �κ��� �������ּ���");
			System.out.println("============================");
			System.out.println("1. ���ߴ� �κ�  2. �뷡�ϴ� �κ�  3. �׸��׸��� �κ�  0. ����");
			Menu = scan.next(); // �޴��� �Է¹���
			System.out.println("============================");
			if ("0".equals(Menu)) { // 0���� �Է¹޾��� �� ���α׷��� ����
				System.out.println("���α׷��� �����ڽ��ϴ�.");
				System.exit(0);
			}

			else if ("1".equals(Menu)) { // 1�� �޴� ���ߴ� �κ��� ������ ��Ÿ��
				DANCE.info(DANCE);

			} else if ("2".equals(Menu)) { // 2�� �޴� �뷡 �θ��� �κ��� ������ ��Ÿ��
				DRAW.info(DRAW);

			} else if ("3".equals(Menu)) { // 3�� �޴� �׸��׸��� �κ��� ������ ��Ÿ��
				SING.info(SING);
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�");
			}

		} while (true);
	}
}