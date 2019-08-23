package programmers;

// 문자열 내 p와 y의 개수
public class Q10 {
	
	public static boolean solution(String s) {
		
        boolean answer = true;
        String smallS = s.toLowerCase();
        char p = 'p';
        char y = 'y';
        int countP = 0;
        int countY = 0;
        
        
        for(int i = 0; i < smallS.length(); i++) {
        	
            char charAt = smallS.charAt(i);
            
			if(p == charAt) {
                countP++;
            } else if(y == charAt) {
                countY++;
            } else if(!(p == charAt & y == charAt)) {
                answer = true;
            }
        }
        
        if(countP == countY) {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		
		System.out.println(solution("pPoooyY"));
		System.out.println(solution("Pyy"));
	}
}
