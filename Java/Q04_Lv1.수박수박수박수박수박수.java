package programmers.java;

// ���ڼ��ڼ��ڼ��ڼ��ڼ�?
public class Q4 {

	public static String solution(int n) {

		String answer = "";

		String su = "��";
		String bak = "��";

		for (int i = 1; i <= n; i++) {
			answer += i % 2 != 0 ? su : bak;
		}

		return answer;
	}

	// �׽�Ʈ �ڵ�
	public static void main(String[] args) {

		System.out.println(solution(3));
	}
}
