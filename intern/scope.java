
class Data{
    public String var = "global";

    Data(){
        System.out.println("Inside Data class constructor...");
    }
    public void show(){

        System.out.println("Global value of var: "+var);
    }

    public void show1(){
        String var = "local";
        System.out.println("Local value of var is :"+var);
    }
}

public class scope {
    public static void main(String[] args) {
        Data obj = new Data();
        obj.show();
        obj.show1();
    }
}
