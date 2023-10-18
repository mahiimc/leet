public class ReverseString {
    public static void main(String[] args) {
        char[] c = {'h','e','l','l','o'};
        reverseString(c);
        for(char ch : c) {
            System.out.print(ch+" ");
        }
    }

    public static void reverseString(char[] s) {
        int j= s.length-1;
        for(int i=0;i<s.length/2;i++) {
             char temp = s[i];
             s[i] = s[j];
             s[j] = temp;
             j--;
        }
    }
}
