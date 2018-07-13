import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

/*컴퓨터가 어떤 숫자를 생성합니다.
 * 그러면 , 사람이 컴퓨터가 생성한 숫자가 무엇인지를 생각하여
 * 알아맞추는 게임
 * 1~500사이의 난수가 발생하도록 함.
 * 시도횟수를 카운트
 * 큰수인지 작은수인지 판단하여 알려줌
 * 맞추면 "정답입니다!!!"
 * 예외처리*/
public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int i;
		// 난수 발생

		int c = (int) (Math.random() * 500 + 1);

		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 500사이의 숫자를 입력하세요.");
		int h = 0;
		while (c != h) {
			// 숫자 입력

			try {
				h = sc.nextInt();

			} catch (InputMismatchException ime) {// 특수문자, 문자,큰값일때
				sc = new Scanner(System.in);
				System.out.println("1부터 500사이의 숫자만 입력하세요.");
				continue;
			} catch (NoSuchElementException nsee) {// java.util.NoSuchElementException : ctrl +z
				sc = new Scanner(System.in);
				System.out.println("키보드를 잘못느르셨습니다.");
				continue;
			}catch(Exception e) {
				System.out.println("알수 없는 오류가 발생하였습니다.");
			}

			System.out.println("입력한 수는 " + h + "입니다.");
			if (c != h) {
				if (c > h) {
					System.out.println("입력하신 수보다 큰수입니다.");
				} else if (c < h) {
					System.out.println("입력하신 수보다 작은 수입니다.");
				}
			} else if (c == h) {
				System.out.println("정답입니다!!!!^^*");
			}

			count = count + 1;
		}

		System.out.println(count + "번 시도하였습니다.");

	}
}