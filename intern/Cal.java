import java.util.Scanner;

class calc {
    calc(){
        // super();
        System.out.println("Inside constructor...");
    }
    public int add(int a, int b){
        return a+b;
    }

    public void show(){
        System.out.println("This is calc class.");
    }
}

class AdvCalc extends calc{

    @Override
    public int add(int a, int b){
        // method overriding from super class
        return a+b+5;
    }

    @Override
    public void show(){
        System.out.println("This is AdvCalc class.");
    }
}

public class Cal {
    public static void main(String[] args) {

        calc obj = new calc();
        int result = obj.add(5, 6);
        System.out.println(result);

        AdvCalc obj1 = new AdvCalc();

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int a = obj1.add(x,y);
        int b = obj1.add(x,y);

        System.out.println("Add function of Cal class: "+a);
        System.out.println("Add function of AdvCal: "+b);

        obj1.show();
        sc.close();
    }
}
