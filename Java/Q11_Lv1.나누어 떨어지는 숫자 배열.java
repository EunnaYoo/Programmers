package programmers;

import java.util.ArrayList;
import java.util.Collections;

// 나누어 떨어지는 숫자 배열
public class Q11 {

	public static int[] solution(int[] arr, int divisor) {

		ArrayList<Integer> result = new ArrayList<>();

		for (int arrL : arr) {
			if (arrL % divisor == 0) {
				result.add(arrL);
			}
		}

		if (result.size() == 0)
			result.add(-1);

		Collections.sort(result);

		int[] answer = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			answer[i] = result.get(i);
		}

		return answer;
	}
}
