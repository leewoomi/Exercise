import java.util.Scanner;

/*점수를 입력받아서 학점을 구하고
 * A면 전액 장학금
 * B면 반액
 * C면 근로
 * 아니면 장학금 대상이 아님
 * 출력*/
public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int jumsu = sc.nextInt();
		char hakjum = 'A';

		
		jumsu = jumsu / 10;
		
		switch (jumsu) {
		case 10:
			hakjum = 'A';
			System.out.println("A");
			break;
		case 9:
			hakjum = 'A';
			System.out.println("A");
			break;
		case 8:
			hakjum = 'B';
			System.out.println("B");
			break;
		case 7:
			hakjum = 'C';
			System.out.println("C");
			break;
		case 6:
			hakjum = 'D';
			System.out.println("D");
			break;
		default:
			hakjum = 'F';
			System.out.println("F");
			break;

		}

		switch (hakjum) {
		case 'A':
			System.out.println("전액장학금");
			break;
		case 'B':
			System.out.println("반액장학금");
			break;
		case 'C':
			System.out.println("근로장학금");
			break;
		default:
			System.out.println("장학금 대상이 아님");
			break;
		}

	}

}
