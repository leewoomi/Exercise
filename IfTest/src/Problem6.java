

//import java.util.Scanner;

/*입력 50 +40
 * 출력 50+40 =90
 * */

//Problem6.java 우클릭 Run As -> Run Configurations -> Arguments -> 입력 -> RUN
public class Problem6 {

	public static void main(String[] args)  {
		while ( true) {
			//Scanner sc = new Scanner(System.in);
			int num1=Integer.parseInt(args[0]);
			String k=args[1];
			int num2=Integer.parseInt(args[2]);
		
			/*System.out.print("num1 : ");
			num1 = sc.nextInt();
			System.out.print("연산자를 입력하세요.");
			Scanner sc1 = new Scanner(System.in);
			k = sc1.next();
			System.out.print("num2 :");
			num2 = sc.nextInt();*/
			
			if (k.equals("+")) {
				System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			} else if (k.equals("-")) {
				System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			} else if (k.equals("x")) {
				System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			} else if (k.equals("/")) {
				System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
			} else if (k.equals("%")) {
				System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
			}
		//continue;
		}
	}

}
