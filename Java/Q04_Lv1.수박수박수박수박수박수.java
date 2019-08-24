package programmers.java;

// 수박수박수박수박수박수?
public class Q4 {

	public static String solution(int n) {

		String answer = "";

		String su = "수";
		String bak = "박";

		for (int i = 1; i <= n; i++) {
			answer += i % 2 != 0 ? su : bak;
		}

		return answer;
	}

	// 테스트 코드
	public static void main(String[] args) {

		System.out.println(solution(3));
	}
}
