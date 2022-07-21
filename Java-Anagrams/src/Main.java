import java.util.Scanner;

    class Solution {
    static boolean isAnagram(String a, String b) {
        int [] chars= new int [26];
        for(int i=0;i<chars.length;i++)chars[i]=0;

        if(a.length()==b.length())//enter only if strings' lengths are equal
        {
            for(int i=0;i<a.length();i++){
                int indA,indB;
                indA=(int)a.charAt(i)-65;//Alphabet starts at the 65th position of ascii table
                indB=(int)b.charAt(i)-65;
                if(indA>26)indA-=32;//If not capital, make it capital
                if(indB>26)indB-=32;
                chars[indA]++;
                chars[indB]--;
            }

            for(int i=0;i<chars.length;i++){
                if(chars[i]!=0) return false;
            }
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