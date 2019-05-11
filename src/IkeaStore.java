public class IkeaStore {

    public static void main(String[] args) {

        Chair chair1 = new Chair("Adde", "Ikea", 2016);
        Chair chair2 = new Chair("Janinge", "Ikea", 2016);
        Chair chair3 = new Chair("Adde", "Ikea", 2015);
        Chair chair4 = new Chair("Adde", "Ikea", 2016);


        System.out.println("chair1.equals(chair2): " + chair1.equals(chair2)); //false
        System.out.println("chair1.equals(chair3): " + chair1.equals(chair3)); //false
        System.out.println("chair1.equals(chair4): " + chair1.equals(chair4)); //true
        System.out.println("chair1.equals(null): " + chair1.equals(null)); //false

        System.out.println(chair1.hashCode()); //taki sam
        System.out.println(chair2.hashCode());
        System.out.println(chair3.hashCode());
        System.out.println(chair4.hashCode()); //taki sam


    }

}