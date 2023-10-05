public class ReverseVowles {

    public static void main(String[] args) {
        String s = "hello";
        String res = reverseVowels(s);
        System.out.println(res);
    }

    public static String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left < right) {
                while(left < s.length() && !isVowel(c[left])) left++;
                while(right > 0 && !isVowel(c[right])) right--;

                if(left < right ) {
                     char temp = c[right];
                        c[right] = c[left];
                        c[left] = temp;
                        right--;
                        left++;
                }
        }
        return new String(c);

    }

    public static boolean isVowel(char c ) {
        if(c == 'a'|| c == 'A' || c=='e' || c == 'E' || c == 'i'
                    || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c ==   'U' ) {
            return true;
        }
        return false;
    }
    
}
