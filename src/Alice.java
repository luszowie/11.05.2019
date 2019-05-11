import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Alice {

    public static void main(String[] args) {

        try {
            List<String>list = Files.readAllLines(Paths.get("src/alice30.txt"));
            //System.out.println("Ilość linii: " + list.size());
            //System.out.println();
            Set<String> set = new TreeSet<>();


            for (String line : list) {
                line = line.replaceAll("\\p{Punct}|\\d"," ");
                //System.out.println(line);
                String[] words = line.split(" ");
                for (String word : words) {
                    //System.out.println(words + "|");
                if (!word.isEmpty()) {
                    set.add(word.toLowerCase());
                }
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Coś poszło nie tak przy wczytywaniu pliku");
            e.printStackTrace();
        }

        
        for (String word : set ) {
            System.out.println(word);
        }


       /* try {
            Set<String> set = new TreeSet<>(Files.readAllLines(Paths.get("src/alice30.txt")));
            System.out.println(set);

        } catch (IOException e) {
            System.out.println("Coś poszło nie tak przy wczytywaniu pliku");
            e.printStackTrace();
        }*/


        //
        /*Set<String> set = new TreeSet<>(); //sortowanie alfabetycnie
        set.add("Tomek");
        set.add("Zbyszek");
        set.add("Ala");

        for (String name : set) {
            System.out.println(name);
        }*/



    }
}
