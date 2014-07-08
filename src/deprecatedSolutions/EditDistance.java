package deprecatedSolutions;
public class EditDistance {
    public int minDistance(String word1, String word2) {
        if (word1==null||word2==null) return 0;
        String shortword;
        String longword;
        if (word1.length()<word2.length()){
            shortword=word1;
            longword=word2;
        }else {
            shortword=word2;
            longword=word1;
        }
        
        int count=0;
        for (int i=0;i<shortword.length();i++){
            int currentcount=0;
            for (int j=i;j<shortword.length();j++)
            if (shortword.codePointAt(j)==longword.codePointAt(j-i)) currentcount++;
            if (currentcount>count) count=currentcount;
        }
        for (int i=0;i<longword.length();i++){
            int currentcount=0;
            for (int j=i;j<Math.min(shortword.length()+i,longword.length());j++)
                if (longword.codePointAt(j)==shortword.codePointAt(j-i)) currentcount++;
            if (currentcount>count) count=currentcount;
        }
        
        return (shortword.length()+longword.length()-count);
         // return count;  
                    
        
    }
}
