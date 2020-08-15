package 스택and큐;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class 프린터 {
	public static void main(String[] args) {
		int[] priorities = { 1, 1, 9, 1, 1, 1};
		int location = 0;
		
		int answer = 0;
		Queue<data> q = new LinkedList<data>();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		Queue<data> result = new LinkedList<data>();
		for(int i = 0; i < priorities.length; i++) {
			q.offer(new data(priorities[i], i));
			pq.offer(priorities[i]);
		}
		
		while(!q.isEmpty()) {
			if(q.peek().num >= pq.peek()) {
				result.offer(q.poll());
				pq.poll();
			} else {
				q.offer(q.poll());
			}
		}
		
		while(true) {
			answer++;
			if(result.poll().location == location) {
				break;
			}
		}
		
		System.out.println(answer);
	}
	
	static class data{
		int num;
		int location;
		
		public data (int num, int location) {
			this.num = num;
			this.location = location;
		}
	}
}
