package test;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import solutions.MaxPointsOnALine;
import basicStructures.Point;

public class MainTest {

	
	public static void main(String[] args) {
		/*LinkedList Test
		ListNode node0 = new ListNode(0);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node4.next=node5;
		node3.next=node4;
		node2.next=node3;
		node1.next=node2;
		node0.next=node1;
		ListNode head=new ListNode(-1);
				head.next=node0;
		ListNode cursor=head.next;
		while(cursor!=null){
			System.out.print(cursor.val);
			cursor=cursor.next;
		}
		ReverseLinkedListII rll = new ReverseLinkedListII();
		head.next=rll.reverseBetween(head.next, 2, 5);	
		System.out.print("\n");
		 cursor=head.next;
		while(cursor!=null){
			System.out.print(cursor.val);
			cursor=cursor.next;
		}
		
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
		StrStr ss= new StrStr();
		System.out.print(ss.strStr("babba", "bbb"));
		/*
		String S ="aab";
		PalindromePartitionAlter pp= new PalindromePartitionAlter();
		System.out.print(pp.isPalindromes(S));
		List<List<String>> results= pp.partition(S);
		for (int i=0;i<results.size();i++){
			for (int j=0;j<results.get(i).size();j++)
				System.out.print(results.get(i).get(j)+" ");
			System.out.print("\n");
			
		}
		 	
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
		SimplifyPath sp = new SimplifyPath();
		System.out.print(sp.simplifyPath("/a/./b/../../../c/"));
		/*
		WildCardMatchingAlter wcma = new WildCardMatchingAlter();
		String a1="hi";
		String a2="*?";
		char[] c1= a1.toCharArray();
		char[] c2= a2.toCharArray();
		//System.out.print(wcma.isMatch(a1, a2));
		
		SearchInsertPosition sip = new SearchInsertPosition();
		int[] array={1,3,5,6};
		System.out.print(sip.searchInsert(array, 3));
		/*
		Set<String> set= new HashSet<String>();
		set.add("cat");
		set.add("cats");
		set.add("sand");
		set.add("and");
		set.add("dog");
		WordBreakII wb = new WordBreakII();
		System.out.print(wb.wordBreak("catsanddog", set));
		
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
		/*
		String[] array={"hot","dog"};
		Set<String> set= new TreeSet<String>();
		for (String str:array)
			set.add(str);
		String start="hot";
		String end="dog";
		
		WordLadderII wl= new WordLadderII();
		PassedWordLadderII wl2 = new PassedWordLadderII();
		WordLadderIIOld wlo = new WordLadderIIOld();
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
		System.out.print("\n");
		
		t1=System.currentTimeMillis();
		for (int i=0;i<500;i++)
			wlo.findLadders(start, end, set);
		 t2=System.currentTimeMillis();
		System.out.print("Consumes: "+(t2-t1)+"\n");
		System.out.print(wlo.findLadders(start, end, set));
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
		//PermutationSequence ps= new PermutationSequence();
		//System.out.print(ps.getPermutation(6, 720));
		
		//ScrambleString ss= new ScrambleString();
		//System.out.print(ss.isScramble("ab", "ba"));
		
		//Power p=new Power();
		//System.out.print(p.pow(8.84372, -5));
		//int[] array = { 6, 1, 3, 2, 4, 15, 6, 10, 8 };
		//BestTime2BuyandSellStock b = new BestTime2BuyandSellStock();
		//System.out.print(b.maxProfit(array));
		//String n = "301";
		//DecodeWays dw= new DecodeWays();
		//System.out.print(dw.numDecodings(n));
		//LongestPalindromeSubstring lps= new LongestPalindromeSubstring();
		//String test="abacedfg";
		//System.out.print(lps.longestPalindrome(test));
		//String[] s= {"dog","cat","god","tac","ttt"};
		//Anagrams a = new Anagrams();
		//System.out.print(a.anagrams(s));
		//int[] array={1,-2,-5,-4,-3,3,3,5};
		//ThreeSum ts = new ThreeSum();
		//System.out.print(ts.threeSum(array));
		//FourSum fs= new FourSum();
		//System.out.print(fs.fourSum(array, -11));
		//IntegerToRoman itr = new IntegerToRoman();
		//System.out.print(itr.intToRoman(2014));
		//RegularExpressionMatching rem= new RegularExpressionMatching();
		//System.out.print(rem.isMatch("", ".*"));
		//Atoi atio = new Atoi();
		//System.out.print(atio.atoi(" -1123u3761867"));
		/*
		AddBinaryOld abo = new AddBinaryOld();
		AddBinaryAlter aba= new AddBinaryAlter();
		AddBinary ab= new AddBinary();
		String t1="1110101010100101110110011110101";
		String t2="100010101000100010011111010110101010010";
		String t3="1101010101010111101111111111111101";
		String t4="111001010
		01000111111";
		*/
		//LetterCombinations lc= new LetterCombinations();
		//System.out.print(lc.letterCombinations("23"));
		/*
		PermutationII p2= new PermutationII();
		int[] array={1,1,1,1,1,1,2};
		System.out.print(p2.permuteUnique(array));
		*/
		/*
		String[] words ={"What","must","be","shall","be."};
		TextJustification tj = new TextJustification();
		System.out.print(tj.fullJustify(words, 16));
		/*
		MultiplyStrings ms = new MultiplyStrings();
		System.out.print(ms.multiply("54321", "12345"));
		
		*/
		MaxPointsOnALine mpol=new MaxPointsOnALine();
		Point[] points= {new Point(0,1),new Point(0,6),new Point(0,9),new Point(0,8)};
		System.out.print(mpol.maxPoints(points));
		
		/*
		MedianOfTwoSortedArrays mtsa= new MedianOfTwoSortedArrays();
		int[] a ={1,2,3};
		int[] b ={1,2,2};
		System.out.print(mtsa.findMedianSortedArrays(a, b));
		
		/*
		SurroundedRegions sr = new SurroundedRegions();
		String[] a = {"XXXX","XOOX","XXOX","XOXX"};
		char[][] board=new char[4][];
		for (int i=0;i<a.length;i++)
			board[i]=a[i].toCharArray();
		for (int i=0;i<4;i++){
			for (int j=0;j<4;j++)
				System.out.print(board[i][j]);
			System.out.print("\n");
		}
		sr.solve(board);
		for (int i=0;i<4;i++){
			for (int j=0;j<4;j++)
				System.out.print(board[i][j]);
			System.out.print("\n");
		}

		/*  Sudoku
		String[] b={"53..7....","6..195...",".98....6.","8...6...3","4..8.3..1","7...2...6",".6....28.","...419..5","....8..79"};
		char[][] board=new char[9][];
		for (int i=0;i<9;i++)
			if (b[i].length()!=9)
				System.out.print("Problem");
		for (int i=0;i<9;i++)
			board[i]=b[i].toCharArray();
		for (int i=0;i<9;i++){
			for (int j=0;j<9;j++)
				System.out.print(board[i][j]);
			System.out.print("\n");
		}
		SudokuSolver ss= new SudokuSolver();
		ss.solveSudoku(board);
		for (int i=0;i<9;i++){
			for (int j=0;j<9;j++)
				System.out.print(board[i][j]);
			System.out.print("\n");
		}
		ValidSudoku vs = new ValidSudoku();
		System.out.print(vs.isValidSudoku(board));
		String[] c={"109748632","735026184","426139057","317690248","264317590","098452361","940863725","572904816","681275903"};
		for (int i=0;i<9;i++)
			board[i]=c[i].toCharArray();
		System.out.print(vs.isValidSudoku(board));
		/*
		String[] board={".87654321","2........","3........","4........","5........","6........","7........","8........","9........"};
		String[] board2={"..4...63.",".........","5......9.","...56....","4.3.....1","...7.....","...5.....",".........","........."};
		char[][] b=new char[9][];
		for (int i=0;i<9;i++)
			b[i]=board2[i].toCharArray();
		ValidSudoku vs = new ValidSudoku();
		ValidSudokuAlter vsa= new ValidSudokuAlter();
		
		long t1=System.currentTimeMillis();
		for (int i=0;i<100000;i++)
		vs.isValidSudoku(b);
		long t2=System.currentTimeMillis();
		System.out.print("Consumes: "+(t2-t1)+"\n");
		
		t1=System.currentTimeMillis();
		for (int i=0;i<100000;i++)
		vsa.isValidSudoku(b);
		 t2=System.currentTimeMillis();
		System.out.print("Consumes: "+(t2-t1)+"\n");
		
		/*
		long l1=System.currentTimeMillis();
		for (int i=0;i<1000000;i++){
			
			abo.addBinary(t1,t2);
			abo.addBinary(t3, t4);
			
		}
		System.out.print("ABO:"+(System.currentTimeMillis()-l1)+"\n");
		l1=System.currentTimeMillis();
		for (int i=0;i<1000000;i++){
			ab.addBinary(t1,t2);
			ab.addBinary(t3, t4);
			
		}
		System.out.print("AB:"+(System.currentTimeMillis()-l1)+"\n");
		l1=System.currentTimeMillis();
		for (int i=0;i<1000000;i++){
			aba.addBinary(t1,t2);
			aba.addBinary(t3, t4);
			
		}
		System.out.print("ABA:"+(System.currentTimeMillis()-l1)+"\n");
		*/
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
