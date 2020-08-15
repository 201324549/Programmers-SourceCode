package 완전탐색;

public class 모의고사 {
	public static void main(String[] args) {
		int[] answers = {1,3,2,4,2,3,2,1};
		
		int[] answer = {};
		int[] score = new int[3];
		int[] one = {1, 2 ,3 ,4 ,5};
 		int[] two = {2,1,2,3,2,4,2,5};
		int[] thr = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		
		
		for(int i = 0; i < answers.length; i++) {
			if(answers[i]  == one[i % 5]) {
				score[0] ++;
			}
			
			if(answers[i] == two[i % 8]) {
				score[1] ++;
			}
			if(answers[i] == thr[i % 10]) {
				score[2] ++;
			}
			
			
			
			
		}
		
		int max = 0;
		for(int i = 0; i < 3; i++) {
			if(max < score[i]) {
				max = score[i];
			}
		}
		int count = 0;
		
		for(int i = 0; i < 3; i++) {
			if(max == score[i]) {
				count++;				
			}
		}
		answer = new int[count];
		
		count = 0;
		for(int i = 0; i < 3; i++) {
			if(max == score[i]) {
				answer[count] = (i+1);
				count++;
			}
		}
		
		
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
			
		}
		System.out.println();
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
			
		}
		
		
				
				
	
	}
}
