public class Program_11 {
    public static void main (String[] args){
        String s = "hello";
        System.out.println(s);
    }

    public static String reverseString(String s){
        char[] arr = s.toCharArray(); 
        int left =0, right = arr.length - 1;
        while(left< right){
            char temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp; 
            left ++;
            right --;
        } 
        return new String(arr);
    }
}