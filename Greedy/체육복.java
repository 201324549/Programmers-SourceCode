package Greedy;

public class 체육복 {
	public static void main(String[] args) {
		int n = 8;                                      // 전체 학생 수
		int [] lost = {4,5};							// 도난당한 학생들의 번후 
		int [] reserve = {5,6};						// 여벌을 챙겨온 학생들의 번호
		
		int answer = 0;									// 체육수업을 들을 수 있는 학생의 최댓값
		
		boolean v[] = new boolean[reserve.length];
		boolean v2[] = new boolean[lost.length];
		
		for(int i = 0; i < lost.length; i++) {
			for(int j = 0; j < reserve.length; j++) {
				if(lost[i] == reserve[j]) {
					v[j] = true;
					v2[i] = true;
				}
			}
		}
		
		for(int i = 0; i < lost.length; i++) {
			if(v2[i]) {
				continue;
			}
			
			for(int j = 0; j < reserve.length; j++) {
				if(v[j]) {
					if(j == reserve.length-1) {
						n --;
					}
					continue;
				}
				
				if(Math.abs(lost[i] - reserve[j]) == 1 || Math.abs(lost[i] - reserve[j]) == 0) {
					v[j] = true;
					break;
				}
				
				if(j == reserve.length-1) {
					n --;
				}
			}
		}
		answer = n;
		System.out.println(answer);
	}
}
