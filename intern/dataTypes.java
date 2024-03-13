public class dataTypes {
    public static void main(String[] args) {
        int a = 5;
        double b = 5.4;
        char c = 'c';
        // boolean d = true;

        Integer num = a;

        System.out.printf("integer: %d, Double: %f, Char: %c \n",a,b,c);
        System.out.println(num);

        int nums[] = {8,9,7,5};
        for(int i : nums){
            System.out.println(i);
        }
    }
}
