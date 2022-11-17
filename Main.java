import java.util.*;
class Animal{
    public static void main(String[] args) {
        List<String>list_string =new ArrayList<String>();
        list_string.add("Rabbit");
        list_string.add("Rat");
        list_string.add("Cat");
        list_string.add("Dog");
        list_string.add("Parrot");
        list_string.forEach((n)->System.out.println("Animals are "+n));
    }
}