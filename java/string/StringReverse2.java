//输入一个字符串，例如"abcd",输出"dcba"
public class StringReverse2 {  
      
    public static String reverse(String str){  
        return new StringBuilder(str).reverse().toString();  
    }
    
    public static String reverse1(String str) {
  			StringBuilder sb = new StringBuilder();
  
        for (int i = str.length() - 1; i >= 0; i--) {                
            char c = str.charAt(i);  
            sb.append(c);
        }
        return sb.toString();  
    }
      
    public static void main(String[] args) {  
        String str = "a b c d";  
        System.out.println(reverse(str));
        System.out.println(reverse1(str));
    }  
  
}
