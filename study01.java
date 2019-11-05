package Programmers;

import java.util.HashMap;

public class study01 {
	
	public static int solution(String[][] clothes) {
        int answer = 0;
        
        // �� key�� value ��� ���� ��
        int totPlus = 0;
        
        // �� key�� value ��� ���� ��
        int count = 1; 
        
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
        
        // key�� �ϳ��� ������ ��쿣 value�� �״�� ����ϸ� �ǹǷ� ���ǹ����� ����
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
