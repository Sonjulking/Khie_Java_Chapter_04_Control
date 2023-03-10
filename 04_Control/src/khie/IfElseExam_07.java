package khie;

import java.util.Scanner;

/*
 * [문제1] 키보드로 점수를 입력받아서 입력받은 점수가 60점 이상이라면 "합격" 이라는 문자를 화면에 출력하고, 60점 미만이라면 
 *"불합격" 이라는 문자를 화면에 출력해보세요.
 */

//1.키보드 입력준비작업
//2.키보드로 점수를 입력을 받자.
//3.조건문을 만들어보자
//4.40점 이상인 경우 출력문
//5.60점 미만인 경우 출력문
//6.scanner 종료 

public class IfElseExam_07 {

	public static void main(String[] args) {

		// 1.키보드 입력 준비 작업
		Scanner sc = new Scanner(System.in);

		// 2. 키보드로 점수를 입력 받자
		System.out.print("점수를 입력해주세요. >>> ");

		int jumsu = sc.nextInt();

		// 3.조건문을 만들어 보자
		if (jumsu >= 60) {

			// 4.60점 이상인 경우 출력문
			System.out.println("합격");

		} else {
			// 5.60점 미만인 경우 출력문
			System.out.println("불합격");
		}

		// 6.scanner() 종료
		sc.close();

	}

}
