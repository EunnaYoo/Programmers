package programmers.java;

import java.util.Calendar;

// 2016년
public class Q8 {
	
	public static String solution(int a, int b) {
		
		String answer = "";
		
		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, (a-1));
		cal.set(Calendar.DATE, b);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		switch(week) {
		case 1:
			answer = "SUN";
			break;
		case 2:
			answer = "MON";
			break;
		case 3:
			answer = "TUE";
			break;
		case 4:
			answer = "WED";
			break;
		case 5:
			answer = "THU";
			break;
		case 6:
			answer = "FRI";
			break;
		case 7:
			answer = "SAT";
		}
		
		return answer;
	}

	// 테스트 코드
	public static void main(String[] args) {
		
		System.out.println(solution(5, 24));

	}
}
