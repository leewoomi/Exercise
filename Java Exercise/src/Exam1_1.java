import java.util.Scanner;

public class Exam1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int sum = 0;
		/*
		 * 1)1부터 100사이의 수를 이용하여 for문으로 홀수의 합계를 구하는 프로그램을 2가지 방법으로 작성하세요.
		 */
		System.out.println("*********1부터 100사이의 홀수의 합ㄱㅖ-1*********");
		for (i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
				// System.out.println(i);
			}
		}
		System.out.println(sum);

		System.out.println("*******1부터 100사이의 홀수의 합ㄱㅖ-2************");
		i = 0;
		sum = 0;
		for (i = 1; i <= 100; i = i + 2) {
			sum = sum + i;
			// System.out.println(i);
		}
		System.out.println(sum);

		/* 2)1)에서 while문을 이용하여 2가지 방법으로 풀어보세요. */
		System.out.println("***************while문-1*****************");
		int j = 1;
		sum = 0;
		while (j < 100) {

			sum = sum + j;
			j = j + 2;

		}
		System.out.println(sum);

		System.out.println("***************while문-2*****************");
		sum = 0;
		j = 1;
		do {
			sum += j;
			j = j + 2;

		} while (j <= 100);
		System.out.println(sum);

		/*
		 * 3)1부터 100사이에 홀수는 더하기를 하고, 짝수는 빼기를 하여 합계를 구하되 2가지 방법으로 푸세요.
		 */
		System.out.println("******1부터 100사이에 홀수는 더하기를 하고, 짝수는 뺀 수의 합계 -1***********");
		sum = 0;
		i = 0;
		for (i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				sum -= i;
				// System.out.println("-" + i);
			} else {
				sum += i;
				// System.out.println(i);
			}
		}
		System.out.println(sum);

		System.out.println("******1부터 100사이에 홀수는 더하기를 하고, " + "짝수는 뺀 수의 합계 -2***********");
		j = 0;
		sum = 0;
		while (j < 100) {

			j = j + 1;
			if (j % 2 == 0) {
				sum = sum - j;
			} else {
				sum = sum + j;
			}
		}
		System.out.println(sum);
		/* 4)1/2-2/3+3/4-4/5 ~ 49/50 분수의 합계를 구하는 프로그램을 작성하세요. */
		System.out.println("1/2-2/3+3/4-4/5 ~ 49/50 분수의 합계");

		j = 0;
		float hap = 0;
		int sw = 1;
		for (j = 1; j <= 49; j++) {
			if (j % 2 == 0) {
				hap -= (float) j / (j + 1);
				// System.out.println(j);
			} else {
				hap += (float) j / (j + 1);
			}
		}
		System.out.println(hap);
		/*
		 * 5)3개의 숫자를 입력으로 받고 3개의 숫자 중에 중간 값을 가지는 숫자를 출력하세요. ex) 20, 50, 30 => 30
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("a : ");
		int a = sc.nextInt();
		System.out.println("b : ");
		int b = sc.nextInt();
		System.out.println("c : ");
		int c = sc.nextInt();

		if (a > b && a > c) {
			if (b > c) {
				System.out.println("b가 중간 값 ");
			} else {
				System.out.println("c가 중간 값");
			}
		} else if (a > b && a < c) {
			if (b < c) {
				System.out.println("a가 중간 값 ");
			}
		} else if (a < b && a > c) {
			if (b > c) {
				System.out.println("a가 중간 값 ");
			} else {
				System.out.println("c가 중간 값");
			}
		} else if (a < b && a < c) {
			if (b < c) {
				System.out.println("b가 중간 값");
			} else {
				System.out.println("c가 중간 값");
			}
		}

		/*
		 * 6) 1부터 10까지의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다. 그렇다면 1부터 20까지의 어떤 수로도 나누어 떨어지는
		 * 가장 작은 수는 얼마입니까?
		 */
		System.out.println("*********1부터 20까지의 어떤 수로도 나누어 떨어지는 가장 작은 수**********");
	
	}
}