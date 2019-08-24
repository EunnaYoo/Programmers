package programmers.java;

import java.util.ArrayList;
import java.util.List;

// Ã¼À°º¹
public class Q3 {

	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;

		List<Integer> lostList = new ArrayList<Integer>();
		for (int list : lost)
			lostList.add(list);

		List<Integer> reserveList = new ArrayList<Integer>();
		for (int list : reserve)
			reserveList.add(list);

		for (int i = 0; i < lostList.size(); i++) {
			for (int j = 0; j < reserveList.size(); j++) {
				if (lostList.get(i) == reserveList.get(i)) {
					lostList.remove(i);
					reserveList.remove(j);
					i--;
					answer++;
					break;
				}
			}
		}

		for (int i = 0; i < lostList.size(); i++) {
			int lostNum = lostList.get(i);
			for (int j = 0; j < reserveList.size(); j++) {
				int reserveNum = reserveList.get(i);
				if (lostNum == reserveNum - 1 || lostNum == reserveNum + 1) {
					reserveList.remove(j);
					answer++;
					break;
				}
			}
		}
		return answer;
	}
}
