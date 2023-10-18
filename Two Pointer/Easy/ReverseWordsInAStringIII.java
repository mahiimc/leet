public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String result = reverseWords(s);
        System.out.println(result.toString());
    }
    public static String reverseWords(String s) {

        int i=0,j=0;
        int k;
        int n = s.length();
        char charArr[] = s.toCharArray();
        while(j < n ) {
            while(j < n && charArr[j] != ' ') j++;
            k = j - 1 ; 
            while(i<k) {
                swap(charArr, i, k);
                i++;
                k--;
            }
            i = j + 1;
            j++;
        }

        return new String(charArr);
    }

    public static void swap(char[] arr , int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
}
