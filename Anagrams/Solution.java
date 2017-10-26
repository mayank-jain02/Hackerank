import java.io.*;
import java.util.*;

public class Solution {
	 static boolean isAnagram(String a, String b) {
	        // Complete the function
	         // Complete the function
		 	a = a.toLowerCase();
		 	b = b.toLowerCase();
	        List<Character> aa = new ArrayList<Character>();
	        List<Character> bb = new ArrayList<Character>();
	        char[] stringToArraya = a.toCharArray();
	        char[] stringToArrayb = b.toCharArray();
	        for(char c : stringToArraya){
	            aa.add(c);
	        }
	        for(char c : stringToArrayb){
	            bb.add(c);
	        }
	        Collections.sort(aa);
	        Collections.sort(bb);
	        if(aa.equals(bb)){
	            return true;
	        }
	        return false;
	    }
	 public static void main(String[] args) {
		    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
}
