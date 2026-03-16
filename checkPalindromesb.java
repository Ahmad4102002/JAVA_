//check palindrome using stringbuilder

public class checkPalindromesb {
    public static void main(String[] args) {
        String s = "madams";
        StringBuilder sb = new StringBuilder(s);
        
        int left = 0, right = sb.length() - 1;

        while (left < right){
            if (sb.charAt(left) != sb.charAt(right)){
                System.out.println("NOT PALINDROME");
                    return ; 

            }
            left ++;
            right--;
        }
        System.out.println("OK");



    }
}