import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*이름과 나이를 입력하여 그대로 출력하는 프로그램을 작성
 * 예) 입력 : 홍길동 300
 * 출력 : 홍길동님의 나이는 300세입니다.*/
public class NameAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = 0;
		String name = "";
		System.out.printf("이름을 입력하세요: ");
		name = sc.next();
		System.out.printf("나이를 입력하세요: ");
		age = sc.nextInt();
		System.out.println(name + "님의 나이는 " + age + "세입니다.");

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("이름을 입력하세요: ");
		String name1 = null;
		try {
			// 이부분에 개발자가 입력합니다.
			// 실행되면서 문제가 발생할 여지가 있는 소스를 여기에 기록합니다.
			name1 = input.readLine();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			// 3번
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// 2번
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block

			// 1번
			e.printStackTrace();
		}
		System.out.printf("나이를 입력하세요: ");
		int age1 = 0;
		try {
			age1 = Integer.parseInt(input.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		System.out.println(name1 + "님의 나이는 " + age1 + "세입니다.");
	}

}
