package programmers.java;

// 가운데 글자 가져오기
public class Q5 {

	public static String solution(String s) {
		String answer = "";

		if (s.length() % 2 != 0) {
			answer = s.substring(s.length() / 2, s.length() / 2 + 1);
		} else {
			answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
		}

		return answer;
	}

	// 테스트 코드
	public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("abcd"));
	}
}
