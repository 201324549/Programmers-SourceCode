package Programmers;

import java.util.*;
public class 전화번호목록 {
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};								// 전화번호 목록
		boolean answer = true;
		Arrays.sort(phone_book);																// 전화번호 목록을 오름차순 정렬
		abc : for(int i = 0; i < phone_book.length-1; i++){
			for(int j = i+1; j < phone_book.length; j++){
				if(phone_book[i].length() < phone_book[j].length()){
					if(phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))){	// 접두사 확인한다.
						answer = false;																// 있을 경우 false 로 변경 후
						break abc;																	// 종료
					}
				}
			}
		}
		System.out.println(answer);																	// 결과를 출력한다.
	}
}
