package Programmers;

public class 네트워크 {
	static int parent[];
	static int count;
	
	public static void main(String[] args) {
		int n = 3;
		
		int[][] computers = {
				{1,1,0}, {1,1,1}, {0,1,1}	
		};
		int answer = 0;
		count = n;
		parent = new int[n];
		makeSet();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j) {
					continue;
				}
				if(computers[i][j] == 0) {
					continue;
				}
				
				union(i,j);
			}
		}
		answer = count;
	}
	
	static void makeSet() {
		for(int i = 0; i < parent.length; i++) {
			parent[i] = i;
		}
	}
	
	static int findSet(int x) {
        if(x == parent[x]) {
            return x;
        }
        int nx = findSet(parent[x]);
        parent[x] = nx;
        return nx;
    }
     
    static void union(int x , int y) {
        x = findSet(x);
        y = findSet(y);
        if(y == x) {
            return;
        }
        count--;
        parent[y] = x;
    }
}
