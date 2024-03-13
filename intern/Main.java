// Threading code

class A extends Thread{
    public void run(){
        for(int i = 1;i<=10;i++){
            System.out.println("Inside class A " + i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i = 1;i<=10;i++){
            System.out.println("class B "+i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

public class Main{
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}