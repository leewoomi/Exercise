import java.util.Scanner;

/*3개의 숫자를 입력받아서 가장큰수, 중간수, 가장작은수를
 * 찾아서 출력하는 프로그램을 작성하세요
 * 2 3 4
 * 2 4 3
 * 3 4 2
 * 3 2 4
 * 4 3 2
 * 4 2 3
 * */
public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력하세요.");
		System.out.println("a : ");
		int a = sc.nextInt();
		System.out.println("b : ");
		int b = sc.nextInt();
		System.out.println("c : ");
		int c = sc.nextInt();

		int MAX = 0, MID = 0, MIN = 0;
		
			if (a > b && a > c) {
				MAX = a;
				if (b > c) {
					MID = b;
					MIN = c;
				} else {
					MID = c;
					MIN = b;
				}
			} else if (b > a && b > c) {
				MAX = b;
				if (a > c) {
					MID = a;
					MIN = c;
				} else {
					MID = c;
					MIN = a;
				}
			} else if (c > a && c > b) {
				MAX = c;
				if (a > b) {
					MID = a;
					MIN = b;
				} else {
					MID = b;
					MIN = a;
				}
			}
		
		System.out.println("가장 큰 수는 " + MAX + ", 중간 수는 " + MID + ",가장 작은 수는 " + MIN + "입니다.");
	}

}
