abstract class vechicle{

    abstract public void modelDrive();

    public void playMusic(){
        System.out.println("Music is Playing...");
    }
}

// inheritance
class swift extends vechicle{

    // data encapsulation
    private String name;
    private int price;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // abstraction
    public void modelDrive(){
        System.out.println("car is driving...");
    }

    public int maxSpeed(){
        return 120;
    }
}

public class car {
    public static void main(String[] args) {
        swift obj = new swift();
        int x = obj.maxSpeed();
        System.out.println("max speed is : "+ x);
        obj.playMusic();
        obj.modelDrive();

        // setter
        obj.setName("Swift");
        obj.setPrice(10000);

        // getter
        String name = obj.getName();
        int price = obj.getPrice();
        System.out.printf("%s : %d \n",name,price);

    }
}
