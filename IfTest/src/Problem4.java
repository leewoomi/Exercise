import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money;
		int n = 0;
		int co;
		float VAT;
		int change;
		int total;
		System.out.println("지불금액을 입력하세요");
		money = sc.nextInt();
		System.out.println("커피 가격을 입력하세요");
		co = sc.nextInt();
		System.out.println("몇 개 구매?");
		n = sc.nextInt();

		VAT = (float) (n * co * 0.1);
		total = (int) ((n * co) + VAT);

		change = money - total;

		System.out.println("총 금액은 " + total + "원 입니다. ");
		System.out.println("부가세는 " + VAT + "원 입니다.");
		System.out.println("거스름돈은 " + change + "원 입니다.");
	}

}
/*
 * 물건을 삽니다. 커피 가격은 개당 4000원이었을 때, n개의 커피를 구입합니다. 이때, 부가세는 10 %를 부과합니다.(VAT 별도)
 * 거스름돈은 얼마?
 */