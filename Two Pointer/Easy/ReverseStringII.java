public class ReverseStringII {

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 3;
        System.out.println(reverseStr(s, k));
    }

    public static String reverseStr( String s, int k ) {
        char[] ch = s.toCharArray();
        for(int i=0; i<s.length()-1;i+=2*k) {
            int start = i;
            int end = Math.min(i+k-1, s.length()-1);
            while( start < end ) {
                char temp = ch[start];
                ch[start++] = ch[end];
                ch[end--] = temp;
            }
        }
        return new String(ch);
    }
}
