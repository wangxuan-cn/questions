//描述：给我一个字符串，例如I love java,输出： java love I
public class StringReverse {  
      
    public void swap(char[] arr, int begin, int end) {  
        while(begin < end) {  
            char temp = arr[begin];  
            arr[begin] = arr[end];  
            arr[end] = temp;  
            begin++;  
            end--;  
        }  
    }  
    //I love java  
    public String swapWords(String str) {  
        char[] arr = str.toCharArray();  
        swap(arr, 0, arr.length - 1);  
        int begin = 0;  
        for (int i = 1; i < arr.length; i++) {  
            if (arr[i] == ' ') {  
                swap(arr, begin, i - 1);  
                begin = i + 1;  
            }  
        }  
  
        return new String(arr);  
    }  
      
    public static void main(String[] args) {  
        String str = "I love java";  
        System.out.println(new StringReverse().swapWords(str));  
    }  
  
}
