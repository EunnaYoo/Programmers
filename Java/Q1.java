package programmers;

import java.util.HashMap;

public class Q1 {
	
	public String Solution(String[] Participant, String[] Completion) {
		
		String answer = "";
		int val = 0;
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String part : Participant) {
			
			if(map.get(part) == null) {
				map.put(part, 1);
			} else {
				val = map.get(part) + 1;
			}
		}
		
		for(String com : Completion) {
			val = map.get(com) - 1;
			map.put(com, val) ;
		}
		
		for(String key : map.keySet()) {
			if(map.get(key) == 1) {
				answer = key;
			}
		}
		
        return answer;
	}

	public static void main(String[] args) {
		
		Q1 q = new Q1();
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		System.out.println(q.Solution(participant, completion));
	}
}
