package programmers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Q2 {
	
	public static int[] solution(int[] answers) {
		
		int[] user1 = {1, 2, 3, 4, 5};
		int[] user2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] user3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		// 맞은 개수 확인 배열 check = {0, 0, 0}
		List<Integer> check = new ArrayList<Integer>();
		for(int i = 0; i < 3; i++) check.add(0);
		
		// 몇 문제 맞았는지 확인
		for (int i = 0; i < answers.length; i++) {

			if (answers[i] == user1[i % 5])	check.set(0, check.get(0) + 1);
			if (answers[i] == user2[i % 8])	check.set(1, check.get(1) + 1);
			if (answers[i] == user3[i % 10]) check.set(2, check.get(2) + 1);
		}
		
		// 가장 많은 문제를 맞춘 사람 
		int max = Collections.max(check);
		
		// 정렬한 값을 넣어주는 ArrayList 만들기
		// check 배열의 값이 max와 같으면 returnList에 1 추가
		List<Integer> returnList = new ArrayList<Integer>();
		for (int i = 0; i < check.size(); i++) if(max == check.get(i)) returnList.add(i + 1); 
        
		// returnList size만큼 answer 배열 생성
		int[] answer = new int[returnList.size()];
		
		for (int i = 0; i < returnList.size(); i++) answer[i] = returnList.get(i);
		
        return answer;
    }

	public static void main(String[] args) {
		
		int[] answers = {1, 3, 2, 4, 2};
		
		solution(answers);
	}
}
