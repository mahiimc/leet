public class IsSubsequence {
    public static void main(String[] args) {
        String s = "ace";
        String t = "abec";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s,  String t) {
        int i=0;
        for(int j=0;i<s.length()  && j<t.length();) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        return i == s.length()?true : false ;
    }
}