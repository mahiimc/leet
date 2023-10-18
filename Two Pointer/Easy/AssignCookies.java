import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        /** 
        int[] j = {1,2,3};
        int[] s = {1,1};
        **/
          int[] j = {1,2,3};
          int[] s = {1,1};
         
        System.out.println("Count = "+findContentChildren(j, s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i=0;
        int j=0;
        while(i < g.length && j < s.length) {
            if(s[j] >= g[i]) {
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}