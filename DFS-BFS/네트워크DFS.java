package Programmers;

public class 네트워크DFS {
	public static void main(String[] args) {
		int n = 3;
		
		int[][] computers = {
				{1,1,0}, {1,1,1}, {0,1,1}	
		};
		int answer = 0;
		boolean visit[][] = new boolean[n][n];
		boolean check[] = new boolean[n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j ) {
					continue;
				}
				if(computers[i][j] == 0) {
					continue;
				}
				if(visit[i][j]) {
					continue;
				}
				visit[i][j] = true;
				visit[j][i] = true;
				check[i] = true;
				check[j] = true;
				dfs(visit, check, computers, j );
				answer++;
			}
		}
		for(int i = 0; i < check.length; i++) {
			if(!check[i]) {
				answer++;
			}
		}
		System.out.println(answer);
	}
	
	static void dfs(boolean[][] v, boolean[] c,int[][] com, int num ) {
		for(int i = 0; i < com.length; i++) {
			if(i == num) {
				continue;
			}
			if(com[num][i] == 0) {
				continue;
			}
			if(v[num][i]) {
				continue;
			}
			v[num][i] = true;
			v[i][num] = true;
			c[num] = true;
			c[i] = true;
			dfs(v, c, com, i);
			
		}
	}
}
