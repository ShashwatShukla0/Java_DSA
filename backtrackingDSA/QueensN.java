package backtrackingDSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueensN {
	
	public static boolean isSafe(int row, int col, char[][] boards) {
		//horizontal
		for(int j=0;j<boards.length;j++) {
			if(boards[row][j]=='Q') {
				return false;
			}
		}
		
		//vertical
		for(int i=0;i<boards.length;i++) {
			if(boards[i][col]=='Q') {
				return false;
			}
		}
		
		//Upper Left
		
		int r= row;
		for(int c=col; c>=0 && r>=0; r--, c--) {
			if(boards[r][c]=='Q') {
				return false;
			}
		}
		
		//Upper Right
		
		r=row;
		for(int c=col; c<boards.length && r>=0; c++,r--) {
			if(boards[r][c]=='Q') {
				return false;
			}
		}
		
		//Lower Left
		r=row;
		for(int c=col; c>=0 && r<boards.length;r++,c--) {
			if(boards[r][c]=='Q') {
				return false;
			}
		}
		
		//Lower Right
		r=row;
		for(int c=col; c<boards.length && r<boards.length;c++,r++) {
			if(boards[r][c]=='Q') {
				return false;
			}
		}
		
		
		return true;
	}
	
	public static void saveBoard(char[][] boards, List<List<String>> allBoards) {
		
		String row = "";
		
		List<String> newBoards = new ArrayList<>();
		
		for(int i=0;i<boards.length;i++) {
			row="";
			for(int j=0;j<boards[0].length;j++) {
				if(boards[i][j]=='Q') {
					row+= 'Q';
				}
				else
				{
					row+= '.';
				}
			}
			newBoards.add(row);
		}
	}
	
	public static void helper(char[][] boards, List<List<String>> allBoards, int col) {
		
		if(col==boards.length) {
			saveBoard(boards,allBoards);
			return;
		}
		
		for(int row=0;row<boards.length;row++) {
			if(isSafe(row,col,boards)) {
				boards[row][col] = 'Q';
				helper(boards,allBoards,col+1);
				boards[row][col] = '.';
			}
			
		}
		
		
	}
	
	public static List<List<String>> solveQueens(int n) {
		
		List<List<String>> allBoards = new ArrayList<>();
		
		char[][] boards = new char[n][n];
		
		helper(boards, allBoards,0);
		
		return allBoards;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		solveQueens(n);
		
		sc.close();

	}

}
