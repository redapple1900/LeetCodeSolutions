package test;

import deprecatedSolutions.EditDistance;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1="abcdefgfff";
		String word2="wwwwdefgf";
		EditDistance e=new EditDistance();
		System.out.println(e.minDistance(word1, word2));
	}

}
