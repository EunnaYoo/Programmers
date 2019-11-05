package Programmers;

import java.util.HashMap;

public class study01 {
	
	public static int solution(String[][] clothes) {
        int answer = 0;
        
        // 각 key의 value 모두 더한 값
        int totPlus = 0;
        
        // 각 key의 value 모두 곱한 값
        int count = 1; 
        
        HashMap<String, Integer> map = new HashMap<>();
        
        // 기존 데이터를 활용할 수 있도록 key, value로 변경하기
        for(int i = 0; i < clothes.length; i++) {
        	// map에 key가 존재한다면 기존 key의 value + 1
        	if(map.get(clothes[i][1]) != null) {
        		map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
        	} else { // 존재하지 않는다면 새로운 key, value 생성
        		map.put(clothes[i][1], 1);
        	}
        }
        
        // key가 하나만 존재할 경우엔 value를 그대로 출력하면 되므로 조건문으로 검증
        if(map.size() == 1) {
        	for(String key : map.keySet()) {
        		totPlus = map.get(key);
        		answer = totPlus;
        	}
        } else {
        	for(String key : map.keySet()) {
        		totPlus += map.get(key);
        		count *= map.get(key);
        		answer = totPlus + count;
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "face"}, {"blue_sunglasses", "face"}, {"green_turban", "face"}};
		System.out.println(solution(clothes));
	}
}
