package test;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import solutions.NextPermutation;
import solutions.WordBreak;

public class MainTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String word1="abcdefgfff";
		String word2="wwwwdefgf";
		EditDistance e=new EditDistance();
		System.out.println(e.minDistance(word1, word2));
		*/
		/*
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
		*/
		
		//int[] array={4,2,0,3,2,5};
		
		//LargestRectangleinHistogram lar= new LargestRectangleinHistogram();
		//System.out.print(lar.largestRectangleArea(array));
		//String S="";
		//String T="aaca";
		//System.out.print(minWindow(S,T));
		/*
		PalindromePartition pp= new PalindromePartition();
		List<List<String>> results= pp.partition(S);
		for (int i=0;i<results.size();i++){
			for (int j=0;j<results.get(i).size();j++)
				System.out.print(results.get(i).get(j)+" ");
			System.out.print("\n");
			
		}
		 	*/
		/*
		int[] array={5, 7, 7, 8, 8, 10};
		SearchForRange search = new SearchForRange();
		int[] result=search.searchRange(array, 8);
		System.out.print(result[0]+" "+result[1]);
		*/
		/*
		NextPermutation next = new NextPermutation();
		int[] array={3,2,1};
		next.nextPermutation(array);
		for (int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
			*/
		Set<String> set= new HashSet<String>();
		set.add("a");
		set.add("abc");
		set.add("bcde");
		set.add("cd");
		WordBreak wb = new WordBreak();
		System.out.print(wb.wordBreak("abcde", set));
		
	}
    public static String minWindow(String S, String T) {
        if (S.length()==0||T.length()==0) return null;
        
        String result="";
        
        int count_left=T.length();
        
        Deque<Integer> index_queue= new LinkedList<Integer>();
        
        Deque<Character> character_queue = new LinkedList<Character>();
        
        Map<Character,Integer> count_map= new HashMap<Character,Integer>();
        
        for (int i=0;i<T.length();i++){
            char temp_char= T.charAt(i);
            
            if (count_map.containsKey(temp_char))
                count_map.put(temp_char,count_map.get(temp_char)+1);
                
            else count_map.put(temp_char,1);
        }
        
        for (int i =0;i<S.length();i++){
            char temp_char= S.charAt(i);
            
            if (count_map.containsKey(temp_char)){
                int count = count_map.get(temp_char);
                
                count_map.put(temp_char,count-1);
                character_queue.add(temp_char);
                index_queue.add(i);
                
                if (count>0)
                    count_left--;
                if (count_left==0&&result=="")
                    result=S.substring(index_queue.peek(),index_queue.peekLast()+1);
            }
            else continue;

            if (!character_queue.isEmpty()&&temp_char==character_queue.peek()){
                    while(count_map.get(character_queue.peek())<0){
            			char discard_char=character_queue.poll();
            			index_queue.poll();
            			count_map.put(discard_char,count_map.get(discard_char)+1);
            		}
            String temp_result=S.substring(index_queue.peek(),index_queue.peekLast()+1);
            	 if (temp_result.length()<result.length())
            		result=temp_result;
            }                
        }
          return result;
    }
}
