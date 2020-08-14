package Programmers;

public class 단어변환 {
	static int result;
	static boolean[] v;
	public static void main(String[] args) {
		String begin = "aaas";
		String target = "asaa";
		String [] words = { "aass", "aasa", "saas", "ssas", "asas", "asaa", "assa"};
		
		
		int answer = 0;
		result = 123456789;
		v = new boolean[words.length];
		boolean flag = false;
		for(int i = 0; i < words.length; i++) {
			if(target.equals(words[i])) {
				flag = true;
				break;
			}
		}
		if(flag) {
			dfs(0, begin, target, words);			
		}
		
		if(result == 123456789){
            result = 0;
        }
		answer = result;
		System.out.println(answer);
	}
	
	static void dfs(int cnt, String begin, String target, String[] words) {
		if(begin.equals(target)) {
			if(result > cnt) {
				result = cnt;				
			}
			return;
		}
		
		
		for(int i = 0; i < words.length; i++) {
			if(v[i]) {
				continue;
			}
			int c = 0;
			for(int j = 0; j < words[i].length(); j++) {
				if(begin.charAt(j) == words[i].charAt(j)) {
					c++;
				}
			}
			if(c == 2) {
				v[i] = true;
				System.out.println(words[i]);
				dfs(cnt +1, words[i], target, words);
				v[i] = false;
			}
		}
	}
}
