import java.util.HashMap;
import java.util.Map;
public class Person {
    public static void main(String[] args) {
        HashMap<String,String> person = new HashMap<>();

        person.put("Bilyk","Olga");
        person.put("Vasylytsia","Olena");
        person.put("Kalytyn","Yana");
        person.put("Kharchos","Nastya");
        person.put("Sadova","Lida");
        person.put("Ravlinko","Roksolana");
        person.put("Smukovych","Natalya");
        person.put("Murmylo","Viktoria");
        person.put("Surotuyk","Marko");
        person.put("Melnyk","Arsen");

        for (Map.Entry<String, String> entry: person.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println( key + " " + value);}

        person.remove("Hug");{
            System.out.println("Updated personMap: " + person);}
    }
}

