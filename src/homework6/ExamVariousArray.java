package homework6;

import java.util.Scanner;

public class ExamVariousArray {

	public static boolean isNumber(String str) {
		if (str == null || str.equals(""))
			return false;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String selected;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("1. 두번째로 큰 수 찾기");
			System.out.println("2. 심사 점수 계산");
			System.out.println("3. 학생 총점, 평균값 구하기");
			System.out.println("4. 5층 아파트의 거주자 숫자 구하기");
			System.out.println("5. 겹치지 않는 숫자 10개 입력받기");
			System.out.println("6. 종료하기");
			System.out.print("원하는 메뉴는 >> ");

			selected = s.nextLine();

			if (!isNumber(selected) || Integer.parseInt(selected) > 6 || Integer.parseInt(selected) < 1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력 바랍니다.");
				continue;
			}
			if (Integer.parseInt(selected) == 1)
				new SecondMax().input();
			//else if (Integer.parseInt(selected) == 2)
				//new TriangleStars().input();
			
			//else if (Integer.parseInt(selected) == 3)
				//new IsoscelesTriangleStars().input();
			
			//else if (Integer.parseInt(selected) == 4)
				//new DiamondStars().input();
			
			else if (Integer.parseInt(selected) == 5) {
				System.out.println("프로그램을 종료합니다.");
				s.close();
				System.exit(0);
			}

		} while (true);
	}

}
