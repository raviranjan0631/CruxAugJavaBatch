package lecture11;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecursionNQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[4][4];
		System.out.println(countNQueens(board, 0));
		pathNQueens(board, 0, "");
		System.out.println(NQueensList(board, 0));
	}
	public static int countNQueens(boolean[][] board,int row){
		if(row == board.length){
			return 1;
		}
		int count =0;
		for(int col = 0;col<board[0].length;col++){
			if(isSafeTPQ(board, row, col)){
			board[row][col] = true;
			count+=countNQueens(board, row+1);
			board[row][col] = false;}
		}
	
	return count;
	}
	public static boolean isSafeTPQ(boolean[][] board , int row, int col){
		for(int i = row-1;i>=0;i--){
			if(board[i][col])
				return false;
		}
		for(int i = row-1,j=col+1;i>=0&&j<board[0].length;i--,j++){
			if(board[i][j])
				return false;
		}
		for(int i = row-1,j=col-1;i>=0&&j>=0;i--,j--){
			if(board[i][j])
				return false;
		}
		return true;
	}
	public static void pathNQueens(boolean[][] board,int row, String s){
		if(row == board.length){
			System.out.println(s);
			return ;
		}
		int count =0;
		for(int col = 0;col<board[0].length;col++){
			if(isSafeTPQ(board, row, col)){
			board[row][col] = true;
			pathNQueens(board, row+1,s+"("+row+","+col+")"+"  ");
			board[row][col] = false;}
		}
	
	}
	public static ArrayList<String> NQueensList(boolean[][] board,int row){
		if(row == board.length){
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}
		ArrayList<String> myList = new ArrayList<>();
		for(int col = 0;col<board[0].length;col++){
			if(isSafeTPQ(board, row, col)){
			board[row][col] = true;
			ArrayList<String> recList= NQueensList(board, row+1);
			for(int i = 0;i<recList.size();i++){
				String s = recList.get(i);
				myList.add("("+row+","+col+")"+s);
			}
			board[row][col] = false;
			
			}
		}
	return myList;
	}
}
