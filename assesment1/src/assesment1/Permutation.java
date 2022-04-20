package assesment1;



public class Permutation {
	
	
	
	  static void printPermutation(String chr, String out)
    {
 
        if (chr.length() == 0) {
        	
            System.out.println(out + " ");
            return;
            
        }
 
        for (int i = 0; i < chr.length(); i++) {
 
            char ch = chr.charAt(i);
 
            String row = chr.substring(0, i) + chr.substring(i + 1);
 
            printPermutation(row, out + ch);
        }
    }
 
    public static void main(String[] args)
    {
    
        printPermutation("cat", " ");
    }
}