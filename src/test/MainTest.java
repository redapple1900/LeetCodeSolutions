package test;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import solutions.LRUCache;
import solutions.PermutationSequence;
import solutions.Queens;
import solutions.QueensII;

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
		/*
		Set<String> set= new HashSet<String>();
		set.add("a");
		set.add("abc");
		set.add("bcde");
		set.add("cd");
		WordBreak wb = new WordBreak();
		System.out.print(wb.wordBreak("abcde", set));
		*/
		/*
		char[][] array= {{'a','b'},{'c','d'}};
		String word="abcd";
		WordSearch ws = new WordSearch();
		System.out.print(ws.exist(array, word));
		*/
		/*
		String s1="cbcccbabbccbbcccbbbcabbbabcababbbbbbaccaccbabbaacbaabbbc";
		String s2="abcbbcaababccacbaaaccbabaabbaaabcbababbcccbbabbbcbbb";
		String s3="abcbcccbacbbbbccbcbcacacbbbbacabbbabbcacbcaabcbaaacbcbbbabbbaacacbbaaaabccbcbaabbbaaabbcccbcbabababbbcbbbcbb";
		Interleave in = new Interleave();
		System.out.print(in.isInterleave(s1, s2, s3));
		*/
		/*
		 * WordLadderII test,still need work 08.05.2014 @Yuanwei
		 */
		/*
		String[] array={"dose","ends","dine","jars","prow","soap","guns","hops","cray","hove","ella","hour","lens","jive","wiry","earl","mara","part","flue","putt","rory","bull","york","ruts","lily","vamp","bask","peer","boat","dens","lyre","jets","wide","rile","boos","down","path","onyx","mows","toke","soto","dork","nape","mans","loin","jots","male","sits","minn","sale","pets","hugo","woke","suds","rugs","vole","warp","mite","pews","lips","pals","nigh","sulk","vice","clod","iowa","gibe","shad","carl","huns","coot","sera","mils","rose","orly","ford","void","time","eloy","risk","veep","reps","dolt","hens","tray","melt","rung","rich","saga","lust","yews","rode","many","cods","rape","last","tile","nosy","take","nope","toni","bank","jock","jody","diss","nips","bake","lima","wore","kins","cult","hart","wuss","tale","sing","lake","bogy","wigs","kari","magi","bass","pent","tost","fops","bags","duns","will","tart","drug","gale","mold","disk","spay","hows","naps","puss","gina","kara","zorn","boll","cams","boas","rave","sets","lego","hays","judy","chap","live","bahs","ohio","nibs","cuts","pups","data","kate","rump","hews","mary","stow","fang","bolt","rues","mesh","mice","rise","rant","dune","jell","laws","jove","bode","sung","nils","vila","mode","hued","cell","fies","swat","wags","nate","wist","honk","goth","told","oise","wail","tels","sore","hunk","mate","luke","tore","bond","bast","vows","ripe","fond","benz","firs","zeds","wary","baas","wins","pair","tags","cost","woes","buns","lend","bops","code","eddy","siva","oops","toed","bale","hutu","jolt","rife","darn","tape","bold","cope","cake","wisp","vats","wave","hems","bill","cord","pert","type","kroc","ucla","albs","yoko","silt","pock","drub","puny","fads","mull","pray","mole","talc","east","slay","jamb","mill","dung","jack","lynx","nome","leos","lade","sana","tike","cali","toge","pled","mile","mass","leon","sloe","lube","kans","cory","burs","race","toss","mild","tops","maze","city","sadr","bays","poet","volt","laze","gold","zuni","shea","gags","fist","ping","pope","cora","yaks","cosy","foci","plan","colo","hume","yowl","craw","pied","toga","lobs","love","lode","duds","bled","juts","gabs","fink","rock","pant","wipe","pele","suez","nina","ring","okra","warm","lyle","gape","bead","lead","jane","oink","ware","zibo","inns","mope","hang","made","fobs","gamy","fort","peak","gill","dino","dina","tier"};
		Set<String> set= new TreeSet<String>();
		for (String str:array)
			set.add(str);
		String start="nape";
		String end="mild";
		WordLadderII wl= new WordLadderII();
		PassedWordLadderII wl2 = new PassedWordLadderII();
		long t1=System.currentTimeMillis();
		for (int i=0;i<500;i++)
			wl.findLadders(start, end, set);
		long t2=System.currentTimeMillis();
		System.out.print("Consumes: "+(t2-t1)+"\n");
		System.out.print(wl.findLadders(start, end, set));
		System.out.print("\n");
		t1=System.currentTimeMillis();
		for (int i=0;i<500;i++)
			wl2.findLadders(start, end, set);
		 t2=System.currentTimeMillis();
		System.out.print("Consumes: "+(t2-t1)+"\n");
		System.out.print(wl2.findLadders(start, end, set));
		*/
		/*
		String s="barfoothefoobarman";
		String[] l = {"foo","bar"};
		*/
		/* SubstringwithConcetanantion
		String s="lingmindraboofooowingdingbarrwingmonkeypoundcake";
		String[] l={"fooo","barr","wing","ding","wing"};
		SubstringWithConcatenation  swc= new SubstringWithConcatenation();
		long t1=System.currentTimeMillis();
		System.out.print(swc.findSubstring(s, l));
		long t2=System.currentTimeMillis();
		System.out.print("Consumes: "+(t2-t1)+"\n");
		*/
		//combination sum II
		/*
		int[] num={1,1};
		int target =2;
		CombinationSum2 cs2 = new CombinationSum2();
		long t1=System.currentTimeMillis();
		System.out.print(cs2.combinationSum2(num, target));
		long t2=System.currentTimeMillis();
		System.out.print(" Consumes: "+(t2-t1)+"\n");
		*/
		/*
		QueensII q= new QueensII();
		
		for (int i=0;i<=18;i++){
			long t1=System.currentTimeMillis();
			System.out.print("When n="+i+" Total Solution = "+q.totalNQueens(i)+" ");
			long t2=System.currentTimeMillis();
			System.out.print("Consumes: "+(t2-t1)+"\n");
		}
		*/
		/*
		Queens q= new Queens();
		
		for (String[] strings:q.solveNQueens(8)){
			for (String string:strings)
				System.out.print(string+"\n");
			System.out.print("\n");
		}
		/*
		LRUCache lru = new LRUCache(2);
		
		System.out.print(lru.get(2));
		lru.set(2,5);
		System.out.print(lru.get(2));
		lru.set(1,2);
		lru.set(3,7);
		System.out.print(lru.get(1));
		System.out.print(lru.get(2));
		lru.set(1, 98);
		System.out.print(lru.get(3));
		System.out.print(lru.get(3));
		System.out.print(lru.get(1));
		*/
		PermutationSequence ps= new PermutationSequence();
		System.out.print(ps.getPermutation(6, 720));
		
	}
    public  String minWindow(String S, String T) {
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
