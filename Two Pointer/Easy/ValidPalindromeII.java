public class ValidPalindromeII {
    public static void main(String[] args) {
        String  s = "abc";
        System.out.println(validPalindrome(s));

    }

    public static boolean validPalindrome(String s) {
        
        int left = 0;
        int right = s.length()-1;
        int count = 0;
        while(left < right ) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }
            else {
               left++;
            }
         }
       
        return (s.length() -(left + right )) == 1 || count == 1;

    }
}
