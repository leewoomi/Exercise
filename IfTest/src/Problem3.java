import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c1,c2,c3;
		int total;
 
		float avg;
		Scanner sc =new Scanner(System.in);
		System.out.println("세 과목의 성적을 입력 하세요");
		System.out.print("c1 : ");
		c1 =sc.nextInt();
		System.out.print("\n c2 : ");
		c2 =sc.nextInt();
		System.out.print("\n c3 : ");
		c3 =sc.nextInt();
		
		total = c1+c2+c3;
		avg = total/3.0f;
		avg= (float) (Math.round(avg*100)/100.00);
		
		System.out.println("합계 : "+ total+" , 평균 : "+ avg);
		
		
		
	}

}
/*
 * 세 과목의 성적을 입력하여 합계와 평균을 
 * 구하는 프로그램을 작성하세요
 * 
 */