import java.util.Scanner;

/*주어진 초를 이용하여 몇 시간 몇 분 몇 초인가를 
 * 알아보는 프로그램을 작성합니다.
 * 1분 = 60초
 * 1시간 =60분 = 60 *60초
 * 1일 = 24시간 =  24 * 60 분 = 24 * 60*60초
 * */
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력하세요");
		int time = sc.nextInt();
		int m, h, s=0;
	

		// 분
		m = time / 60;
		s = time % 60;

		// 시간
		h = m / 60;
		m = m % 60;

		System.out.println(time + "초는 " + h + "시간" + m + "분" + s + "초");
	}

}
