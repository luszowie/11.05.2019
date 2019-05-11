
import java.util.LinkedList;
import java.util.List;

public class PersonList {


    public static void main(String[] args) {



        List<Person> personList = new LinkedList();
        for (int i = 0; i < 100000; i++){
            personList.add(0, new Person ("Jan", "Nowak", "100"));
        }
        System.out.println(personList);
        System.out.println(personList.size());

        System.out.println("--------------");
        for (int i = 0; i <= 100000/2; i++) {
            //personList.removeFirst();
            //personList.removeLast();
            personList.remove(0);
            personList.remove(personList.size() - 1);
        }

            System.out.println(personList);
            System.out.println(personList.size());



    }
    
    





}
