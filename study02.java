package Programmers;

import java.util.HashMap;

public class study02 {
	
	public static int solution(String[][] clothes) {
        int answer = 1;
        
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
        
        // 경우의 수 공식에 맞춰
        for(String keys: map.keySet()) {
    		answer *= (map.get(keys) + 1);
    	}
        
    	return answer -= 1;
    }

	public static void main(String[] args) {
		
		String[][] clothes = {{"yellow_hat", "face"}, {"blue_sunglasses", "face"}, {"green_turban", "face"}};
		System.out.println(solution(clothes));
	}
}
