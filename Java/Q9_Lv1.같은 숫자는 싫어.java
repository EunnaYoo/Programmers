package programmers.java;

import java.util.ArrayList;

// ���� ���ڴ� �Ⱦ�
public class Q9 {
	
	public static int[] Solution(int[] arr) {
		
		ArrayList<Integer> temp = new ArrayList<>();
		int preNum = 10;
		
		for(int num : arr) {
			if(preNum != num) temp.add(num);
			preNum = num;
		}
		
		int[] answer = new int[temp.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = temp.get(i).intValue();
		}
		
		return answer;
	}
	
	// �׽�Ʈ �ڵ�
	public static void main(String[] args) {
		
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		
		for(int answer : Solution(arr)) {
			System.out.println(answer);
		}
	}
}
