import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        
        int[] digits = {2,0,1,9};
        int carry=0;
        for(int i=digits.length-1;i>=0;i--) {
            int digit = digits[i];
            int sum =  i == digits.length -1 ? digit + 1 : digit;
            sum = sum + carry;
            carry = sum/10;
            digit = sum % 10 ;
            digits[i] = digit;
        }
        if(carry != 0 ) {
            digits = Arrays.copyOf(digits, digits.length+1);
            digits[0] = carry;
        }
        System.out.println(Arrays.toString(digits));
    }
}
