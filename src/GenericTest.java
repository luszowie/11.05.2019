/*
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {


        //Pair<String, Integer> p1 = new OrderedPair<>("Tomek", 2);
       // Pair<String, String> p2 = new OrderedPair<>("Tomek", "dwa");

        //boolean same = Util.compare(p1,p2);

        List<String> list = new ArrayList<>();
        list.add("jeden");
        list.add("dwa");
        list.add("trzy");
        printList(list);

        List<String> list3 = new LinkedList<>();
        list3.add(1,"a");


    }
    public static void printList (List<?> list) {
        for(e : list) {
            System.out.println(e + " ");
        }System.out.println();
    }


        //Pair<String, Box<Integer>> p3 = new OrderedPair<>("Alina", new Box());

     //  Box box = new Box();
      //  box.setObject(new Person("ada,","ccc","11");

       // String s = box.getObject();




*/
/*
    class Box<T> {
        private T object;

        public T getObject() {
            return object;
        }

        public void setObject (Object object) {
            this.object = object;

        }
        *//*





}
 interface Pair <K, V> {
    K getKey();
    V getValue();


    }



*/
/*


class OrderedPair<K,V> implements GenericTest.Pair {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public Object getKey() {
        return null;
    }

    @Override
    public Object getValue() {
        return null;
    }
}
*//*


*/
/*class Util {
    public static <K,V> boolean compare (GenericTest.Pair<K,V>p1 , GenericTest.Pair<K,V>p2) {
        return p1.getKey().equals(p2.getKey()) && p1
    }*//*


*/
