package DFS_BFS;

public class 여행경로 {
	static boolean[] v;
	static String result = "ICN";
	public static void main(String[] args) {
		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"},{"SFO", "ATL"}, {"ATL","ICN"}, {"ATL", "SFO"}};
		
		String[] answer = {};
		v = new boolean[tickets.length];
		dfs(0, "ICN", "ICN", tickets);
		answer = result.split(" ");
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}
	
	static void dfs(int cnt , String start, String travel, String[][] tickets) {
		if(cnt == tickets.length) {
			if(result.length() < travel.length()) {
				result = travel;
			}
			
			if(result.compareTo(travel) > 0) {
				result = travel;
			}
			
			return;
		}
		
		
		for(int i = 0; i < tickets.length; i++) {
			
			if(v[i]) {
				continue;
			}
			
			
			if(start.equals(tickets[i][0])) {
				v[i] = true;
				dfs(cnt +1 , tickets[i][1], travel + " " + tickets[i][1], tickets);
				v[i] = false;
			}
			
		}
		
	}
}
