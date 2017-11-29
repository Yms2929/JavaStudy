package javastudy;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
//		test.scanner();
		
		int[] score = new int[5];
		int temp = 10;
		
		for (int i = 0; i < score.length; i++) {
			score[i] = temp;
			temp += 10;
		}
		
//		test.array(score);	
		
		test.bingo();
	}
	
	public void scanner() {
		System.out.println("hello java");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int number = Integer.parseInt(input);
		
		System.out.println(number);
		scanner.close(); // ��ĳ�ʴ� in�� �ϸ� close ����� �Ѵ� �޸� ������
	}
	
	public void array(int[] score) {
		System.out.println(Arrays.toString(score)); // for �� ��� �迭 ���
		
		int[] number = new int[20];
		System.arraycopy(score, 0, number, 0, score.length); // score 0�� ���͸� number 0�� ���ͷ� score ���� ��ŭ �迭 ����
		System.out.println(Arrays.toString(number));
	}
	
	public void bingo() {
		int SIZE = 5;
		int x = 0, y = 0, num = 0;
		String[][] bingo = new String[SIZE][SIZE];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				bingo[i][j] = String.valueOf(i * SIZE + j + 1);
			}
		}
		
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);
				
				String temp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = temp;
			}
		}
		
		int turn = 1;
		String number;
		do {
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					System.out.printf("%2s ", bingo[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			
			if (turn == 1) {
				System.out.printf("1~%d�� ���ڸ� �Է��ϼ��� (����:0) 1���� ����>", SIZE*SIZE);
				turn--;
			}
			else if (turn == 0) {
				System.out.printf("1~%d�� ���ڸ� �Է��ϼ��� (����:0) 2���� ����>", SIZE*SIZE);
				turn++;
			}
			
			number = scanner.nextLine();
			
			outer:
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (bingo[i][j] == number) {
						if (turn == 0) {
							bingo[i][j] = "O";
						}
						else if (turn == 1) {
							bingo[i][j] = "X";
						}
						break outer;
					}
				}
			}
		} while (number != "0");
	}
	
}