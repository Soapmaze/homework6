package homework6;

import java.util.Scanner;

public class OnlyNumber {

	Scanner s = new Scanner(System.in);
	int number[] = new int[10];
	String inputNumber;
	int i = 0;

	void input() {
		System.out.println("1~100사이의 숫자를 입력하세요");

		do {
			int check_num;
			boolean flag = false;

			System.out.printf("%d번째 숫자: ", i + 1);
			inputNumber = s.nextLine();

			if (this.inputNumber.equalsIgnoreCase("q"))
				return;
			else if (!ExamVariousArray.isNumber(inputNumber)) {
				System.out.println("숫자만 입력하셔야 합니다.");
				continue;
			} else {
				check_num = Integer.parseInt(inputNumber);
				for (int j = 0; j < number.length; j++) {
					if (check_num == number[j]) {
						flag = true;
						break;
					}
				}
				if (!flag && check_num >= 1 && check_num <= 100)
					number[i++] = check_num;
				else
					System.out.println("잘못 입력하였습니다. 다시 입력하세요");
			}
			if (i == 10) {
				Result();
				i = 0;
			}

		} while (true);
	}

	void Result() {
		for (int i = number.length - 1; i >= 0; i--) {
			System.out.printf("%d번째 숫자는 %d 입니다.\n", i + 1, number[i]);
			number[i] = 0;
		}
	}
}
