import java.util.HashMap;
import java.util.LinkedList;

import java.util.Map;
import java.util.Set;

public class UserCollector {

    public static void main(String[] args) {


        Map<Integer, User> lista = new HashMap<>();
        lista.put(1, new User ("Jan", "Kowalski", 20));
        lista.put(2, new User("Adam", "Nowak", 21));
        lista.put(3, new User("Jan", "Nowak", 22));
        lista.put(4, new User("Jan", "Kowalski", 23));


        Set<Integer> keys = lista.keySet();
        System.out.println(lista.containsKey(1));
        System.out.println(lista.containsKey(2));
        for (User user : lista.values()) {
            System.out.println(lista);
        }



    }


}
