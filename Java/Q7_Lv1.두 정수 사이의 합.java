package programmers.java;

// �� ���� ������ ��
public class Q7 {
	
	public static long solution(long a, long b) {
	      
	      long answer = (a == b) ? a : ((Math.abs(b-a)+1)*(a+b)/2);
	      
	      return answer;
	  }

	
	// �׽�Ʈ �ڵ�
	public static void main(String[] args) {
		
		System.out.println(solution(5, 3));
		System.out.println(solution(3, 5));
		System.out.println(solution(3, 3));
	}
}
