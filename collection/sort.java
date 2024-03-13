package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sort {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(55);
        nums.add(15);
        nums.add(20);
        nums.add(25);

        System.out.println("Element of List: "+nums);

        Collections.sort(nums);

        System.out.println("Element of sorted List: "+nums);

        List<Integer> nums1 = new ArrayList<>();
        nums1.add(54);
        nums1.add(55);
        nums1.add(17);
        nums1.add(20);
        nums1.add(28);

        // sorting according to the unit place of a number
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i%10>j%10) return 1;
                else return -1;
            }
        };

        // first parameter is list
        // second parameter is comparator where we will write our own logic for sorting
        Collections.sort(nums1, com);

        System.out.println("Sorted element according to unit place : "+nums1);
    }
}
