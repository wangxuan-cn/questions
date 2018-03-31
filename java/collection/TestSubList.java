import java.util.ArrayList;
import java.util.List;

/**
 * JDK中，List接口有一个实例方法List<E> subList(int fromIndex, int toIndex)，
 * 其作用是返回一个以fromIndex为起始索引（包含），以toIndex为终止索引（不包含）的子列表（List）。
 * 但值得注意的是，返回的这个子列表的幕后其实还是原列表；
 * 也就是说，修改这个子列表，将导致原列表也发生改变；反之亦然
 */
public class TestSubList {

    public static void main(String[] args) {
        List<Integer> test = new ArrayList<Integer>();
        //init list
        for (int i = 0; i < 5; i++) {
            test.add(i);    //auto boxing
        }
        //display the list
        System.out.print("the orginal list: ");
        for (int i = 0; i < test.size(); i++) {
            System.out.print(test.get(i) + " ");
        }
        System.out.println();

        //sub list
        List<Integer> sub = test.subList(1, 3);       //sub list contains elements: 1, 2
        sub.remove(1);      //remove element "2" from sub list

        //display the list again
        System.out.print("the orginal list after sublist modified: ");
        for (int i = 0; i < test.size(); i++) {
            System.out.print(test.get(i) + " ");
        }
        System.out.println();
    }

}
