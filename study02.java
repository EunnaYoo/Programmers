package Programmers;

import java.util.HashMap;

public class study02 {
	
	public static int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        // ���� �����͸� Ȱ���� �� �ֵ��� key, value�� �����ϱ�
        for(int i = 0; i < clothes.length; i++) {
        	// map�� key�� �����Ѵٸ� ���� key�� value + 1
        	if(map.get(clothes[i][1]) != null) {
        		map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
        	} else { // �������� �ʴ´ٸ� ���ο� key, value ����
        		map.put(clothes[i][1], 1);
        	}
        }
        
        // ����� �� ���Ŀ� ����
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
