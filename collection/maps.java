package collection;

import java.util.HashMap;
import java.util.Map;

public class maps {
    public static void main(String[] args) {

        Map<String, Integer> student = new HashMap<>();

        // put is used to insert data in a map
        student.put("Harsh", 98);
        student.put("Ram", 54);
        student.put("Shyam", 75);
        student.put("Raju", 88);

        // to change value of a key we need to reEnter it
        // keys are unique and values are not so
        // keys are set and values are list

        student.put("Harsh", 99);

        System.out.println(student);

        System.out.println(student.keySet());

        for(String key : student.keySet()){
            System.out.printf("%s : %d\n",key,student.get(key));
        }
    }
}
