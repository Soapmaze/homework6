package homework6;

import java.util.Scanner;

public class StudentScore {

	Scanner s = new Scanner(System.in);
	double[][] scores = new double[5][3];
	String[] inputScore = new String[3];
	int i = 0;

	void input() {
		do {
			while (true) {
				System.out.printf("%d번 학생 국어, 영어, 수학 : ", i + 1);
				inputScore = s.nextLine().split(" ");
				if (this.inputScore[0].equalsIgnoreCase("q"))
					return;
				else if (!ExamVariousArray.isNumber(inputScore[0]) || !ExamVariousArray.isNumber(inputScore[1])
						|| !ExamVariousArray.isNumber(inputScore[2])) {
					System.out.println("숫자만 입력하셔야 합니다.");
					continue;
				} else {
					for (int j = 0; j < this.scores[0].length; j++)
						scores[i][j] = Double.parseDouble(inputScore[j]);
					i++;
				}
				if (i == 5) {
					ScoreReturn(scores);
					i = 0;
					break;
				}
			}

		} while (true);
	}

	void ScoreReturn(double arr[][]) {
		double kor_sum = 0.0;
		double eng_sum = 0.0;
		double mat_sum = 0.0;
		double[] personal_sum = new double[5];

		for (int i = 0; i < arr.length; i++) {
			kor_sum += arr[i][0];
			eng_sum += arr[i][1];
			mat_sum += arr[i][2];
			for (int j = 0; j < arr[0].length; j++) {
				personal_sum[i] += arr[i][j];
			}
		}
		System.out.printf("국어 총점은 %.0f점이고, 평균은 %.1f 입니다.\n", kor_sum, kor_sum / arr.length);
		System.out.printf("영어 총점은 %.0f점이고, 평균은 %.1f 입니다.\n", eng_sum, eng_sum / arr.length);
		System.out.printf("수학 총점은 %.0f점이고, 평균은 %.1f 입니다.\n", mat_sum, mat_sum / arr.length);
		for(int k=0; k < arr.length; k++){
			System.out.printf("%d번 학생의 총점은 %.0f, 평균은 %.1f 입니다.\n", k+1, personal_sum[k], personal_sum[k]/arr[0].length);
		}
		

	}
}
