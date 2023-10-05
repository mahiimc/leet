public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "A.";
        System.out.println(isPalindrome(s));
    }
    
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while( left < right ) {

            while(left < s.length() -1  && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while(right >= 1 && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if(left < right ) {
                char leftChar = Character.toLowerCase(s.charAt(left));
                char rightChar = Character.toLowerCase(s.charAt(right));
                if(leftChar != rightChar ) {
                    return false;
                }
            }
            left++;
            right--;
        }
        return true;
    }
}
