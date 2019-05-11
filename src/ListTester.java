import java.sql.SQLOutput;
import java.util.*;

public class ListTester {





    public static void main(String[] args) {

        List<String> myList = new LinkedList<>();
        myList = new LinkedList<>(Arrays.asList("a", "b", "c", "a"));

        System.out.println("występuje: " + Collections.frequency(myList,"b" + " razy"));
        System.out.println("występuje: " + Collections.frequency(myList,"a" + " razy"));

        /*myList.add("pierwszy");
        myList.add("drugi");
        myList.add("trzeci");
        myList.add("czwarty");

        System.out.println(myList);

        myList.add(0, "zerowy");
        myList.remove("drugi");

        System.out.println(myList);
*/








       /* List<Integer> myList = new ArrayList<>();

        myList = Arrays.asList(1,2,4,9,6,3,8);


        System.out.println(myList.size());

         for(int i = 0; i < myList.size(); i++ ) {
             System.out.println(myList.get(i));

         }

        System.out.println("---------------------------");

         for (Integer element : myList) {
             System.out.println(element);

         }

        System.out.println("---------------------------");

        //Iterator<Integer> iterator = myList.iterator();
        Iterator<Integer> iterator = myList.listIterator();

        //while(iterator.hasNext()) {
           // System.out.println("Liczba: " + iterator.next());
      //  }

        //System.out.println("---------------------------");

       // while(true) {
           // System.out.println("Liczba: " + iterator.next());
       // }

        *//*while(iterator.hasNext()) {
            Integer e = iterator.next();
            System.out.println("Liczba: " + iterator.next());
            if (e % 2 == 0) {
                System.out.println("P: " + e);
            }
        }
*//*






         *//* while (iterator.hasNext()) {
            if (iterator.next() == 7 ){
                iterator.remove();{
                    System.out.println(iterator.next());
                }
            }*//*








        //List myList = new ArrayList<>();
        //myList.add(123);
       // myList.add(4);
       // myList.add(1);
        //myList.add(new Object());
       // myList.add("siedem");

       *//* System.out.println(myList);
        System.out.println(myList.get(0));
        System.out.println(myList.remove(1));
        System.out.println(myList);
        System.out.println(myList.size());
        myList.clear();*//*

       // System.out.println(myList.get(0));
        //System.out.println(myList.get(1));
        //System.out.println(myList.get(2));

       // System.out.println((int)myList.get(0) + (String)myList.get(2));


    }*/
    }
}
