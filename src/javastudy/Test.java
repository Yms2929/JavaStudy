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
		scanner.close(); // 스캐너는 in을 하면 close 해줘야 한다 메모리 누수됨
	}
	
	public void array(int[] score) {
		System.out.println(Arrays.toString(score)); // for 문 대신 배열 출력
		
		int[] number = new int[20];
		System.arraycopy(score, 0, number, 0, score.length); // score 0번 부터를 number 0번 부터로 score 길이 만큼 배열 복사
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
				System.out.printf("1~%d의 숫자를 입력하세요 (종료:0) 1번의 차례>", SIZE*SIZE);
				turn--;
			}
			else if (turn == 0) {
				System.out.printf("1~%d의 숫자를 입력하세요 (종료:0) 2번의 차례>", SIZE*SIZE);
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