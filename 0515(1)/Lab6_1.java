package Lab6_1;

import java.util.Scanner;

public class Lab6_1 {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Lab6_1 lab = new Lab6_1(); // 클래스 이어주는 구문

		DanceRobot DANCE = new DanceRobot(); // 춤추는 로봇

		DrawRobot DRAW = new DrawRobot(); // 그림그리는 로봇

		SingRobot SING = new SingRobot(); // 노래 부르는 로봇

		System.out.println("==============" 
							+ "\n학번: 201804014"
							+ "\n이름: 박소영"
							+ "\n==============");

		String Menu;
		do {
			System.out.println("구매를 원하는 로봇을 선택해주세요");
			System.out.println("============================");
			System.out.println("1. 춤추는 로봇  2. 노래하는 로봇  3. 그림그리는 로봇  0. 종료");
			Menu = scan.next(); // 메뉴를 입력받음
			System.out.println("============================");
			if ("0".equals(Menu)) { // 0번을 입력받았을 때 프로그램이 종료
				System.out.println("프로그램을 끝내겠습니다.");
				System.exit(0);
			}

			else if ("1".equals(Menu)) { // 1번 메뉴 춤추는 로봇의 정보를 나타냄
				DANCE.info(DANCE);

			} else if ("2".equals(Menu)) { // 2번 메뉴 노래 부르는 로봇의 정보를 나타냄
				DRAW.info(DRAW);

			} else if ("3".equals(Menu)) { // 3번 메뉴 그림그리는 로봇의 정보를 나타냄
				SING.info(SING);
			} else {
				System.out.println("잘못입력하셨습니다");
			}

		} while (true);
	}
}