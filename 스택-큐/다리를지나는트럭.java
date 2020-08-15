package 스택and큐;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		
		int answer = 0;
		int totalweight = 0;
		
		Queue<data> wait = new LinkedList<data>();
		Queue<data> driving = new LinkedList<data>();
		
		
		for(int i = 0; i < truck_weights.length; i++) {
			wait.offer(new data(truck_weights[i], 0));
		}
		
		
		while(!driving.isEmpty() || !wait.isEmpty()) {
			
			
			
			if(!driving.isEmpty() && driving.peek().sec == answer) {
				totalweight -= driving.poll().w;
			}
			
			
			
			if(!wait.isEmpty() && totalweight + wait.peek().w <= weight) {
				totalweight += wait.peek().w;
				driving.offer(new data(wait.poll().w , answer+bridge_length));
			}
			
			
			answer++;
			
		}
		
		System.out.println(answer);
		
	}
	
	
	static class data{
		int w;
		int sec;
		
		public data(int w , int sec) {
			this.w = w;
			this.sec = sec;
			
		}
	}
}
