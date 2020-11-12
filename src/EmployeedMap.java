import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class EmployeedMap {
    public static void main(String[] args) throws IOException {
        HashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(1, "Olga");
        map.put(2, "Olena");
        map.put(3, "Viktoria");
        map.put(4, "Sofia");
        map.put(5, "Maria");
        map.put(6, "Lida");
        map.put(7, "Oksana");
        {System.out.println(map);}

        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            BufferedReader id = new BufferedReader((new InputStreamReader(System.in)));
            System.out.println("Enter ID");
            int b =Integer.parseInt(id.readLine());
            if( map.containsKey( b)){
                System.out.println("Yes, this ID exists" + value );
            }
            else {System.out.println("No, this ID doesn't exists");
            }

            BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
            System.out.println("Enter name");
            String  name = br.readLine();
            if(map.containsValue(name)){
                System.out.println("Yes, this name exists" + key);
            }
            else {System.out.println("No, this name doesn't exists"); }
        }
    }
}

