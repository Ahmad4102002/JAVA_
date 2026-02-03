// PALINDROME CHECK

public class Program_12 {
    public static void main(String[] args){
        String s = "lonnol";
        System.out.println(checkPalindrome(s));
    
    }

    public static boolean checkPalindrome(String s){
        char[] arr = s.toUpperCase().toCharArray();
        int left = 0, right = arr.length -1;

        while(left < right){
            if (arr[left] != arr[right]){
                return false;
            }
            
            left++;
            right--;


        }

    return true;
    }
}