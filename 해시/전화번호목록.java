package Programmers;

import java.util.*;
public class ��ȭ��ȣ��� {
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};								// ��ȭ��ȣ ���
		boolean answer = true;
		Arrays.sort(phone_book);																// ��ȭ��ȣ ����� �������� ����
		abc : for(int i = 0; i < phone_book.length-1; i++){
			for(int j = i+1; j < phone_book.length; j++){
				if(phone_book[i].length() < phone_book[j].length()){
					if(phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))){	// ���λ� Ȯ���Ѵ�.
						answer = false;																// ���� ��� false �� ���� ��
						break abc;																	// ����
					}
				}
			}
		}
		System.out.println(answer);																	// ����� ����Ѵ�.
	}
}
