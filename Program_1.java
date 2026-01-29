public class Program_1 {
    public static void main(String[] args){
        String s = "Hello World";
        int[] arr = {1,2,3,4,5};
        System.out.println("Hello");

        System.out.println (add(9,4));

        returnstring(s);
        returnArray(arr);
        returnstring(reverseString(s));

    }

    public static int add(int a, int b){
        return a+b;

    
    }

    public static void returnstring(String s){
        for (int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
    public static void returnArray(int[] arr ){
        for (int value : arr){
            System.out.println(value);
        }
    }

    public static String reverseString(String s){
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length -1;

        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right--;
        }

        return new String(arr);

    }
}