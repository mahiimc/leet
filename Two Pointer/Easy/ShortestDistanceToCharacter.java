public class ShortestDistanceToCharacter {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        int[] res = shortestToChar(s, c);
        for(int num : res) {
            System.out.print(num+" ");
        }
    }

    public static int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
       
        int i=0;
        int j=1;
        while(i < j ) {
            if(s.charAt(i) == c) {
                res[i] = 0;
            }
            else {
                while(s.charAt(j) != c) {
                    j++;
                }
                res[i] = (int) Math.abs(i-j);
            }
           
            i++;
            j = i+1;
        }
        return res;
    }
}