public class IndexOfFirstOccurrenceInAString {
    
    public static int strStr( String hayStack , String needle ) {

        if(needle.length() == 1) {
            return hayStack.indexOf(needle);
        }

        for(int i=0;i<hayStack.length()-needle.length();i++) {
            int j = i + needle.length();
            String sub = hayStack.substring(i, j);
            if(needle.equalsIgnoreCase(sub)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String hayStack = "a";
        String needle = "a";
        System.out.println("Index :: " +strStr(hayStack, needle));
    }
}
