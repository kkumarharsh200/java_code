// Exception Handling code

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of a and b for division: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int nums[] = {1,2,5,4};

        int result=0;
        try{
            result = a/b;
            System.out.println("Enter the index of array: ");
            int index = sc.nextInt();
            System.out.printf("number at index %d is %d.\n",index,nums[index]);
        }
        catch(ArithmeticException e){
            System.out.println("Can not divide a number by 0.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index entered must be smaller than "+nums.length);
        }

        System.out.println("result of division is :"+result);
        sc.close();
    }
}
