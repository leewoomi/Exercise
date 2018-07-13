
public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j=0;
		int sum = 0;
		for (i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1+2+3+....+100 = " + sum + "(for statement)");

		while (i <= 100) {
			sum += i;
		}
		System.out.println("1+2+3+...+100 = " + sum + "(while statement)");
	sum=0;
		do {
			sum += j;
			j= j+1;
		
		} while (j<= 100);
		System.out.println("1+2+3+...+100 = " + sum + "(do while statement)");
	}

}
