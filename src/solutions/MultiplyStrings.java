package solutions;

import java.util.Arrays;

public class MultiplyStrings {
	int[] calc;	
	int length;
    public String multiply(String num1, String num2) {
    	//Initial Check
    	if (num1==null||num2==null||num1.length()==0||num2.length()==0)
    		return null;
    	//Setup
    	length=num1.length()+num2.length();
        calc=new int[length];
        Arrays.fill(calc, 0);
        //Do the work
        for (int i=num1.length()-1;i>=0;i--)
        	for (int j=num2.length()-1;j>=0;j--)
        		addChar(multiplyChar(num1.charAt(i),num2.charAt(j)),length-2-i-j);
        //Data marshalling
        char[] results = new char[length];
        for (int i=0;i<length;i++)
        	results[i]=(char) (calc[i]+'0');
        //Find the first Non-zero
        int i=0;
        while (results[i]=='0'&&i<length-1) i++;
        
        return new String(results,i,length-i);
    }
    private int multiplyChar(char num1,char num2){
    	int n1=num1-'0',n2=num2-'0';
    	int sum=n1*n2;    		
    	return sum;  
    	
    }
    private void addChar(int sum,int shift){

    	int i=length-1-shift;
    	while(sum>0){
    		sum+=calc[i];
    		calc[i--]=sum%10;
    		sum/=10;
    	}    	
    }
}
