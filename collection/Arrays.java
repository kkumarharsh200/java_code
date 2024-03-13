package collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {

        Collection<Integer> list = new ArrayList<Integer>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);

        System.out.println(list);

        // List support index value while Collection doesn't

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(55);
        nums.add(15);
        nums.add(20);
        nums.add(25);

        System.out.println("Element of List: "+nums);

        Collections.sort(nums);

        System.out.println("Element of sorted List: "+nums);
        try{
        System.out.println("Element at index 5 is "+nums.get(3));
        }catch(IndexOutOfBoundsException e){
            System.out.println("Index is out of bound");
        }

        System.out.println("index of element 10 is "+nums.indexOf(10));
    }
}
