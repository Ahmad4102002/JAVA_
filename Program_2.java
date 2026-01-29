public class Program_2 {
    public static void main(String[] arg){
        String s = "123456789";
        int[] nums = {1,23,4,5,6,7,77,89,12};

        System.out.println(reverseString(s));
        System.out.println(maxElement(nums));

    }

    public static String reverseString(String s){
        char[] rev = s.toCharArray();
        int left = 0 , right = rev.length - 1;

        while (left < right){
            char temp = rev[left];
            rev[left] = rev[right];
            rev[right] = temp;
            left++;
            right--;
        }
        return new String(rev);

    }

    public static int maxElement(int[] nums){
        int max = 0;
        for(int value:nums){
            if (value > max){
                max = value;
            }
        }
        return max;
        
    }

}