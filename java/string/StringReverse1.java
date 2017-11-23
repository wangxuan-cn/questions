import java.util.*;

//描述：给我一个字符串，例如I love java,输出： java love I
public class StringReverse1 { 
  
    public static void main(String[] args) {            
        String str = "I love java";  
          
        String[] sArr = str.split(" ");//I love java  
          
        List<String> list = new ArrayList<String>();  
          
        list = Arrays.asList(sArr);
          
//      for(int i=0;i<sArr.length;i++){  
//          list.add(sArr[i]);  
//      }  
          
        Collections.reverse(list);  
          
        for(String word:list){  
            System.out.print(word+" ");  
        }  
    }  
} 
