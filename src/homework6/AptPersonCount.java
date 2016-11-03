package homework6;

import java.util.Scanner;

public class AptPersonCount {

	Scanner s = new Scanner(System.in);
	int[][] persons = new int[6][4];
	String inputPerson;
	int i = 0;
	int j = 0;

	void input() {
		do {

			for (i = 0; i < persons.length - 1; i++) {
				while (true) {
					System.out.printf("%d0%d호에 살고 있는 사람의 수 (q : 종료) : ", i + 1, j + 1);
					inputPerson = s.nextLine();
					if (this.inputPerson.equalsIgnoreCase("q"))
						return;
					else if (!ExamVariousArray.isNumber(inputPerson)) {
						System.out.println("숫자만 입력하셔야 합니다.");
						continue;
					} else {
						persons[i][j] = Integer.parseInt(inputPerson);
						j++;
					}
					if (j == persons[0].length - 1) {
						j = 0;
						break;
					}
				}
			}
			if (i == persons.length - 1) {
				ReturnResult(persons);
			}
		} while (true);
	}

	void ReturnResult(int arr[][]) {
		int person_sum = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[0].length - 1; j++) {
				person_sum += arr[i][j];
				arr[i][3] += arr[i][j];
				arr[5][j] += arr[i][j];
			}
		}
		System.out.printf("이 아파트의 거주자는 모두 %d명 입니다.\n", person_sum);
		for (int k = 0; k < arr.length - 1; k++) {
			System.out.printf("%d층에 사는 거주자는 모두 %d명입니다.\n", k + 1, arr[k][3]);
		}
		for (int l = 0; l < arr[0].length - 1; l++) {
			System.out.printf("%d호 라인에 사는 거주자는 모두 %d명입니다.\n", l + 1, arr[5][l]);
		}
	}
}
