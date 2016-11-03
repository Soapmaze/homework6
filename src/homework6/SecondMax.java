package homework6;

import java.util.Scanner;

public class SecondMax {

	Scanner s = new Scanner(System.in);
	int[] number = new int[10];
	String inputNumber;
	int i = 0;

	void input() {
		do {
			while (true) {
				System.out.printf("%d번째 수를 입력하시오 (종료는 q를 입력) : ", i + 1);
				inputNumber = s.nextLine();
				if (this.inputNumber.equalsIgnoreCase("q"))
					return;
				else if (!ExamVariousArray.isNumber(inputNumber)) {
					System.out.println("숫자만 입력하셔야 합니다.");
					continue;
				} else {
					number[i] = Integer.parseInt(inputNumber);
					i++;
				}
				if (i == 10) {
					SecondMaxReturn(number);
					i = 0;
					break;
				}
			}

		} while (true);
	}

	void SecondMaxReturn(int arr[]) {
		int max = arr[0];
		int secondMax = max;
		int index = 0;

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > max) {
				secondMax = max;
				max = arr[j];
				index = j;
			} else if ((arr[j] > secondMax && arr[j] < max) || max == secondMax) {
				secondMax = arr[j];
				index = j;
			}
		}
		System.out.printf("두번째로 큰 수는 %d번째수 %d입니다.\n", index, secondMax);
	}
}
