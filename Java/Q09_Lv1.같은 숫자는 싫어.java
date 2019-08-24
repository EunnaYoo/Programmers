package programmers.java;

import java.util.ArrayList;

// 같은 숫자는 싫어
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
	
	// 테스트 코드
	public static void main(String[] args) {
		
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		
		for(int answer : Solution(arr)) {
			System.out.println(answer);
		}
	}
}
