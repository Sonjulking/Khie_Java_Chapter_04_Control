package khie;
/*
 * -다중 for 반복문
 * =>반복문 안에 또 다른 반복문을 포함하는 형태를 말함.
 * =>반복문이 중첩되어 사용되는 경우를 말함.
 * =>외부 반복문과 내부 반복문 간의 변수의 값 변화에 유의할 것. - 중요함
 * 
 * 형식)
 * 	for(초기식; 조건식; 증감식;){
 * 		반복 실행 문장;
 * 		for(초기식2; 조건식2; 증감식2){
 * 			반복 실행 문장;
 * 		}
 * 	}
 */

public class ForExam_33 {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 4; j++) {

				System.out.println("[" + i + ", " + j + "]");

			}
			System.out.println();
		}

	}

}
