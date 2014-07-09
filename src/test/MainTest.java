package test;

import java.util.ArrayList;
import java.util.List;

import solutions.Triangle;
import deprecatedSolutions.EditDistance;

public class MainTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String word1="abcdefgfff";
		String word2="wwwwdefgf";
		EditDistance e=new EditDistance();
		System.out.println(e.minDistance(word1, word2));
		*/
		List<Integer> list=new ArrayList<Integer>();
		List<List<Integer>> gen	= new ArrayList<List<Integer>>();
		for (int i=0;i<5;i++){
			for (int j=0;j<=i;j++){
				list.add(j+1);
			}
			gen.add((List<Integer>) ((ArrayList<Integer>) list).clone());
		}
		Triangle t=new Triangle();
		System.out.print(t.minimumTotal(gen));		
	}
}
