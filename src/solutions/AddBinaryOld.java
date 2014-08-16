package solutions;

public class AddBinaryOld {

	    public String addBinary(String a, String b) {
	        char[] char_long;
	    	char[] char_short;
	    	if (a.length()==0||b.length()==0) return null;
	    	else if (a.length()>b.length()){
	           char_long=a.toCharArray();
	             char_short=b.toCharArray();
	    	}else {
	    		 char_long=b.toCharArray();
	             char_short=a.toCharArray();
	    	}
	        char add='0';
	        for(int i=char_short.length-1;i>=0;i--){
	        	if (add=='1'){
	        		if (char_short[i]=='0') {
	        			char_short[i]='1';
	        			add='0';
	        		}else if (char_short[i]=='1'){
	        			char_short[i]='0';
	        		}
	        	}
	        	if (char_short[i]=='1'&&char_long[i+char_long.length-char_short.length]=='1'){
	        		char_long[i+char_long.length-char_short.length]='0';
	        		add='1';
	        	}else if (char_short[i]=='1'){
	        		char_long[i+char_long.length-char_short.length]='1';
	        	}else continue;
	        }
	        
	        int i=char_long.length-char_short.length-1;
	        while (add=='1'&&i>=0){
	        	if (char_long[i]=='1'){
	        		char_long[i]='0';
	        	}else {
	        		char_long[i]='1';
	        		add='0';
	        	}
	        	i--;
	        }
	        
	        if (add=='1'){
	        	char[] result = new char[char_long.length+1];
	        	for (int j=0;j<char_long.length;j++){
	        		result[j+1]=char_long[j];
	        	}
	        	result[0]='1';
	        	return new String(result);
	        }
	        
	     return new String(char_long); 
	        
	        
	    }
	}


