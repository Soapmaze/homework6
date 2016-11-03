package homework6;

import java.util.Scanner;

public class AvgScore {

	Scanner s = new Scanner(System.in);
	double[] scores = new double[10];
	String inputScore;
	int i = 0;

	void input() {
		do {
			while (true) {
				System.out.printf("%d번 심사점수 입력 (종료는 q를 입력) : ", i + 1);
				inputScore = s.nextLine();
				if (this.inputScore.equalsIgnoreCase("q"))
					return;
				else if (!ExamVariousArray.isNumber(inputScore)) {
					System.out.println("숫자만 입력하셔야 합니다.");
					continue;
				} else {
					scores[i] = Double.parseDouble(inputScore);
					i++;
				}
				if (i == 10) {
					MaxMinExceptReturn(scores);
					i = 0;
					break;
				}
			}

		} while (true);
	}
	
	void MaxMinExceptReturn(double arr[]) {
		double max = arr[0];
		double min = arr[0];
		double sum = 0.0;

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > max) {
				max = arr[j];
			}
			if (arr[j] < min) {
				min = arr[j];
			}
			sum += arr[j];
		}
		
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수 평균은 %.1f 입니다.\n", (sum-max-min)/8);
	}
}
