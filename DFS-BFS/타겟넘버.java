package Programmers;

public class Å¸°Ù³Ñ¹ö {
	
	static int result = 0;
	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		
		dfs(0, 0, target, numbers);
		System.out.println(result);
	}
	
	
	static void dfs(int sum ,int cnt, int tar, int[] num) {
		if(cnt == num.length) {
			if(sum == tar) {
				result ++;
			}
			return;
		}
		
		dfs(sum + num[cnt], cnt+1,tar, num);
		dfs(sum - num[cnt], cnt+1,tar, num);
	}
}
