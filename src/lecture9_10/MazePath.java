package lecture9_10;

import java.util.ArrayList;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(countMazePath(0, 0, 2, 2));
		System.out.println(countMazePathWD(0, 0, 2, 2,""));

		//System.out.println(countMazePathWD2(0, 0, 2, 2));
		//countMazePathWD2(0, 0, 2, 2,"");
		//System.out.println(MazePathList(0, 0, 2, 2));
		
	}
	public static int countMazePath(int sr, int sc, int dr, int dc){
		if(sr == dc && sc == dc){
			return 1;
		}
		int count =0;
		if(sr<dr){
		count+=countMazePath(sr+1, sc, dr, dc);}
		if(sc<dc){
		count += countMazePath(sr, sc+1, dr, dc);}
	return count;
	}
	public static int countMazePathWD(int sr, int sc, int dr, int dc, String str){
		if(sr == dc && sc == dc){
			System.out.println(str);
			return 1;
		}
		int count =0;
		if(sr<dr){
		count+=countMazePathWD(sr+1, sc, dr, dc,str+'r');}
		if(sc<dc){
		count += countMazePathWD(sr, sc+1, dr, dc,str+'c');}
		if(sr<dr && sc<dc){
			count += countMazePathWD(sr+1, sc+1, dr, dc,str+'d');
		}
	return count;
	}
	public static int countMazePathWD2(int sr, int sc, int dr, int dc){
		if(sr == dc && sc == dc){
			return 1;
		}
		int count =0;
		if(sr<dr){
		count+=countMazePathWD2(sr+1, sc, dr, dc);}
		if(sc<dc){
		count += countMazePathWD2(sr, sc+1, dr, dc);}
		if(sr<=dr && sc<=dc && sc == sr){
			count += countMazePathWD2(sr+1, sc+1, dr, dc);
		}
	return count;
	}
	public static void countMazePathWD2(int sr, int sc, int dr, int dc, String s){
		if(sr == dc && sc == dc){
			System.out.println(s);
			return ;
		}
		int count =0;
		if(sr<dr){
		countMazePathWD2(sr+1, sc, dr, dc, s+"r");}
		if(sc<dc){
		countMazePathWD2(sr, sc+1, dr, dc, s+"c");}
		if(sr<=dr && sc<=dc && sc == sr){
			countMazePathWD2(sr+1, sc+1, dr, dc, s+"d");
		}
		
	}
	public static ArrayList<String> MazePathList(int sr, int sc, int dr, int dc){
		if(sr == dc && sc == dc){
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}
		ArrayList<String> reclist = new ArrayList<>();
		ArrayList<String> reclist1 = new ArrayList<>();
		ArrayList<String> reclist2 = new ArrayList<>();
		ArrayList<String> mylist = new ArrayList<>();
		if(sr<dr){
			reclist1 = MazePathList(sr+1, sc, dr, dc);
			for(int i = 0;i<reclist1.size();i++){
				reclist.add("v"+reclist1.get(i));
			}
		}
		if(sc<dc){
			reclist2 = MazePathList(sr, sc+1, dr, dc);}
			for(int i = 0;i<reclist2.size();i++){
			reclist.add("h"+reclist2.get(i));	}

	return reclist;
	
	}

}
