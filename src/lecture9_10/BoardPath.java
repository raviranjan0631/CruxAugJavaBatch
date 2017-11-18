package lecture9_10;
import java.util.*;
public class BoardPath {
	public static void main(String[] args) {
		System.out.println(getBoardPaths(0, 3));
		System.out.println(countBoardPaths(0, 3));
	}
	public static void printBoardPaths(int s, int d, String path){
		if(s == d){
			System.out.println(path);
			return;
		}
		for(int i = 1;i<= 6 && s+i<=d ;i++){
			printBoardPaths(s+i, d, path+i);
		}
	}
	// program in array list
	public static ArrayList<String> getBoardPaths(int s, int d){
		if(s == d){
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}
		ArrayList<String> myList = new ArrayList<>();
		for(int i = 1;i<= 6 && s+i<=d ;i++){
			ArrayList<String> recList = getBoardPaths(s+i, d);
			for(int j = 0; j<recList.size();j++){
				String recString = recList.get(j);
				myList.add(i + recString);
			}
		}
		return myList;
	}	
	public static int countBoardPaths(int s , int d){
		if(s==d){
			return 1;
		}
		int count = 0;
		for(int i = 1;i<=6 && s+i<=d;i++){
			count+=countBoardPaths(s+i, d);
		}
		return count;
	}
}
