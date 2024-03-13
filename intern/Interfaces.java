// Interface code

@FunctionalInterface
interface model{
    public void showing();
}

interface data{
    public void details();
}

class tesla implements data{
    public void details(){
        System.out.println("Showing details of tesla car..");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        model obj = new model() {
            
            @Override
            public void showing() {
                System.out.println("Within Functional interface.");
            }
        };

        // functional interface to lambda function
        model obj2 = ()-> System.out.println("This is a lamda fuction");

        tesla obj1 = new tesla();

        obj1.details();
        obj2.showing();
        obj.showing();
    }    
}
