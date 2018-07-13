import java.util.Scanner;

/*메소들르 이용하여 가감승제산을 하는 
 * 프로그램을 작성하세오.
 * 메소드 규칙 4가지중에서 하나를 선택하여
 * 코딩해주세요*/
public class Method_Test {

	private static int a;
	private static int b;
	private static int c;
	private float d;
	private static Scanner sc;
	private static Scanner sc2;

	public int inputa() {
		sc = new Scanner(System.in);
		System.out.println("a:");
		a = sc.nextInt();
		return a;

	}

	public int inputb() {
		sc2 = new Scanner(System.in);
		System.out.println("b:");
		b = sc2.nextInt();
		return b;

	}

	public void add() {// 덧셈
		// TODO Auto-generated method stub
		c = a + b;
		System.out.println("a+b=" + c);

	}

	public void sub() {// 뺄셈
		// TODO Auto-generated method stub

		c = a - b;
		System.out.println("a-b=" + c);
	}

	public void mul() {// 곱셈
		// TODO Auto-generated method stub

		c = a * b;
		System.out.println("a*b =" + c);
	}

	public void div() {// 나눗셈
		// TODO Auto-generated method stub

		d = (float)(a / b);
		System.out.println("a/b =" + d);
	}

	public void re() {// 나머지
		// TODO Auto-generated method stub

		c = a % b;
		System.out.println("a%b= " + c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Test mt = new Method_Test();
		mt.inputa();
		mt.inputb();
		mt.add();// 덧셈
		mt.sub();// 뺄셈
		mt.mul();// 곱셈
		mt.div();// 나눗셈
		mt.re();// 나머지
	}

}
