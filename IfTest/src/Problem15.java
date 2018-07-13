import java.util.Scanner;

/*이름 미술 음악 체육 점수를 입력
 * 총점 평균 학점 가산점 합격/불합격
 * 가산점: 평균 60점 이상 10%가산점
 * 감산점 : 평균 60점 미만 10%감산점
 * 그리고 합격/불합격 판정
 * 합격인 경우 평균이 60점 이상*/
public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		String name =sc.next();
		System.out.println("미술 점수를 입력하세요 : ");
		int art = sc.nextInt();
		System.out.println("음악 점수를 입력하세요 : ");
		int music = sc.nextInt();
		System.out.println("체육 점수를 입력하세요 : ");
		int sports=sc.nextInt();
		int total = art+music+sports;
		float avg =(float)total/3;
		int avgAdd=(int) ((avg>=60)? ( avg*1.1) : (avg*0.9)) ;
		String pass = (avg>=60)? "합격" : "불합격";		
	
		System.out.println("이름 : "+name);
		System.out.println("미술 : "+art);
		System.out.println("음악 : "+music);
		System.out.println("체육 : "+sports);
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avgAdd);
		System.out.println(pass+"입니다.");
		
	
		
	}

}
